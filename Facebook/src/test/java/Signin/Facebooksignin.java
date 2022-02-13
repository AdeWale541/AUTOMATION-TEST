package Signin;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Facebooksignin {
    private WebDriver driver;
     @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://web.facebook.com/?_rdc=1&_rdr");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


        @Test(priority = 0)
        public void testSuccessfulLogin() throws InterruptedException {

        driver.findElement (By.id("email")).sendKeys("testade567@gmail.com");
        driver.findElement (By.id("pass")).sendKeys("testade1234");
        driver.findElement (By.xpath ("//*[@id=\"u_0_b\"]")).click ();
        Thread.sleep(5000);
            if (driver.getCurrentUrl ().contains ("https://web.facebook.com/checkpoint/1501092823525282/?next=https%3A%2F%2Fweb.facebook.com%2F%3Fsk%3Dwelcome"))
                System.out.println("The page URL successfully logged in");
            else
                System.out.println ("The page URL did not login");

    }

    @Test(priority = 1)
    public void testLogout() throws InterruptedException {
        driver.findElement (By.xpath ("//*[@id=\"js_1\"]/div/div/div[2]/div/div[2]/a")).click ();
        Thread.sleep(2000);

        if (driver.getCurrentUrl().contains("https://web.facebook.com/?stype=lo&jlou=AffisjMo8KWdRT6i3pskMipm6m7v5O_Ki_U8y-ynWlVWBwTjt973ewdVuQtPEHhjUiq2u4EhJHyvewvUqtHpfKi9esiw4g7UNbIOsEZda1hcgQ&smuh=32237&lh=Ac9l9JKoMdjXw0akg3w"))
            System.out.println("The Login page URL is valid");
        else
            System.out.println ("The Login page URL is not valid");
        Thread.sleep(5000);

    }

    @Test(priority = 2)
    public void testNegativeLogin() throws InterruptedException {
        driver.findElement (By.id("email")).sendKeys("Invalid username");
        driver.findElement (By.id("pass")).sendKeys("testade1234");
        driver.findElement (By.xpath ("//*[@id=\"u_0_b\"]")).click ();
        String expectedErrorMessage = "The password that you've entered is incorrect. Forgotten password?";
        String actualErrorMessage = driver.findElement (By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

        Thread.sleep(5000);
    }



    public static void main(String args[]) throws InterruptedException{
        Facebooksignin test = new Facebooksignin();
        test.setUp();
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }


};
