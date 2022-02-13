package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;

    private By companyBrand = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[1]/a");
    private By dashboardtest = By.xpath("//*[@id=\"sidetray\"]/div/div[1]/div/div[1]/span/h5");
    private By dropdownBtn= By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/button/img\n");
    private By logoutbtn = By.linkText("Log Out");

    public void verifyCompanyImage(){
        driver.findElement(companyBrand).isDisplayed();
    }

    public void verifyDashboardTest(){
        driver.findElement(dashboardtest).getText();
    }

    public LoginPage clickLogout(){
        driver.findElement(dropdownBtn).click ();
        driver.findElement(logoutbtn).click();
        return new LoginPage(driver);
    }
}

