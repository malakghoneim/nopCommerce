package StepDefs;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D07_followUsStepDef {
    HomePage homePage = new HomePage();
    SoftAssert softAssert = new SoftAssert();
    @When("clicking on link {string}")
    public void clickingOnLink(String link) {
        homePage.clickOnLink(link);
    }

    @Then("url is changed {string}")
    public void urlIsChanged(String url) throws InterruptedException {
        Thread.sleep(5000);
        softAssert.assertTrue(TestBase.driver.getCurrentUrl().equals(url));
        softAssert.assertAll();
    }


}
