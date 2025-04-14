package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class HoversPage extends BasePage{
    private final By profileElement = By.className("figure");

    public HoversPage(WebDriver driver) {
        super(driver);
    }
    public FigureCaption hoverOverProfile(int index){
        Actions actions = new Actions(driver);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(profileElement));
        actions.moveToElement(element).perform();
        return new FigureCaption(element);
    }
    public class FigureCaption{
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }
        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getHeaderText(){
            return caption.findElement(header).getText();
        }

        public String getLink(){
            return caption.findElement(link).getDomAttribute("href");
        }

        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }
}
