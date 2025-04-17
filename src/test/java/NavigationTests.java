import org.testng.annotations.Test;
import utils.WindowUtil;

public class NavigationTests extends BaseTest {

    @Test
    public void testingNavigationUtils() {
        homePage.load().clickDynamicLoading().clickLinkExample1();
        getNavigationUtil().goBack();
        getNavigationUtil().goForward();
        getNavigationUtil().refreshPage();
        getNavigationUtil().goTo("https://www.google.com/");
    }

    @Test
    public void testSwitchingBetweenTabs() {
        homePage.load().clickMultipleWindows().clickHere();
        WindowUtil.switchToWindow(driver,"New Window");
        WindowUtil.switchToWindow(driver,"The Internet");
        WindowUtil.switchToWindow(driver,"New Window");

    }

    @Test
    public void openLinkInANewTabTest() {
        var dynamicLoadingPage = homePage.load().clickDynamicLoading();
        dynamicLoadingPage.openExampleOneInNewTab();
        dynamicLoadingPage.closeCurrentTabAndSwitchToPrevious();

    }

}
