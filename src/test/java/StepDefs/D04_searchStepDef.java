package StepDefs;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    HomePage homePage = new HomePage();
    SoftAssert softAssert = new SoftAssert();

    @When("searching for product using product name {string}")
    public void searchingForProductUsingProductName(String productname) {
        homePage.searchProduct(productname);
    }

    @Then("search shows relevant results {string}")
    public void searchShowsRelevantResults(String productname) {
        String currentURL= TestBase.driver.getCurrentUrl();
        softAssert.assertTrue(currentURL.contains("https://demo.nopcommerce.com/search?q="),"url changed");
        int size = homePage.getProductList().size();
        System.out.println("number of items " + size);
        for(int i=0;i<size ;i++){
            softAssert.assertTrue(homePage.getProductList().get(i).getText().toLowerCase().contains(productname),"product " + i);

        }
        softAssert.assertAll();
    }

    @When("searching for product using product sku {string}")
    public void searchingForProductUsingProductSku(String productsku) {
        homePage.searchProduct(productsku);
    }

    @Then("search shows relevant products {string}")
    public void searchShowsRelevantProducts(String productsku) {
    softAssert.assertTrue(homePage.getProduct().getText().contains(productsku),"product sku");
    }
}
