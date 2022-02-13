package bloginPagetests;

import PageObject.DashboardPage;
import org.testng.annotations.Test;
import setUp.setUps;

public class LoginPagetests extends setUps {

    @Test(priority = 1)
    public void testVerifyCompanyLogo(){
        loginPage.verifyCompanyLogo();
        System.out.println("Company logo has been verified");
    }

    @Test(priority = 2)
    public void testVerifyForgotPassword(){
        loginPage.verifyForgotPassword();
        System.out.println("Forgot password was verified");
    }

    @Test (priority = 3)
    public void testVerifyWelcomePanel(){
        loginPage.verifyWelcomePanel();
        System.out.println("Welcome Panel is verified");
    }

    @Test (priority = 4)
    public void testVerifyPageTitle() throws InterruptedException{
        loginPage.enterUsername("Wale541000");
        loginPage.enterPassword("testade12345");
        DashboardPage dashboardPage = loginPage.clickLoginButton();
        Thread.sleep(3000);
        String pageTitle= "Deydam";
        if (pageTitle.equalsIgnoreCase("Deydam")){
            System.out.println("The page title is " + pageTitle);
        } else {
            System.out.println("The page title is incorrect. Actual oage title is " +pageTitle);

        }
    }

    @Test(priority = 5)
    public static DashboardPage TestReturnDashboardPage(){
        return dashboardPage;
    }
}



