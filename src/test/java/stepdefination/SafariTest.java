package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {

    public static void main(String[] args) {

        WebDriver mySafari = new SafariDriver();

        mySafari.get("http://newtours.demoaut.com");

        System.out.println("I am in Newtours website");

    }
}
