package BasePage;

import PageObject.SignedinHomePage;
import PageObject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BasePage {


    public static LoginPage loginPage;
    public static SignedinHomePage signedinHomePage;
    //create Page Object


    protected WebDriver driver;
    //create a Webdriver Object


    @BeforeTest

    public void BasePage(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
//Importing chromedriver
        driver = new ChromeDriver();
//Instatiating a webdriver object
        driver.manage().window().maximize();
//Maximize the window
        driver.get("https://qa-frontend.ebanqo.io");
//Launch application URL
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//Wait 5 seconds
        loginPage = new LoginPage (driver);
        signedinHomePage = new SignedinHomePage(driver);
//Instantiate loginpage and loginhomepage

    }


    @AfterTest

    public void closeBrowser(){
        driver.quit();
        //Close the window and quit the session
    }
}
