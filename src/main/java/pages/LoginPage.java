package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginBtn = By.tagName("button");
    By alertBanner = By.id("flash");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage enterUsername(String username) {
        wait.until(ExpectedConditions.presenceOfElementLocated(usernameField)).sendKeys(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordField)).sendKeys(password);
        return this;
    }
    public SecureAreaPage clickLoginBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
        return new SecureAreaPage(driver);
    }

    public String getBannerAlertText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(alertBanner)).getText();
    }
}
