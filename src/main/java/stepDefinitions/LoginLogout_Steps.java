package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class LoginLogout_Steps {

    private WebDriver driver;

    @Before
    public void setup(){
        driver = DriverManager.getDriver();
    }
    @After
    public void tearDown() {
        // this should be calling the mgr
    }

        @Given("I am a customer who has navigated to the amazon.com website")
        public void i_am_a_customer_who_has_navigated_to_the_amazon_com_website () {
            driver.get("https://www.amazon.com");
        }
        @When("I navigate to sign in")
        public void i_navigate_to_sign_in () {
            driver.findElement(By.cssSelector("#nav-signin-tooltip > a > span")).click();
        }
        @Then("I can input my username and password to successfully login")
        public void i_can_input_my_username_and_password_to_successfully_login () {
           driver.findElement(By.cssSelector("#ap_email")).sendKeys("9542789769");
           driver.findElement(By.cssSelector("#continue")).click();
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofNanos(20000));
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ap_password")));
           driver.findElement(By.cssSelector("#ap_password")).sendKeys("tESTTeSTTEsT");
           driver.findElement(By.cssSelector("#signInSubmit")).click();
           driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
    }
}
