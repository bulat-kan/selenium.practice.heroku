import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseTests extends BaseTest{

    @Test
    public void testHorizontalSliderDrugWithMouse(){
        var horizontalSliderPage = homePage.load().clickHorizontalSlider();
        horizontalSliderPage.moveHorizontalLineWithMouse(-20);
        Assert.assertEquals(horizontalSliderPage.getSliderResult(),"1.5");
    }

    @Test
    public void testRightClickWithMouse(){
        var contextMenuPage =  homePage.load().clickContextMenu();
        contextMenuPage.rightClickOnContextBox();
        Assert.assertEquals(contextMenuPage.getAlertMessage(), "You selected a context menu", "incorrect alert message" );
        contextMenuPage.acceptAlert();

        boolean alertIsGone = isJSAlertIsStillVisable();

        Assert.assertTrue(alertIsGone, "alert was not handled and is still displayed");
    }
}
