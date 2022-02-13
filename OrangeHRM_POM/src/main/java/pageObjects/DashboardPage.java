package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {


    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;

    private By welcome = By.id("welcome");
    private By logoutButton= By.linkText("Logout");
    private By subscriberButton= By.id("Subscriber_link");
    private By companyImage = By.xpath("//*[@id=\"branding\"]/a[1]/img");
    private By dashboardtest = By.xpath("//*[@id=\"content\"]/div/div[1]/h1");

    public void verifyCompanyImage(){
        driver.findElement(companyImage).isDisplayed();
    }

    public void verifydashboardtest(){
        driver.findElement(dashboardtest).getText();
    }

    public void clickWelcome(){
        driver.findElement(welcome).click ();
    }

    public LoginPage clickLogout(){
        driver.findElement(logoutButton).click ();
        return new LoginPage(driver);
    }
    public SubscriberPage clickSubscribe() {
        driver.findElement(subscriberButton).click();
        return new SubscriberPage(driver);
    }
}



