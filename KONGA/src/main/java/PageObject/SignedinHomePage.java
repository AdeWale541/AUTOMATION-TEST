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

    private By LoginPopup = By.xpath("//*[@id=\"app-content-wrapper\"]/div[1]/div/div[1]/p");
    private By ProfileBtn = By.linkText("My Account");
    private By Categoriesbtn = By.linkText("Computers and Accessories");
    private By LaptopsBtn = By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[2]/section/div/section/div[2]/div[2]/ul/li[5]/a/label/span");

    //
    private By MacbbokBtn = By.xpath("/html/body/div[1]/div/section/div[3]/section/main/section[2]/section/div/section/div[2]/div[2]/ul/li[5]/a/ul/li[1]/a/label/span");
    private By Logoutbtn = By.xpath("/html/body/div[1]/div/section/div[2]/nav/div[2]/div/div[3]/div[2]/div/ul/li[7]/a");
//Using by to locate the SignedinHomePage elements

    //*[@id="app-content-wrapper"]/div[2]/nav/div[2]/div/div[3]/div[2]/div/a/svg
    //*[@id="app-content-wrapper"]/div[2]/nav/div[2]/div/div[3]/div[2]/div/a/span
    public void VerifyLoginPopup() {
        driver.findElement(LoginPopup).isDisplayed();
        //Verify the succcessful login pop up
    }

    public String getLoginHomePageUrl(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        //wait until URL is visible
        wait.until(ExpectedConditions.urlToBe("https://www.konga.com/"));
        return driver.getCurrentUrl();
    }

    public void clickProfileBtn() {
        driver.findElement(ProfileBtn).click();
        //click profile button
    }

    public void clickCategoriesbtn(){
        driver.findElement(Categoriesbtn).click();
    }

    public LoginPage clickLogoutBtn() throws InterruptedException{

        Thread.sleep(5000);
        driver.findElement(LaptopsBtn).click();
        Thread.sleep(5000);
        driver.findElement(MacbbokBtn).click();
        Thread.sleep(10000);
        driver.findElement(ProfileBtn).click();
        Thread.sleep(10000);
        driver.findElement(Logoutbtn).click();
        Thread.sleep(10000);
        return new LoginPage(driver);
    }


}
