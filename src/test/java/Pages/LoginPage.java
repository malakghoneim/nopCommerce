package Pages;

import StepDefs.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public void enterEmail(String email)
    {
        TestBase.driver.findElement(By.id("Email")).sendKeys(email);
    }
    public void enterPassword(String password)
    {
        TestBase.driver.findElement(By.id("Password")).sendKeys(password);
    }

    public void clickLogin(){
        TestBase.driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
        //TestBase.driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
    }
    public WebElement myAccountElement(){
       //return TestBase.driver.findElement(By.xpath("//a[@class='ico-account']"));
        return TestBase.driver.findElement(By.className("ico-account"));
     }

    public WebElement errorMessage(){
        return TestBase.driver.findElement(By.xpath("//*[contains(text(), 'Login was unsuccessful')]"));
    }
}
