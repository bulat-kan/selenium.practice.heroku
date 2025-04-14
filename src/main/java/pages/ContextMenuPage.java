package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage extends BasePage{
    private By contextBoxTarget = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    public void rightClickOnContextBox(){
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(contextBoxTarget);
        actions.contextClick(target).perform();
    }

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    public String getAlertMessage(){
        return driver.switchTo().alert().getText();
    }

}
