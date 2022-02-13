package Login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Monosnapsignin {

    private WebDriver driver;
    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://monosnap.com/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

        @Test(priority = 0)
        public void testSuccessfulLogin() throws InterruptedException {

        driver.findElement (By.xpath ("//*[@id=\"root\"]/div[2]/div/div[3]/div[1]/div/div[2]/div[3]/span")).click ();

        driver.findElement (By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[1]")).sendKeys("testade567@gmail.com");
            Thread.sleep(2000);
        driver.findElement (By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[2]")).sendKeys("testade1234");
            Thread.sleep(1000);
        driver.findElement (By.xpath ("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click ();
        Thread.sleep(5000);
            if (driver.getCurrentUrl ().contains ("https://monosnap.com/list/5fce56848a2e601619bd5908"))
                System.out.println("The page URL successfully logged in");
            else
                System.out.println ("The page URL did not login");

    }

    @Test(priority = 1)
    public void testLogout() throws InterruptedException {
        driver.findElement (By.xpath ("//*[@id=\"store\"]/div[4]/div/div[1]/div/div[3]/div[3]")).click ();
        Thread.sleep(4000);
        driver.findElement (By.xpath ("//*[@id=\"store\"]/div[4]/div/div[1]/div/div[1]/div[2]")).click ();


        if (driver.getCurrentUrl().contains("https://monosnap.com/"))
            System.out.println("The Login page URL is valid");
        else
            System.out.println ("The Login page URL is not valid");
        Thread.sleep(5000);

    }

    @Test(priority = 2)
    public void testNegativeLogin() throws InterruptedException {
        driver.findElement (By.xpath ("//*[@id=\"root\"]/div[2]/div/div[3]/div[1]/div/div[2]/div[3]/span")).click ();
        Thread.sleep(2000);
        driver.findElement (By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[1]")).sendKeys("Invalidemail@gmail.com");
        Thread.sleep(2000);
        driver.findElement (By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[2]/input[2]")).sendKeys("testade1234");
        Thread.sleep(1000);
        driver.findElement (By.xpath ("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click ();
        String expectedErrorMessage = "Wrong email or password\n" +
                "Please check if you've typed your email and password correctly.";
        String actualErrorMessage = driver.findElement (By.xpath("//*[@id=\"root\"]/div[1]/div/div/div/div")).getText();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

        Thread.sleep(5000);
    }


    public static void main(String args[]) throws InterruptedException{
        Monosnapsignin test = new Monosnapsignin();
        test.setUp();
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }



};
