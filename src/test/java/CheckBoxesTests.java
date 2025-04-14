import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxesTests extends BaseTest{
    @Test
    public void shouldBeAbleToCheckAndUncheck(){
        var checkboxesPage = homePage.load().clickCheckboxes();
        checkboxesPage.checkCheckbox(0);
        boolean checkbox1Checked = checkboxesPage.isCheckBoxChecked(0);
        Assert.assertTrue(checkbox1Checked,"checkbox is not checked");
        checkboxesPage.uncheckCheckbox(1);
        boolean checkbox2Checked = checkboxesPage.isCheckBoxChecked(1);
        Assert.assertFalse(checkbox2Checked,"checkbox is still checked");
    }
}
