package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewToursLogin {

   WebElement newTourLogin;
   WebElement newTourHome;

   public WebElement captureUserNameInput(WebDriver driver){

       return driver.findElement(By.xpath("//Input[@name='userName']"));
   }

   public WebElement captureUserPassword(WebDriver driver){

       return driver.findElement(By.xpath("//Input[@name='password']"));
   }

    public WebElement captureLoginButton(WebDriver driver){

        return driver.findElement(By.xpath("//input[@value='Login']"));
    }

public void newTourlogin(String user,String password,WebDriver driver){

       captureUserNameInput(driver).sendKeys(user);
       captureUserPassword(driver).sendKeys(password);
       captureLoginButton(driver).click();


}

}
