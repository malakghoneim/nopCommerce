package StepDefs;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    HomePage homePage = new HomePage();
    WebDriverWait wait = new WebDriverWait(TestBase.driver, Duration.ofSeconds(10));
    @When("clicking on slider")
    public void clickingOnSlider() {
     homePage.clickOnSlider();
    }


    @Then("user is directed to nokia lumia url")
    public void userIsDirectedToNokiaLumiaUrl() {

        wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/nokia-lumia-1020"));
    }

    @Then("user is directed to iphone url")
    public void userIsDirectedToIphoneUrl() {
        wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/iphone-6"));
    }
}
