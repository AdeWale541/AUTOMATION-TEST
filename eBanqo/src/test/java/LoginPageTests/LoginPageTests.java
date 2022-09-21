package LoginPageTests;

import BasePage.BasePage;
import BasePageTests.BasePageTests;
import PageObject.SignedinHomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTests extends BasePageTests {


    void setEmail() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.enterAddress("torej27282@hapremx.com");
    }

    private void setPassword() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.enterPassword("Blonde77@1");
    }

    @Test(priority = 3)

    public void TestLoginPageTitle() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.clickLoginButton();
        setEmail();
        setPassword();
        Thread.sleep(2000);
        SignedinHomePage signedinHomePage = loginPage.clickLoginButton();
        Thread.sleep(2000);
        String pageTitle = "eBanqo Messenger";

        if (loginPage.driver.getTitle().contains(pageTitle)) {
            System.out.println("The Sign Up Page page title is correct. Page Title is " + pageTitle);
        } else {
            System.out.println("The Sign Up Page page title is incorrect. Actual page title is " + loginPage.driver.getTitle());
        }
    }

    @Test(priority = 4)
    public void TestVerifyAssertPageURL() throws InterruptedException {
        String loginURL = "https://qa-frontend.ebanqo.io/d/home";

        loginPage.getLoginHomePageUrl();

        Assert.assertEquals(loginPage.driver.getCurrentUrl(), loginURL, "You have successfully logged in");
        if (loginPage.driver.getCurrentUrl().contains(loginURL)) {
            System.out.println("The Sign Up Page page URL is correct. URL is " + loginURL);
        } else {
            System.out.println("The Sign Up Page URL is incorrect. Actual page URL is " + loginPage.driver.getCurrentUrl());
        }
        Thread.sleep(4000);
    }





        @Test(priority = 5)
        public static SignedinHomePage TestReturnSignedInHomePage () {
            return signedinHomePage;
        }


    }