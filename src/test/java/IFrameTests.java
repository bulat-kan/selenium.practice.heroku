import org.testng.Assert;
import org.testng.annotations.Test;

public class IFrameTests extends BaseTest{

    @Test
    public void testWysiwygEditor(){
        var wysiwigPage =homePage.load().clickWYSIWYGEditor();
        Assert.assertEquals(wysiwigPage.getBodyContent(), "Your content goes here.");
    }
}
