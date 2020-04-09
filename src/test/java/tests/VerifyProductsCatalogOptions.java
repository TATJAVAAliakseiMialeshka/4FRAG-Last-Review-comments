package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.WishListPage;

public class VerifyProductsCatalogOptions extends MainPage {

    @Test
    public void testChooseProductFromCatalog() {

        WishListPage wishListPage =  new MainPage()
                .openHomePage()
                .chooseProductCategory()
               // .checkBrandOfChosenProduct()
                .filloutInputFormaxPrice()
                .clickOnTheProductTypeDropDown()
                .chooseProductFromProductTypeDropDown()
                .filloutInputDPIAndCPIResolutionValue()
                .chooseProductSubCategoryFromResultList()
                .addProductToWishListFromResultList()
                .closePopUpWindow()
                .openProductInTheWishListPage();
        Assert.assertTrue(wishListPage.isProductIsAddedToTheWishListPage());
    }
}
