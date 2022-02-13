package Dashboard;

import Login.LoginTests;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pageObjects.DashboardPage;

public class DashboardTests extends LoginTests {


 @Test (priority = 5)
    public void testverifycompanyImage(){
         dashboardPage.verifyCompanyImage();
     }


 }

