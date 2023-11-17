package StepDefs;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {
    HomePage homePage = new HomePage();

    @When("hovering on main category and select sub category")
    public void hoveringOnMainCategoryAndSelectSubCategory() {
        homePage.hoverAndSelectCategory();
    }

    @Then("sub category title contains selected sub category")
    public void subCategoryTitleContainsSelectedSubCategory() throws InterruptedException {
       String title =  homePage.getPageTitle().getText().toLowerCase().trim();
        Assert.assertTrue(title.contains("desktops"));
    }
}
