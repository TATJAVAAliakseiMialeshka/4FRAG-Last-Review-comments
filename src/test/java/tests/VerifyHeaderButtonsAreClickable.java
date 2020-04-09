package tests;


import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;

//class name don't match to what we do here
//we test that we can open pages from header tabs
//I'd call it like TestHeaderButtonsNavigateToCorrectPage
public class VerifyHeaderButtonsAreClickable extends MainPage {

//we not just test that page is displayed. because the page opens not by direct url through browser. we test that after specific control is clicked - specific page is opened
    // ex: testLoginButtonNavigatesToLoginPage
    // testLoginPageOpensAfterDeliveryPageIsClicked
    // testLoginPageCanBeOpenedWithLoginButton
    // verifyLoginPageDestinationPage
    // etc
    // fix methods name according to what they do.
    @Test
    public void testLoginWindowIsDisplayed() {
        LoginPage loginPage = new MainPage()
                .openHomePage()
                .openLoginPage();
        Assert.assertTrue(loginPage.isLoginPageHeaderDisplayed());
    }

    @Parameters({ "tab-btn-text-delivery" })
    @Test
    public void testDeliveryPageIsDisplayed(String param) {

        DeliveryPage deliveryPage = new MainPage()
                .openHomePage()
//send param either from xml or directly from the test. don't hardcode the same xpathes on page objects
                .openDeliveryPage(param);
        Assert.assertTrue(deliveryPage.isDeliveryPageHeaderDisplayed());
    }

    @Test
    public void testBasketPageIsDisplayed() {

        BasketPage basketPage = new MainPage()
                .openHomePage()
                .openBasketPage();
        Assert.assertTrue(basketPage.isBasketPageHeaderDisplayed());
    }

    @Test
    public void testComparasionListPageIsDisplayed() {

        ComparasionListPage comparasionListPage = new MainPage()
                .openHomePage()
                .openComparasionListPage();
        Assert.assertTrue(comparasionListPage.isComparasionListPageHeaderDisplayed());
    }


    @Test
    public void testWarrantyPageIsDisplayed() {

        WarrantyPage warrantyPage = new MainPage()
                .openHomePage()
                .openWarrantyPage();
        Assert.assertTrue(warrantyPage.isWarrantyPageHeaderDisplayed());
    }


    @Test
    public void testPaymentPageIsDisplayed() {
        PaymentPage paymentPage = new MainPage()
                .openHomePage()
                .openPaymentPage();
        Assert.assertTrue(paymentPage.isPaymentPageHeaderDisplayed());

    }


    @Test
    public void testWishListPageIsDisplayed() {
        WishListPage wishListPage = new MainPage()
                .openHomePage()
                .openProductInTheWishListPage();
        Assert.assertTrue(wishListPage.isWishListPageHeaderDisplayed());

    }

    @Test
    public void testDiscountSystemPageIsDisplayed() {
        DiscountSystemPage discountSystemPage = new MainPage()
                .openHomePage()
                .openDiscountSystemPage();
        Assert.assertTrue(discountSystemPage.isDiscountSystemPageHeaderDisplayed());

    }

    @Test
    public void testBookmarksPageIsDisplayed() {
       BookmarksPage bookmarksPage = new MainPage()
                .openHomePage()
                .openBookmarksPage();
        Assert.assertTrue(bookmarksPage.isBookmarksPageHeaderDisplayed());

    }
}






