package utilities;

import io.appium.java_client.AppiumDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Properties;

public class Hooks {

    AppiumDriver driver;
    Properties properties;

    @BeforeClass
    public void before () {
        String browser = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        properties= ConfigReader.initialize_Properties();
        driver = DriverFactory.initialize_Driver(browser);
    }

    @AfterClass
    public void after () {
        driver.quit();
    }
}
