import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTest{

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.load().clickAlerts();
        alertsPage.
                clickForJSAlert().
                acceptAlert();
        String resultText = alertsPage.getResultText();
        Assert.assertEquals(resultText, "You successfully clicked an alert", "text doesn't match");
    }

    @Test
    public void testContentOfAlertAndCancel(){
        var alertsPage = homePage.load().clickAlerts();
        alertsPage.clickForJSConfirmAlert();
        String message = alertsPage.getAlertMessage();
        Assert.assertEquals(message,"I am a JS Confirm", "Alert message doesn't match expected");
        alertsPage.dismissAlert();
        Assert.assertEquals(alertsPage.getResultText(),"You clicked: Cancel", "result message is incorrect");

    }

    @Test
    public void testJSPromptAlert(){
        var alertsPage = homePage.load().clickAlerts();
        alertsPage.
                clickForJSPrompt().
                enterPrompt("Hi There!").
                acceptAlert();
        Assert.assertEquals(alertsPage.getResultText(),"You entered: Hi There!", "incorrect result");

    }
}
