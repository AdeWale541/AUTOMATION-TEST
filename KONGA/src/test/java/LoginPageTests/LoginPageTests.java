package LoginPageTests;

import BasePage.BasePage;
import PageObject.SignedinHomePage;
import org.testng.annotations.Test;

public class LoginPageTests extends BasePage {


    void setEmail() throws InterruptedException{
        Thread.sleep(2000);
        loginPage.enterUsername("testade567@gmail.com");
    }

    private void setPassword() throws InterruptedException{
        Thread.sleep(2000);
        loginPage.enterPassword("testade1234");
    }

    @Test(priority = 1)

    public void TestLoginPageTitle() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.clickLoginmenu();
        setEmail();
        setPassword();
        Thread.sleep(2000);
        SignedinHomePage signedinHomePage = loginPage.clickLoginButton();
        Thread.sleep(2000);
        String pageTitle = "Konga";

        if (loginPage.driver.getTitle().contains(pageTitle)) {
            System.out.println("The page title is " + pageTitle);
        } else {
            System.out.println("The page title is incorrect. Actual page title is " + loginPage.driver.getTitle());
        }
    }

    @Test(priority = 1)
    public static SignedinHomePage TestReturnSignedInHomePage(){
        return signedinHomePage;
    }
}
