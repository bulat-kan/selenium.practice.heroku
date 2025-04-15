package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage extends BasePage{

    private By paragraph = By.cssSelector(".jscroll-added");
    public InfiniteScrollPage(WebDriver driver) {
        super(driver);
    }

    /**
     *
     * @param index = 1 based
     */
    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight);";
        var jsExecutor = (JavascriptExecutor)driver;
        while(getNumberOfParagraphsPresent() <index){
            jsExecutor.executeScript(script);
        }
    }

    private int getNumberOfParagraphsPresent() {
        return driver.findElements(paragraph).size();
    }
}
