package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class MainScreen_Steps {
    private WebDriver driver;
    @Before
    public void setup(){
        driver = DriverManager.getDriver();
    }

    @Given("I am an amazon customer who has logged in")
    public void i_am_an_amazon_customer_who_has_logged_in() {
        driver.get("https://www.amazon.com");
        driver.findElement(By.cssSelector("#nav-signin-tooltip > a > span")).click();
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("9542789769");
        driver.findElement(By.cssSelector("#continue")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofNanos(20000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ap_password")));
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("tESTTeSTTEsT");
        driver.findElement(By.cssSelector("#signInSubmit")).click();
        driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
    }
    @When("I input {string} into the search bar")
    public void i_input_into_the_search_bar(String string) {
       driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("gold toe men's socks");
    }
    @And("I select search")
    public void i_select_search() {
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
    }
    @Then("I can select a pair of socks")
    public void i_can_select_a_pair_of_socks() {
       driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(3) > div > div > div > div > div > div > div.a-section.a-spacing-small.puis-padding-left-micro.puis-padding-right-micro > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a > span")).click();
    }
    @Then("I can navigate to the product page by clicking on the socks\"")
    public void i_can_navigate_to_the_product_page_by_clicking_on_the_socks() {
        boolean socks = driver.findElement(By.cssSelector("#productTitle")).getText().contains("socks");
    }

}
