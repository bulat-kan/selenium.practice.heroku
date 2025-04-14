package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicLoadingPage2 extends BasePage {

    private By loadedText = By.cssSelector("#finish>h4");

    private By startButton = By.cssSelector("#start>button");

    public DynamicLoadingPage2(WebDriver driver) {
        super(driver);
    }

    public DynamicLoadingPage2 clickStart() {
        wait.until(ExpectedConditions.elementToBeClickable(startButton)).click();
        return this;
    }

    public String getLoadedText() {
        return waitLong.until(ExpectedConditions.visibilityOfElementLocated(loadedText)).getText();
    }


}
