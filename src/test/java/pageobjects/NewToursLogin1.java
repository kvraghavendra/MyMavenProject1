package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

public class NewToursLogin1 {
    @FindBy(xpath="//Input[@name='userName']")
   static  WebElement userName;


    @FindBy(xpath ="//Input[@name='password']")

    static  WebElement passWord;

    @FindBy(xpath = "//input[@value='Login']")

    static  WebElement login;

    public void loginNewTours() {

        userName.sendKeys("raghav");
        passWord.sendKeys("mercury");
        login.click();
    }
}



