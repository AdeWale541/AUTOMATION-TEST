package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }
    public WebDriver driver;


    private By Email = By.id("loginId");
    private By Password = By.id("password");
    private By LoginBtn = By.xpath("//*[@id=\"form-wrapper\"]/form/button");
//  Using By as a locator to find login fields

    public void enterAddress (String Vmail){
        driver.findElement(Email).sendKeys (Vmail);
        //find the username field and assign a string to the username value
    }

    public void enterPassword (String pwa){
        driver.findElement(Password).sendKeys (pwa);
        //find the password field and assign a string to the password value

    }


    public String getLoginHomePageUrl() {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        //wait until URL is visible
        wait.until(ExpectedConditions.urlToBe("https://qa-frontend.ebanqo.io/d/home"));
        return driver.getCurrentUrl();
    }
    public SignedinHomePage clickLoginButton (){
        driver.findElement(LoginBtn).click();
        return new SignedinHomePage(driver);
        // Find the login button and click it
    }



}



