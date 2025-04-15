package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeDeepDomPage extends BasePage {

    private By tableColumn10row21 = By.xpath("//td[normalize-space()='17.32']");

    public LargeDeepDomPage(WebDriver driver) {
        super(driver);
    }

    public void scrollToTable(){
        WebElement target = driver.findElement(tableColumn10row21);
        String script = "arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script,target);
    }
}
