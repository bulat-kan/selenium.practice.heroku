import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KeysTests extends BaseTest{

    @Test
    public void testBackspace(){
        var keyPressesPage = homePage.load().clickKeyPresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPressesPage.getResultText(), "You entered: BACK_SPACE", "wrong button pressed");
    }

    @Test
    public void testPi(){
        var keyPressesPage = homePage.load().clickKeyPresses();
        keyPressesPage.enterPi();
    }

    @Test
    public void testHorizontalSliderWithArrowKeys(){
        var horizontalSliderPage = homePage.load().clickHorizontalSlider();
        horizontalSliderPage.moveHorizontalLineWithArrows(2);

        Assert.assertEquals(horizontalSliderPage.getSliderResult(),"3.5", "results doesn't match");

    }

}
