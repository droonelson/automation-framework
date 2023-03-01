package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class CheckoutScreen_Steps {
    @Before
    public void setup(){
        //driver = DriverManager.getDriver();
    }
    @After
    public void tearDown() {
        // this should be calling the mgr
    }
    @Then("I can place the order")
    public void i_can_place_the_order() {
        throw new io.cucumber.java.PendingException();
    }
    @Then("I can see the order confirmation")
    public void i_can_see_the_order_confirmation() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
