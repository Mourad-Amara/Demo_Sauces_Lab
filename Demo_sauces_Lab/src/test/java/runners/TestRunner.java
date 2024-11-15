package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",  // Path to the feature files
    glue = {"stepDefinitions"},  // Path to the step definition classes
    plugin = {
        "pretty",  // Provides a readable format on the console
        "json:target/cucumber-reports/CucumberTestReport.json"  // Generates a JSON report
    },
    tags = "@loginTest"  // Optional: specify tags for the test cases to run
)
public class TestRunner {
}