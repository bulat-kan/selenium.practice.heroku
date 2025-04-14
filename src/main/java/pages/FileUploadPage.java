package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FileUploadPage extends BasePage {

    private By inputFld = By.id("file-upload");
    private By uploadBtn = By.id("file-submit");
    private By uploadOutcome = By.cssSelector("#content h3");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }
    public void uploadFile(String absolutePathToFile){
        driver.findElement(inputFld).sendKeys(absolutePathToFile);
        clickUploadBtn();

    }
    public void clickUploadBtn(){
        driver.findElement(uploadBtn).click();
    }

    public String getUploadOutcomeMessage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(uploadOutcome)).getText();
    }
}
