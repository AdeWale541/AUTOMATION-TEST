package Login;

import com.beust.jcommander.IStringConverter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestLogin {
    private WebDriver driver;
    @BeforeClass
    public void setUp() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://dev.d2rxvhrryr2bkn.amplifyapp.com/login");
            Thread.sleep(5000);
            driver.manage().window().maximize();
            System.out.println(driver.getTitle());
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    driver.findElement (By.id("username")).sendKeys("WALE5410");
                    driver.findElement (By.id("password")).sendKeys("testade1234");
                    driver.findElement (By.xpath ("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button")).click ();
                    Thread.sleep(10000);
                    driver.quit();
    }
    public static void main(String args[]) throws InterruptedException{
        TestLogin test = new TestLogin();
        test.setUp();
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
};

