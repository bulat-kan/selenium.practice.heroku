package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WysiwygEditorPage  extends BasePage{

    private String iFrameId = "mce_0_ifr";
    private By bodyContent = By.xpath("//p[normalize-space()='Your content goes here.']");
    public WysiwygEditorPage(WebDriver driver) {
        super(driver);
    }

    private void switchToFrame(){
        driver.switchTo().frame(iFrameId);
    }

    private void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }

    public String getBodyContent(){
        switchToFrame();
        String bodyText = wait.until(ExpectedConditions.visibilityOfElementLocated(bodyContent)).getText();
        switchToParentFrame();
        return  bodyText;
    }


}
