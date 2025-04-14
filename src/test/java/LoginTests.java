import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTest {

    @Test
    void shouldBeAbleToLogin() {
        LoginPage loginPage = homePage.load().clickFormAuthentication();
        SecureAreaPage secureAreaPage = loginPage.
                enterUsername("tomsmith").
                enterPassword("SuperSecretPassword!").
                clickLoginBtn();

        assertTrue(secureAreaPage.getCurrentPageURL().contains("/secure"));
    }

    @Test
    void shouldFailToLoginWithIncorrectPassword(){
        LoginPage loginPage = homePage.load().clickFormAuthentication();
        loginPage.
                enterUsername("tomsmith").
                enterPassword("SuperWrongPassword!").
                clickLoginBtn();

        String bannerTest = loginPage.getBannerAlertText();
        assertTrue(bannerTest.contains("Your password is invalid!"));
    }

}
