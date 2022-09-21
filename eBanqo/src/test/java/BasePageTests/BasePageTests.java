package BasePageTests;

import BasePage.BasePage;
import org.testng.annotations.Test;

public class BasePageTests extends BasePage {

    @Test(priority = 1)
    public void TestBasePageURL() throws InterruptedException {
        String pageURL = "https://qa-frontend.ebanqo.io/";

        Thread.sleep(4000);

        if (driver.getCurrentUrl().contains(pageURL)) {
            System.out.println("The Base Page URL is correct. Webpage URL is " + pageURL);
        } else {
            System.out.println("Invalid URL on the Base Page, Actual webpage URL is " + driver.getCurrentUrl());
        }
    }

    @Test(priority = 2)
    public void TestBasePageTitle() throws InterruptedException {
        String pageTitle = "eBanqo Messenger";

        Thread.sleep(4000);

        if (  driver.getTitle().contains(pageTitle)) {
            System.out.println("The webpage Title on the Base Page is correct. Webpage Title is " + pageTitle);
        } else {
            System.out.println("Invalid URL on the Base Page, Actual webpage URL is " + driver.getTitle());
        }
    }


}
