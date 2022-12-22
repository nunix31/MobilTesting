package testRunners;


import io.appium.java_client.AppiumDriver;
import io.cucumber.junit.CucumberOptions;
import utilities.DriverFactory;

@CucumberOptions (

        features = {"src/test/java/features"},
        glue = {"StepDefinitions", "utilities"},
        tags = "",
        plugin = {
                "summary","pretty","html:Reports/CucumberReport/Reports.html"
        }
)


public class runner {
        static AppiumDriver driver = DriverFactory.getDriver();
}
