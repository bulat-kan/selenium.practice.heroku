import org.testng.Assert;
import org.testng.annotations.Test;

public class HoversTests extends BaseTest{

    @Test
    public void shouldHoverOverProfile(){
        var hoversPage = homePage.load().clickHovers();
        var caption = hoversPage.hoverOverProfile(1);
        Assert.assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
        Assert.assertTrue(caption.getLink().contains("/users/1"), "link doesn't contain expected endpoint");
        Assert.assertTrue(caption.getLinkText().contains("View profile"));
        Assert.assertEquals(caption.getHeaderText(),"name: user1", "header text is wrong");

    }
}
