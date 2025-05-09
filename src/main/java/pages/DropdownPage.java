package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage extends BasePage {
    private final By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void selectFromDropDown(String option) {
        findDropdownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOption() {
        List<WebElement> selectedElements = findDropdownElement().getAllSelectedOptions();

        return selectedElements.stream().map(WebElement::getText).collect(Collectors.toList());

    }

    private Select findDropdownElement() {
        return new Select(wait.until(ExpectedConditions.elementToBeClickable(dropdown)));
    }

    public void makeBothOptionsSelectableTest() {
        WebElement target = driver.findElement(dropdown);
//        var jsExecutor = ((JavascriptExecutor)driver);
        String script = "arguments[0].setAttribute('multiple','');";
        ((JavascriptExecutor) driver).executeScript(script, target);


    }
}
