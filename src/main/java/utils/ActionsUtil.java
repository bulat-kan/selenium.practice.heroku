package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtil {

    public static void rightClick(WebDriver driver, WebElement element) {
        new Actions(driver).contextClick(element).perform();
    }

    public static void doubleClick(WebDriver driver, WebElement element) {
        new Actions(driver).doubleClick(element).perform();
    }

    public static void hover(WebDriver driver, WebElement element) {
        new Actions(driver).moveToElement(element).perform();
    }

    public static void dragAndDrop(WebDriver driver, WebElement source, WebElement target) {
        new Actions(driver).dragAndDrop(source, target).perform();
    }

    public static void dragByOffset(WebDriver driver, WebElement element, int xOffset, int yOffset) {
        new Actions(driver).dragAndDropBy(element, xOffset, yOffset).perform();
    }


    public static void openLinkInNewTab(WebDriver driver, By link) {
        String os = System.getProperty("os.name").toLowerCase();
        Keys modifierKey = os.contains("mac") ? Keys.COMMAND: Keys.CONTROL;

        new Actions(driver)
                .keyDown(modifierKey)
                .click(driver.findElement(link))
                .keyUp(modifierKey)
                .build()
                .perform();
    }
}
