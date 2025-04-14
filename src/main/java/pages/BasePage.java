package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
   protected WebDriver driver;
    WebDriverWait wait;
    WebDriverWait waitLong;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        waitLong = new WebDriverWait(this.driver,Duration.ofSeconds(15));

    }

    public void load(String endpoint){
        driver.get("https://the-internet.herokuapp.com/" + endpoint);
    }

    public String getCurrentPageURL(){
       return driver.getCurrentUrl();
    }
}
