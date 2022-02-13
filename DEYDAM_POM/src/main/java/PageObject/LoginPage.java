package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;

    private By Username = By.id("username");
    private By Password = By.id("password");
    private By loginBtn = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/form/button");
    private By companylogo = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/nav/a/img");
    private By forgotPassword = By.linkText("Forgot a password?");
    private By WelcomePanel = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[2]/div/div/div/div[2]/div/div/h2");


    public void verifyCompanyLogo(){
        driver.findElement(companylogo).isDisplayed();
    }

    public void verifyForgotPassword(){
        driver.findElement(forgotPassword).isDisplayed();
    }

    public void verifyWelcomePanel(){
        driver.findElement(WelcomePanel).getText();
    }

    public void enterUsername (String VName){
        driver.findElement(Username).sendKeys(VName);
    }

    public void enterPassword (String pwa){
        driver.findElement(Password).sendKeys(pwa);
    }

    public DashboardPage clickLoginButton (){
        driver.findElement(loginBtn).click();
        return new DashboardPage(driver);
    }


}
