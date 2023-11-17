package Pages;

import StepDefs.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
  public void selectGender(String id)
  {
    TestBase.driver.findElement(By.id(id)).click();
  }

  public void enterFirstName(String firstname)
  {
   TestBase.driver.findElement(By.id("FirstName")).sendKeys(firstname);
  }
  public void enterLastName(String lastname)
  {
    TestBase.driver.findElement(By.id("LastName")).sendKeys(lastname);
  }

  public void selectDOB(String day,String month,String year)
  {
    Select DayDropdown = new Select(TestBase.driver.findElement(By.name("DateOfBirthDay")));
    DayDropdown.selectByValue(day);

    Select MonthDropdown = new Select(TestBase.driver.findElement(By.name("DateOfBirthMonth")));
    MonthDropdown.selectByValue(month);

    Select YearDropdown = new Select(TestBase.driver.findElement(By.name("DateOfBirthYear")));
    YearDropdown.selectByValue(String.valueOf(Integer.parseInt(year)));


  }

  public void enterEmail(String email)
  {
    TestBase.driver.findElement(By.id("Email")).sendKeys(email);
  }

  public void enterCompanyName(String company)
  {
    TestBase.driver.findElement(By.id("Company")).sendKeys(company);
  }
  public void enterPassword(String password)
  {
    TestBase.driver.findElement(By.id("Password")).sendKeys(password);
  }
  public void confirmPassword(String password)
  {
    TestBase.driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
  }

  public void clickRegister()
  {
    TestBase.driver.findElement(By.id("register-button")).click();
  }
public String successMessage()
{
WebElement element =TestBase.driver.findElement(By.xpath("//*[contains(text(), 'Your registration completed')]"));
return element.getText();
}

}
