import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTests extends BaseTest{

    @Test
    void forgotPasswordEmailShouldBeSent(){
        var forgotPasswordPage =homePage.load().clickForgotPasswordLink();
        forgotPasswordPage.retrievePassword("user1@example.com");
        String actualMessage = forgotPasswordPage.getEmailSentBannerMessage();
        Assert.assertTrue(actualMessage.contains("Success! reset link was emailed"), "incorrect message");
    }

}
