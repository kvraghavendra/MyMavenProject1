package stepdefination;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pageobjects.NewToursLogin;
import pageobjects.NewToursLogin1;
import sun.tools.tree.NewArrayExpression;

import static stepdefination.HooksTest.myDriver;

public class WebClassStepDefination {

    @Given("^Launch the Chrome browser$")
    public void launch_the_Chrome_browser() {
        System.out.println("Launching Chrome WebPage");

    }

    @Given("^I launch the application$")
    public void i_launch_the_application() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Launching Newtour Website");
        myDriver.get("http://newtours.demoaut.com");


    }

    @When("^I enter correct username and password and login$")
    public void i_enter_correct_username_and_password_and_login()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Enter Valid Creditials");
//        NewToursLogin loginNewTour= new NewToursLogin();
//        loginNewTour.newTourlogin("harigopal","mercury",myDriver);

        PageFactory.initElements(myDriver, NewToursLogin1.class);
        new NewToursLogin1().loginNewTours();

    }


    @Then("^I am login into application$")
    public void i_am_login_into_application()  {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Logged into the Newtours Website");
//        Assert.assertEquals(true, myDriver.getTitle().contains(websiteName));
    //    new CapScreenShot().capScrSht(myDriver,"Goolefile");


    }




}

