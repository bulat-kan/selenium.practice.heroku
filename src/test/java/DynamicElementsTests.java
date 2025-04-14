import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicElementsTests extends BaseTest{

    @Test
    public void testDynamicLoadingHiddenElement(){
        var dynamicLoadingPage = homePage.load().clickDynamicLoading();
        var dynamicPage1 = dynamicLoadingPage.clickLinkExample1();
        String loadedText = dynamicPage1.clickStart().getLoadedText();
        Assert.assertEquals(loadedText.trim(), "Hello World!", "wrong loaded text");
    }

    @Test
    public void testDynamicLoadingElementRenderedAfterTheFact(){
        var dynamicLoadingPage =homePage.load().clickDynamicLoading();
        String loadedText = dynamicLoadingPage.clickeLinkExample2().clickStart().getLoadedText();
        Assert.assertEquals(loadedText,"Hello World!", "wrong loaded text");
    }
}
