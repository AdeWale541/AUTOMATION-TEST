package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignedinHomePage {
    public SignedinHomePage(WebDriver driver) {
        this.driver = driver;
    }
    public WebDriver driver;
    private By ProfileBtn = By.xpath("//*[@id=\"top-bar\"]/div[4]/span");

    private By LogoutBtn = By.xpath("//*[@id=\"dashboard-base-layout\"]/section/div/div[3]/span/button/span[2]");





    public LoginPage clickLogoutBtn() throws InterruptedException{

        Thread.sleep(5000);
        driver.findElement(ProfileBtn).click();
        Thread.sleep(5000);
        driver.findElement(LogoutBtn).click();
        Thread.sleep(5000);

        return new LoginPage(driver);
    }


}
