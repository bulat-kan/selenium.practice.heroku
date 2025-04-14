import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveTests extends BaseTest{
    @Test
    public void shouldAddAndRemoveElement() {
        var addRemoveElementsPage  = homePage.load().clickAddRemoveElements();
        addRemoveElementsPage.clickAddElementBtn();
        boolean isNewElementDisplayed = addRemoveElementsPage.isAddedElementDisplayed();
        Assert.assertTrue(isNewElementDisplayed, "element was not added");
        addRemoveElementsPage.clickDeleteElementBtn();
        boolean isElementDeleted = addRemoveElementsPage.isAddedElementDeleted();
        Assert.assertTrue(isElementDeleted, "element is still displayed, and has not been removed");
    }

    @Test
    public void shouldAddAndRemoveMultipleElements() {
        var addRemoveElementsPage  = homePage.load().clickAddRemoveElements();
        int numberOfElementsToAdd =5;
        for(int i = 0; i < numberOfElementsToAdd; i++) {
            addRemoveElementsPage.clickAddElementBtn();
        }
        addRemoveElementsPage.getNumberOfAddedElements();
        Assert.assertEquals(addRemoveElementsPage.getNumberOfAddedElements(), numberOfElementsToAdd, "incorrect number of added elements");

        for(int i = 0; i < numberOfElementsToAdd; i++) {
            addRemoveElementsPage.clickDeleteElementBtn();
        }
        Assert.assertEquals(addRemoveElementsPage.getNumberOfAddedElements(), 0, "incorrect number of added elements");

    }
}
