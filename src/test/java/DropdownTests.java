import org.testng.annotations.Test;
import pages.DropdownPage;

import static org.testng.Assert.assertEquals;

public class DropdownTests extends BaseTest{
    @Test
    void dropdownShouldWork(){
        homePage.load();
        DropdownPage dropdownPage = homePage.clickDropdown();
        String option = "Option 2";
        dropdownPage.selectFromDropDown(option);
        var selectedOptions = dropdownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),1, "incorrect number of selected options");
        assertEquals(selectedOptions.get(0), option, "Wrong option is selected");

    }
}
