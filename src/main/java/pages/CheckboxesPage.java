package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage extends BasePage{
    private  List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }


    public void checkCheckbox(int index) {
        if(checkboxes.get(index).isSelected() ){
            return;
        }
        checkboxes.get(index).click();
    }

    public boolean isCheckBoxChecked(int index) {
        return checkboxes.get(index).isSelected();
    }

    public void uncheckCheckbox(int index) {
        if(!checkboxes.get(index).isSelected()){
            checkboxes.get(index).click();
        }
        checkboxes.get(index).click();
    }
}
