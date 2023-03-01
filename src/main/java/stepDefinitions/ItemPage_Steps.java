package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ItemPage_Steps {
    private WebDriver driver;

    @Before
    public void setup(){
        driver = DriverManager.getDriver();
    }
    @After
    public void tearDown() {
        // this should be calling the mgr
    }

    @Given("I am a customer on a product page for {string} that I selected from search")
    public void i_am_a_customer_on_a_product_page_for_that_i_selected_from_search(String string) {
        driver.get("https://www.amazon.com");
        driver.findElement(By.cssSelector("#nav-signin-tooltip > a > span")).click();
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("9542789769");
        driver.findElement(By.cssSelector("#continue")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofNanos(20000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ap_password")));
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("tESTTeSTTEsT");
        driver.findElement(By.cssSelector("#signInSubmit")).click();
        driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("gold toe men's socks");
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
        driver.findElement(By.cssSelector("#search > div.s-desktop-width-max.s-desktop-content.s-wide-grid-style-t1.s-opposite-dir.s-wide-grid-style.sg-row > div.sg-col-20-of-24.s-matching-dir.sg-col-16-of-20.sg-col.sg-col-8-of-12.sg-col-12-of-16 > div > span.rush-component.s-latency-cf-section > div.s-main-slot.s-result-list.s-search-results.sg-row > div:nth-child(3) > div > div > div > div > div > div > div.a-section.a-spacing-small.puis-padding-left-micro.puis-padding-right-micro > div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a > span")).click();
        boolean socks = driver.findElement(By.cssSelector("#productTitle")).getText().contains("socks");
    }
    @When("I select the size")
    public void i_select_the_size() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I can select buy now")
    public void i_can_select_buy_now() {
        driver.findElement(By.cssSelector("#buy-now-button")).click();
    }

}
