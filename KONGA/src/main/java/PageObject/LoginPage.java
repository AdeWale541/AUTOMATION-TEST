package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }
    public WebDriver driver;

    private By Loginmenu = By.xpath("//*[@id=\"app-content-wrapper\"]/div[3]/nav/div[2]/div/div[3]/div[2]/a");
    private By Username = By.id("username");
    private By Password = By.id("password");
    private By LoginBtn = By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button");
//  Using By as a locator to find login fields


    public void clickLoginmenu() {
        driver.findElement(Loginmenu).click();
        //Find the login button and click it
    }

    public void enterUsername (String VName){
        driver.findElement(Username).sendKeys (VName);
        //find the username field and assign a string to the username value
    }

    public void enterPassword (String pwa){
        driver.findElement(Password).sendKeys (pwa);
        //find the password field and assign a string to the password value

    }

    public SignedinHomePage clickLoginButton (){
        driver.findElement(LoginBtn).click();
        return new SignedinHomePage(driver);
        // Find the login button and click it
    }



}



