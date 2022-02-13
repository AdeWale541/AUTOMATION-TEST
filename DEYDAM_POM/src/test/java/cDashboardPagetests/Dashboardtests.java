package cDashboardPagetests;

import bloginPagetests.LoginPagetests;
import org.testng.annotations.Test;

public class Dashboardtests extends LoginPagetests {

    @Test(priority = 5)
    public void testVerifyCompanyImage(){
        dashboardPage.verifyCompanyImage();
        System.out.println("Company Image has been verified");
    }
    @Test (priority = 6)
    public void testVerifyDashboardTest(){
        dashboardPage.verifyDashboardTest();
        System.out.println("Dashboard test has been verified");
    }

    @Test (priority = 7)
    public void testLogout() throws InterruptedException{
        dashboardPage.clickLogout();
        Thread.sleep(4000);
        System.out.println("Logout was successful");
    }


}
