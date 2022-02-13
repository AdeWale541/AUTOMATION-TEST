package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Deydamlogin {

    private WebDriver driver;

    @BeforeClass
    public void setUp() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 0)
    public void testSuccessfulLogin() throws InterruptedException {

        driver.findElement (By.id("username")).sendKeys("WALE5410");
        driver.findElement (By.id("password")).sendKeys("testade1234");
        driver.findElement (By.xpath ("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click ();
        Thread.sleep(5000);
        if (driver.getCurrentUrl ().contains ("https://dev.d2rxvhrryr2bkn.amplifyapp.com/app/feed"))
            System.out.println("The page URL contains /app/feed");
        else
        System.out.println ("The page URL does not contain /app/feed");
    }

    @Test(priority = 1)
    public void testLogout()throws InterruptedException {
        driver.findElement (By.xpath ("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/button/img\n")).click ();
        Thread.sleep(2000);
        driver.findElement (By.xpath ("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/div/div/a[3]/p")).click ();

        Thread.sleep(5000);
        if (driver.getCurrentUrl().contains("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login"))
            System.out.println("The Login page URL contains /Login");
        else
            System.out.println ("The Login page URL does not contain /Login");
        Thread.sleep(5000);

    }


    @Test(priority = 2)
    public void testNegativeLogin() throws InterruptedException {
        driver.findElement (By.id("username")).sendKeys("InvalidUsername");
        driver.findElement (By.id("password")).sendKeys("testade1234");
        driver.findElement (By.xpath ("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click ();
        String expectedErrorMessage = "Login Failed: Invalid username or password";
        String actualErrorMessage = driver.findElement (By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/div[4]/div/div/p")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

        Thread.sleep(5000);
    }




    public static void main(String args[]) throws InterruptedException{
        Deydamlogin test = new Deydamlogin();
        test.setUp();
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }

};
