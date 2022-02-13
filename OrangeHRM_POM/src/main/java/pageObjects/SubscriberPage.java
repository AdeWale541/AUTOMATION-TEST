package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubscriberPage {

    public SubscriberPage(WebDriver driver) {
        this.driver =driver;
    }

    private WebDriver driver;

    private By SubscriberName = By.id("subscriber_name");
    private By SubscriberEmail= By.id("subscriber_nemail");
    private By subscribeButton= By.id("btnSubscribe");
    private By DashboardPage= By.linkText("Dashboard");
    private By welcome = By.id("welcome");
    private By logoutButton= By.linkText("Logout");


    public void enterName(String sName){
        driver.findElement(SubscriberName).sendKeys (sName);
    }

    public LoginPage enterEmail(String pwda){
        driver.findElement(SubscriberEmail).sendKeys (pwda);
        return new LoginPage(driver);
    }
    public void clickSubscriberButton() {
        driver.findElement(subscribeButton).click();

    }

    public DashboardPage clickDashboardMenu() {
        driver.findElement(DashboardPage).click();
    return new DashboardPage(driver);
    }

    public void clickWelcome(){
        driver.findElement(welcome).click ();
    }

    public LoginPage clickLogout() {
        driver.findElement(logoutButton).click();
    return new LoginPage(driver);
    }



    }
