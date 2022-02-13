package setUp;

import PageObject.DashboardPage;
import PageObject.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;

public class setUps {




    public static LoginPage loginPage;
    public static DashboardPage dashboardPage;

    private WebDriver driver;



    @BeforeTest

    public void setUps2(){

       System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        loginPage = new LoginPage (driver);
        dashboardPage = new DashboardPage(driver);
    }


    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }


}
