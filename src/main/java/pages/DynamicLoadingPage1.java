package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.LocalTime;

public class DynamicLoadingPage1 extends BasePage {

    private By startButton = By.cssSelector("#start>button");
    private By loadedText = By.cssSelector("#finish h4");
    private By loadingImg = By. cssSelector("#loading img");

    public DynamicLoadingPage1(WebDriver driver) {
        super(driver);
    }

    public DynamicLoadingPage1 clickStart() {
        wait.until(ExpectedConditions.elementToBeClickable(startButton)).click();
        return this;
    }
    public String getLoadedText(){
        System.out.println("waiting for loading to disappear " + LocalTime.now());
        waitLong.until(ExpectedConditions.invisibilityOfElementLocated(loadingImg));
        System.out.println("loading img disappeared at: " + LocalTime.now());
        return wait.until(ExpectedConditions.visibilityOfElementLocated(loadedText)).getText();
    }
}
