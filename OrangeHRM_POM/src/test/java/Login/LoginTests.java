package Login;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setUp.setUps;

public class LoginTests extends setUps {
   @Test (priority = 1)
    public void testVerifyCompanyLogo(){
       loginPage.verifyCompanyLogo();
   }

   @Test(priority = 2)
   public void testVerifyForgotPassword(){
       loginPage.verifyForgotPassword();
   }

   @Test (priority = 3)
    public void testVerifyLoginPanel(){
        loginPage.verifyLoginPanel();
    }

    @Test (priority = 4)
    public void testVerifyPageTitle(){
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        DashboardPage dashboardPage = loginPage.clickLoginButton();
        String pageTitle= "OrangeHRM";
           if (pageTitle.equalsIgnoreCase("OrangeHRM")){
               System.out.println("The page title is " + pageTitle);
        } else {
               System.out.println("The page title is incorrect. Actual oage title is " +pageTitle);
        }
    }
}
