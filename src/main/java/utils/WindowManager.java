package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();;
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

    public void switchToWindow(String windowTitle){
        var windows = driver.getWindowHandles();
        for(var window: windows){
            System.out.println("switching to window: "+window);
            driver.switchTo().window(window);

            System.out.println("Current window title: " + driver.getTitle());
            if(driver.getTitle().equals(windowTitle)) break;
        }
    }
}
