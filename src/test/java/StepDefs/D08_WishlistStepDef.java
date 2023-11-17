package StepDefs;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D08_WishlistStepDef {
    HomePage homePage = new HomePage();
    SoftAssert softAssert = new SoftAssert();
    @When("clicking on add to wishlist")
    public void clickingOnAddToWishlist() {
      homePage.clickOnAddToWishlist();
    }

    @Then("success msg is displayed")
    public void successMsgIsDisplayed() {
        softAssert.assertTrue(homePage.sucessMsg().isDisplayed());
       String color= homePage.sucessMsg().getCssValue("background-color");
       String backgroundColor = Color.fromString(color).asHex();
       softAssert.assertTrue(backgroundColor.equals("#4bb07a"));
       softAssert.assertAll();
    }

    @Then("Qty value is greater than zero")
    public void qtyValueIsGreaterThanZero() throws InterruptedException {
        Assert.assertTrue(homePage.wishlistQuantity()>0,"quantity greater than zero");
    }
}
