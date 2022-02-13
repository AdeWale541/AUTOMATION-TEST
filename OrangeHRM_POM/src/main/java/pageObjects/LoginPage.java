package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import setUp.setUps;

public class LoginPage extends setUps {
    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;

    private By username = By.id("txtUsername");
    private By password = By.id("txtPassword");
    private By loginButton = By.id("btnLogin");
    private By companylogo = By.xpath("//*[@id=\"divLogo\"]/img");
    private By forgotPassword = By.linkText("Forgot your password?");
    private By loginPanel = By.xpath("/html//div[@id='logInPanelHeading']");


    public void verifyCompanyLogo(){
        driver.findElement(companylogo).isDisplayed();
    }

    public void verifyForgotPassword(){
        driver.findElement(forgotPassword).isDisplayed();
    }

    public void verifyLoginPanel(){
        driver.findElement(loginPanel).getText();
    }

    public void enterUsername (String uName){
        driver.findElement(username).sendKeys (uName);
    }

    public void enterPassword (String pwd){
        driver.findElement(password).sendKeys (pwd);
    }

    public DashboardPage clickLoginButton (){
        driver.findElement(loginButton).click();
        return new DashboardPage(driver);
    }
}