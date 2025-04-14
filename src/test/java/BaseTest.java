import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    void setUp() {
/*        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "iPhone SE");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

        driver = new ChromeDriver(chromeOptions);
        */

//      driver.manage().window().setSize(new Dimension(365,667));
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        homePage = new HomePage(driver);
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }

    protected boolean isJSAlertIsStillVisable() {
        try {
            driver.switchTo().alert();
            return false;
        } catch (NoAlertPresentException e) {
            return true;
        }
    }

}
