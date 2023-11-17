package StepDefs;

import Pages.HomePage;
import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D01_registerStepDef {
    HomePage homePage = new HomePage();
    RegisterPage regPage = new RegisterPage();
    @Given("user navigates to home page")
    public void user_navigates_to_home_page()
    {
        TestBase.driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @When("clicking on Register button")
    public void clickingOnRegisterButton() {
     homePage.clickRegister();
    }

    @And("user selects gender {string}")
    public void userSelectsGender(String gender) {
        regPage.selectGender(gender);
    }

    @And("user enters first name {string}")
    public void userEntersFirstName(String firstname) {
        regPage.enterFirstName(firstname);
    }

    @And("user enters last name {string}")
    public void userEntersLastName(String lastname) {
        regPage.enterLastName(lastname);
    }

    @And("user selects date of birth {string} {string} {string}")
    public void userSelectsDateOfBirth(String day, String month, String year) {
        regPage.selectDOB(day,month,year);
    }

    @And("user enters email {string}")
    public void userEntersEmail(String email) {
        regPage.enterEmail(email);
    }

    @And("user enters company name {string}")
    public void userEntersCompanyName(String company) {
        regPage.enterCompanyName(company);
    }

    @And("user enters password {string}")
    public void userEntersPassword(String password) {
        regPage.enterPassword(password);
    }

    @And("user confirms password {string}")
    public void userConfirmsPassword(String password) {
        regPage.confirmPassword(password);
    }

    @And("user clicks on register")
    public void userClicksOnRegister() {
        regPage.clickRegister();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        Assert.assertTrue(regPage.successMessage().contains("Your registration completed"));
    }


}
