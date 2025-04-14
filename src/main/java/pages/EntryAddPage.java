package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EntryAddPage extends BasePage {

    private By modalHeader = By.cssSelector(".modal-title h3");
    private By modalBody = By.cssSelector(".modal-body p");
    private By closeModalBtn = By.cssSelector(".modal-footer p");
    private By restartAd = By.id("restart-ad");

    public EntryAddPage(WebDriver driver) {
        super(driver);
    }

    public void triggerModalWindow() {
        for (int i = 1; i <= 5; i++) {
            try {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[class='underlay']")));
                wait.until(ExpectedConditions.elementToBeClickable(restartAd)).click();
                waitLong.until(ExpectedConditions.visibilityOfElementLocated(modalHeader));
                System.out.println("modal appeared at attempt #" + i);
                return;
            } catch (TimeoutException e) {
                driver.findElement(restartAd).click();
                System.out.println("attempting to trigger modal # " + (i + 1));
            }
        }

    }

    public String getModalTitleText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(modalHeader)).getText();
    }

    public String getModalContentText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(modalBody)).getText();
    }

    public void closeModal() {
        wait.until(ExpectedConditions.elementToBeClickable(closeModalBtn)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("[class='underlay']")));
    }
}
