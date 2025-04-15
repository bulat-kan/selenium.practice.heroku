import org.testng.annotations.Test;

public class TestsWithJSExecutor extends BaseTest {

    @Test
    public void largeDomTest() {
        var largeDomPage = homePage.load().clickLargeNDeepDom();
        largeDomPage.scrollToTable();
    }

    @Test
    public void infiniteScrollTest() {
        var infiniteScrollPage = homePage.load().clickInfiniteScroll();
        infiniteScrollPage.scrollToParagraph(31);
    }


}
