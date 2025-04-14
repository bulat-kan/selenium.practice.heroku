import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import pages.*;

import java.io.File;
import java.io.IOException;
import static org.testng.Assert.assertEquals;

public class PracticeTest extends BaseTest{

    @Test
    void testTitle() {
        homePage.load("");

        String expected = "The Internet";

        String actual = driver.getTitle();
        assertEquals( actual, expected,"wrong title");

        takeScreenshot("home_page");

    }

    @Test
    void countLinksOnPage() {
        homePage.load();
        int numOfUrls = homePage.getNumberOfUrlsOnPage();

        assertEquals(numOfUrls, 44);
    }

    @Test
    void countShiftingContent() {
        homePage.load();

        ShiftingContentPage shiftingContentPage = homePage.clickLinkShiftingContent();

        ShiftingContentMenuPage menuPage = shiftingContentPage.clickExample1MenuElement();
        int shiftingButtonsFound = menuPage.getNumberOfShiftingButtons();

        assertEquals(shiftingButtonsFound, 5, "there are more elements than expected ");
    }

    void takeScreenshot(String fileName) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);

        File destFile = new File("target/" + fileName + ".png");
        try {
            FileHandler.copy(srcFile, destFile);
            System.out.println("Screenshot saved: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Failed to save screenshot: " + e.getMessage());
        }

    }
}
