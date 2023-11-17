package StepDefs;

import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    SoftAssert softassert = new SoftAssert();


    @When("clicking on login button")
    public void clickingOnLoginButton() throws InterruptedException {
    homePage.clickLogin();

    }

    @And("user enters registered email {string}")
    public void userEntersRegisteredEmail(String email) {
        loginPage.enterEmail(email);
    }
    @And("user enters registered password {string}")
    public void userEntersRegisteredPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("user clicks on login")
    public void userClicksOnLogin() throws InterruptedException {

        loginPage.clickLogin();
    }


    @Then("user login to system successfully")
    public void userLoginToSystemSuccessfully() throws InterruptedException {
        Thread.sleep(5000);
        String currentURL= TestBase.driver.getCurrentUrl();
        softassert.assertTrue(loginPage.myAccountElement().isDisplayed(),"my account element is dislayed");
        softassert.assertTrue(currentURL.equals("https://demo.nopcommerce.com/"),"url changed");
        softassert.assertAll();

    }

    @Then("user can not login")
    public void userCanNotLogin() throws InterruptedException {
        Thread.sleep(5000);
        softassert.assertTrue(loginPage.errorMessage().isDisplayed(),"error msg is displayed");
        String color = loginPage.errorMessage().getCssValue("color");
        String msgColor= Color.fromString(color).asHex();
        softassert.assertTrue(msgColor.equals("#e4434b"),"color is red");
        softassert.assertAll();
    }
}

