package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(className = "inventory_list")
    private WebElement inventoryList;

    public boolean isHomePageDisplayed() {
        return inventoryList.isDisplayed();
    }
}