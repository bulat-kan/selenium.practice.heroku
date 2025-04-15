package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage extends BasePage {
    private final By linkClickHere = By.xpath("//a[normalize-space()='Click Here']");

    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    public void clickHere() {
        driver.findElement(linkClickHere).click();
    }
}
