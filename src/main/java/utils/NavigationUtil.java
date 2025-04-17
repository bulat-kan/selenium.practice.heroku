package utils;

import org.openqa.selenium.WebDriver;

public class NavigationUtil {
    private WebDriver driver;
    WebDriver.Navigation navigate;

    public NavigationUtil(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void goTo(String url){
        navigate.to(url);
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }
}
