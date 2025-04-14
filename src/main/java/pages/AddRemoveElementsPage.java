package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddRemoveElementsPage extends BasePage {

    private By addElementBtn = By.cssSelector("button[onclick='addElement()']");
    private By deleteBtn = By.cssSelector("button[onclick='deleteElement()']");

    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    public void clickAddElementBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(addElementBtn)).click();
    }

    public void clickDeleteElementBtn() {
        wait.until(ExpectedConditions.elementToBeClickable(deleteBtn)).click();
    }

    public boolean isAddedElementDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(deleteBtn)).isDisplayed();
    }

    public boolean isAddedElementDeleted() {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(deleteBtn));
    }

    public int getNumberOfAddedElements() {
        return driver.findElements(deleteBtn).size();
    }
}
