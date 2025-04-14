import org.testng.Assert;
import org.testng.annotations.Test;

public class ModalsTest extends BaseTest {

    @Test
    public void testModal() {
        var entryAddPage = homePage.load().clickEntryAd();
        Assert.assertEquals(entryAddPage.getModalTitleText(), "THIS IS A MODAL WINDOW");
        entryAddPage.closeModal();

        entryAddPage.triggerModalWindow();
        Assert.assertTrue(entryAddPage.getModalContentText()
                .contains("It's commonly used to encourage a user to take an action " +
                        "(e.g., give their e-mail address to sign up for something or disable their ad blocker)."));


    }

}
