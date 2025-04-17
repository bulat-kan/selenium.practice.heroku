package utils;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowUtil {

    /**
     * @param driver WebDriver instance
     * @param windowTitle title of the window tab
     */
    public static void switchToWindow(WebDriver driver, String windowTitle){
        var windows = driver.getWindowHandles();
        for(var window: windows){
            System.out.println("switching to window: "+window);
            driver.switchTo().window(window);

            System.out.println("Current window title: " + driver.getTitle());
            if(driver.getTitle().equals(windowTitle)) break;
        }
    }
    /**
     * Switches to the newest (last opened) browser tab.
     * @param driver WebDriver instance
     */
    public static void switchToNewTab(WebDriver driver) {
        Set<String> allHandles = driver.getWindowHandles();
        List<String> handleList = new ArrayList<>(allHandles);
        String latestTabHandle = handleList.get(handleList.size() - 1);
        driver.switchTo().window(latestTabHandle);
    }

    /**
     * Closes current tab and switches to previous one
     * @param driver WebDriver instance
     */
    public static void closeCurrentTabAndSwitchToPrevious(WebDriver driver){
        String currentHandle = driver.getWindowHandle();

        List<String> handles = new ArrayList<>(driver.getWindowHandles());

        driver.close();// closes current tab

        handles.remove(currentHandle);
        if(!handles.isEmpty()){
            driver.switchTo().window(handles.get(handles.size()-1));
        }
    }


}
