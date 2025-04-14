package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class KeyPressesPage extends BasePage {
    private final By inputField = By.id("target");
    private final By result = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    public void enterText(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputField)).sendKeys(text);

    }

    public String getResultText() {
        return wait.until(ExpectedConditions.presenceOfElementLocated(result)).getText();
    }

    public void enterPi() {
        enterText(Keys.chord(Keys.ALT, "p") + " = 3.14");
    }
}
