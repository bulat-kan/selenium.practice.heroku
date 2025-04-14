package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShiftingContentMenuPage extends BasePage{
    public ShiftingContentMenuPage(WebDriver driver) {
        super(driver);
    }

    public int getNumberOfShiftingButtons() {
        return driver.findElements(By.cssSelector("ul>li")).size();
    }
}
