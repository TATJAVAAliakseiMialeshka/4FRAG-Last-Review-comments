package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.PersonalAreaPage;


public class VerifyLoginFunctionality extends MainPage {


    @Test
    public void testLoginOption() {
        PersonalAreaPage loginPage = new MainPage()
                .openHomePage()
                .openLoginPage()
                .fillOutEmailField()
                .fillOutPasswordField();
        // even if there are no parametrization, when some specific text is used it's better to send it from test level rather than hardcode it on the page.
        // Подписка text should be better send from here
        Assert.assertTrue(loginPage.isPersonalPageHeaderDisplayed());
    }
}
