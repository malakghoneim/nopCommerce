package StepDefs;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D03_currenciesStepDef {
    HomePage homePage = new HomePage();

    @When("clicking on currencies drop down and choose euro")
    public void clickingOnCurrenciesDropDownMenuAndChooseEuro() {
     homePage.selectEuro();
    }


    @Then("euro symbol is shown on all displayed products")
    public void euroSymbolIsShownOnAllDisplayedProducts() {
        for(int i=0;i<4;i++){
            Assert.assertTrue(homePage.checkEuroSymbol().get(i).getText().contains("€"));
        }

    }
}
