import org.testng.annotations.Test;

public class NavigationTests extends BaseTest{

    @Test
    public void testingNavigationUtils(){
        homePage.load().clickDynamicLoading().clickLinkExample1();
        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().refreshPage();
        getWindowManager().goTo("https://www.google.com/");
    }

    @Test
    public void testSwitchingBetweenTabs(){
        homePage.load().clickMultipleWindows().clickHere();
        getWindowManager().switchToWindow("New Window");
        getWindowManager().switchToWindow("The Internet");
        getWindowManager().switchToWindow("New Window");

    }

}
