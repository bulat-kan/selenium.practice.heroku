package pages;

import org.openqa.selenium.*;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HorizontalSliderPage extends BasePage{
    private final By slider = By.cssSelector(".sliderContainer input");
    private final By sliderResult = By.cssSelector(".sliderContainer span");

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }
    public void moveHorizontalLineWithArrows(int times ){
        wait.until(ExpectedConditions.elementToBeClickable(slider)).click();

        for(int i=0; i< times; i++){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }
    public String getSliderResult(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(sliderResult)).getText();
    }

    public void moveHorizontalLineWithMouse(int xOffset) {
        WebElement sliderHandle = driver.findElement(slider);
        Actions actions = new Actions(driver);
        actions.clickAndHold(sliderHandle).moveByOffset(xOffset,0).release().perform();
    }
}
