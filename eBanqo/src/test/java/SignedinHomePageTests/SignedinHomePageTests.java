package SignedinHomePageTests;

import LoginPageTests.LoginPageTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignedinHomePageTests extends LoginPageTests {


    @Test(priority = 6)
    public void TestVerifySuccessfullogout() throws InterruptedException{
        Thread.sleep(5000);
        signedinHomePage.clickLogoutBtn();
         Thread.sleep(5000);

         String finalURL = "https://qa-frontend.ebanqo.io/";

        Assert.assertEquals(signedinHomePage.driver.getCurrentUrl(), finalURL, "You have successfully logged out");
        if (loginPage.driver.getCurrentUrl().contains(finalURL)) {
            System.out.println("You successfully logged out");
        } else {
            System.out.println("YOu were not able to log out ");
        }
    }
}