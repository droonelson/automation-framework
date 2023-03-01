package stepDefinitions;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}