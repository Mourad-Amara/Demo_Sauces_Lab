package stepDefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;



public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;

    // Constructor to initialize the driver
    public LoginSteps() {
        this.driver = Hooks.getDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Given("the user navigates to the login page")
    public void givenUserIsOnLoginPage() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("the user enters {string} and {string}")
    public void whenUserEntersCredentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("clicks on the login button")
    public void whenUserClicksLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("the user should see the homepage")
    public void thenUserShouldSeeHomepage() {
        assertTrue("Homepage is not displayed", homePage.isHomePageDisplayed());
    }
}