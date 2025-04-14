package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ForgotPasswordPage extends BasePage{
    private By emailField = By.id("email");
    private By retrievePasswordBtn = By.id("form_submit");
    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void retrievePassword(String email){
        wait.until(ExpectedConditions.presenceOfElementLocated(emailField)).sendKeys(email);
        wait.until(ExpectedConditions.elementToBeClickable(retrievePasswordBtn)).click();
    }


    public String getEmailSentBannerMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1"))).getText();
    }
}
