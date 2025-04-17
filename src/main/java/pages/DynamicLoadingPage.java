package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ActionsUtil;
import utils.WindowUtil;

public class DynamicLoadingPage extends BasePage {

    String linkXpathContains = "//a[contains(text(), '%s')]";
    private By example1Link = By.xpath(String.format(linkXpathContains, "Example 1"));
    private By example2Link = By.xpath(String.format(linkXpathContains, "Example 2"));

    public DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    public DynamicLoadingPage1 clickLinkExample1() {
        wait.until(ExpectedConditions.elementToBeClickable(example1Link)).click();
        return new DynamicLoadingPage1(driver);
    }

    public DynamicLoadingPage2 clickeLinkExample2() {
        wait.until(ExpectedConditions.elementToBeClickable(example2Link)).click();
        return new DynamicLoadingPage2(driver);
    }

    public void openExampleOneInNewTab() {
        ActionsUtil.openLinkInNewTab( driver, example1Link);
        WindowUtil.switchToNewTab(driver);
    }
    public void closeCurrentTabAndSwitchToPrevious(){
        WindowUtil.closeCurrentTabAndSwitchToPrevious(driver);
    }
}
