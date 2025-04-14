package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertsPage extends BasePage{

    private By triggerAlertBtn = By.xpath("//button[normalize-space()='Click for JS Alert']");
    private By result = By.id("result");
    private By triggerConfirmAlert = By.xpath("//button[normalize-space()='Click for JS Confirm']");
    private By triggerJSPromptAlert = By.xpath("//button[normalize-space()='Click for JS Prompt']");
    public AlertsPage(WebDriver driver) {
        super(driver);
    }
    public AlertsPage clickForJSAlert(){
        driver.findElement(triggerAlertBtn).click();
        return this;
    }
    public AlertsPage acceptAlert(){
        driver.switchTo().alert().accept();
        return this;
    }

    public String getResultText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(result)).getText();
    }

    public AlertsPage clickForJSConfirmAlert() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(triggerConfirmAlert)).click();
        return this;
    }

    public String getAlertMessage() {
        return driver.switchTo().alert().getText();
    }

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    public AlertsPage clickForJSPrompt() {
        wait.until(ExpectedConditions.elementToBeClickable(triggerJSPromptAlert)).click();
        return this;
    }

    public AlertsPage enterPrompt(String prompt){
        driver.switchTo().alert().sendKeys(prompt);
        return this;
    }


}
