package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShiftingContentPage extends BasePage{
    By example1Link = By.linkText("Example 1: Menu Element");
    public ShiftingContentPage(WebDriver driver) {
        super(driver);
    }

    public ShiftingContentMenuPage clickExample1MenuElement() {
       wait.until(ExpectedConditions.elementToBeClickable(example1Link)).click();
       return new ShiftingContentMenuPage(driver);
    }
}
