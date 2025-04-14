import org.testng.annotations.Test;

public class AdvancedActionsTests extends BaseTest{

    @Test
    public void hoverShouldWork(){
        homePage.load().clickHovers();
    }

}
