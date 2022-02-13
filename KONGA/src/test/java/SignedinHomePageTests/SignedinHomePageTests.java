package SignedinHomePageTests;

import LoginPageTests.LoginPageTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignedinHomePageTests extends LoginPageTests {


    @Test(priority = 1)
    public void TestVerifyAssertLoginPopup() {
        signedinHomePage.VerifyLoginPopup();
        System.out.println("The login Popup was displayed");
    }

    @Test(priority = 1)
    public void TestVerifyAssertPageURL() throws InterruptedException {
        String loginURL = "https://www.konga.com/";
        Assert.assertEquals(signedinHomePage.getLoginHomePageUrl(), loginURL, "You have successfully logged in");
        Thread.sleep(4000);
        System.out.println("You have successfully logged in. Login page URL is " + signedinHomePage.driver.getCurrentUrl());
    }


    @Test(priority = 2)
    public void TestVerifyAssertname() throws InterruptedException {
        signedinHomePage.clickProfileBtn();
        Thread.sleep(4000);
        if (signedinHomePage.driver.getPageSource().contains("Test")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }
    }

    @Test(priority = 2)
    public void TestVerifyGetPagetitle() throws InterruptedException {
        signedinHomePage.clickCategoriesbtn();
        Thread.sleep(2000);
    String PageTitle = signedinHomePage.driver.getTitle();
        System.out.println("The page title is " +PageTitle);
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void TestVerifyAssertitems(){

        if (signedinHomePage.driver.getPageSource().contains("Computing Accessories")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        if (signedinHomePage.driver.getPageSource().contains("PC Gaming")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        if (signedinHomePage.driver.getPageSource().contains("Computer")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        if (signedinHomePage.driver.getPageSource().contains("Desktop and Monitors")) {
            System.out.println("Text is present");
        } else {
            System.out.println("Text is absent");
        }

        if (signedinHomePage.driver.getPageSource().contains("Laptops")) {
            print("Text is present \n ALL ITEMS ARE PRESENT");
        } else {
            print("Text is absent");
        }


    }

    void print(String text){
        System.out.println(text);
    }

    @Test(priority = 7)
    public void TestVerifySuccessfullogout() throws InterruptedException{
        Thread.sleep(20000);
        signedinHomePage.clickLogoutBtn();
         Thread.sleep(20000);
         String finalURL = signedinHomePage.driver.getCurrentUrl();
       System.out.println("Your account auccessfully logged out. Page URL is " +finalURL);

    }
}