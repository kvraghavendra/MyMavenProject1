package stepdefination;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class HooksTest {

    static WebDriver myDriver;
    ConfigFileReader myConfig = new ConfigFileReader();

    @Before
    public void beforeMethod() throws InterruptedException {

//      System.setProperty("webdriver.chrome.driver", "/Users/raghav/IdeaProjects/MyMavenProject1/chromedriver");
//      System.setProperty("webdriver.chrome.driver",myConfig.getDriverPath());
      System.setProperty("webdriver.chrome.driver",myConfig.getValueForKey("driverPath"));
        myDriver = new ChromeDriver();

        sleep(3*5000);

    }

    @After
    public void afterMethod(){

 //    myDriver.quit();

    }
}
