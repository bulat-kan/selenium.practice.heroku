package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage load() {
        load("");
        return this;
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public int getNumberOfUrlsOnPage() {
        return driver.findElements(By.cssSelector("ul>li")).size();

    }

    public ShiftingContentPage clickLinkShiftingContent() {
        clickLink("Shifting Content");
        return new ShiftingContentPage(driver);
    }

    public DropdownPage clickDropdown() {
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    private void clickLink(String linkText){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText(linkText))).click();

    }

    public ForgotPasswordPage clickForgotPasswordLink() {
        clickLink("Forgot Password");
        return new ForgotPasswordPage(driver);
    }

    public AddRemoveElementsPage clickAddRemoveElements() {
        clickLink("Add/Remove Elements");
        return new AddRemoveElementsPage(driver);
    }

    public CheckboxesPage clickCheckboxes() {
        clickLink("Checkboxes");
        return new CheckboxesPage(driver);
    }

    public HoversPage clickHovers() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSlider() {
        clickLink("Horizontal Slider");
        return new HorizontalSliderPage(driver);
    }
    public AlertsPage clickAlerts(){
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public FileUploadPage clickFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenu() {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }

    public EntryAddPage clickEntryAd() {
        clickLink("Entry Ad");
        return new EntryAddPage(driver);
    }

    public WysiwygEditorPage clickWYSIWYGEditor(){
        clickLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public DynamicContentPage  clickDynamicContent(){
        clickLink("Dynamic Content");
        return new DynamicContentPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        clickLink( "Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public LargeDeepDomPage clickLargeNDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll() {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
}
