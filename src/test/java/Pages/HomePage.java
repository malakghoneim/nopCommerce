package Pages;

import StepDefs.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HomePage {
    List<WebElement> currencyList  = new ArrayList<>();
    List<WebElement> productList  = new ArrayList<>();

    WebDriverWait wait = new WebDriverWait(TestBase.driver, Duration.ofSeconds(10));

    public void clickRegister(){
        TestBase.driver.findElement(By.xpath("//a[@href='/register?returnUrl=%2F']")).click();
    }
    public void clickLogin(){
        TestBase.driver.findElement(By.xpath("//a[@href='/login?returnUrl=%2F']")).click();
    }
    public void selectEuro(){
        Select currencyDropdown = new Select(TestBase.driver.findElement(By.id("customerCurrency")));
        currencyDropdown.selectByVisibleText("Euro");
    }
    public List<WebElement> checkEuroSymbol(){
            currencyList = TestBase.driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        return currencyList;
    }

    public void searchProduct(String productname){
    TestBase.driver.findElement(By.id("small-searchterms")).sendKeys(productname);
    TestBase.driver.findElement(By.xpath("//button[@class='button-1 search-box-button']")).click();
    }

    public List<WebElement> getProductList(){
        return productList = TestBase.driver.findElements(By.className("product-title"));

    }
    public WebElement getProduct(){
        TestBase.driver.findElement(By.className("product-title")).click();
        return TestBase.driver.findElement(By.xpath("//div[@class='sku']"));
    }

    public void hoverAndSelectCategory(){
        Actions actions = new Actions(TestBase.driver);
        WebElement menu = TestBase.driver.findElement(By.xpath("//ul[@class='top-menu notmobile']"));
        actions.moveToElement(menu.findElement(By.xpath("//a[@href='/computers']")));
        actions.moveToElement(menu.findElement(By.xpath("//a[@href='/desktops']")));
        actions.click().build().perform();
    }

    public WebElement getPageTitle() throws InterruptedException {
        Thread.sleep(2000);
        return TestBase.driver.findElement(By.className("page-title"));
    }

    public void clickOnSlider(){
        TestBase.driver.findElement(By.id("nivo-slider")).click();
    }

    public void clickOnLink(String link){
        TestBase.driver.findElement(By.className(link)).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        ArrayList<String> tabs = new ArrayList<>(TestBase.driver.getWindowHandles());
        TestBase.driver.switchTo().window(tabs.get(1));

    }

    public void clickOnAddToWishlist(){
        WebElement product = TestBase.driver.findElement(By.xpath("//div[@data-productid='18']"));
        product.findElement(By.xpath(".//button[@class='button-2 add-to-wishlist-button']")).click();
    }

    public WebElement sucessMsg(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='bar-notification success']")));
        return TestBase.driver.findElement(By.xpath("//div[@class='bar-notification success']"));
    }

    public int wishlistQuantity() throws InterruptedException {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='bar-notification success']")));
        TestBase.driver.findElement(By.xpath("//span[@class='wishlist-label']")).click();
        Thread.sleep(4000);
        int value = Integer.parseInt(TestBase.driver.findElement(By.xpath("//input[@class='qty-input']")).getAttribute("value"));
        return value;
    }

}
