package pages;

import abstractPackage.BasePageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;


public class MainPage extends BasePageClass {


    private static final String APPLICATION_URL = "https://stage.4frag.ru/";

    private static final String MAX_PRICE_VALUE = "16000";

    private static final String DPI_AND_CPI_RESOLUTION_VALUE = "23000";

    private static final By BUY_PRODUCT_BUTTON = By.className("item-buy-btn");

    private static final By CLOSE_BUTTON_WINDOW_LOCATOR = By.xpath("//div[@id='notification-type']//button[contains(@class,'close')]");

    private static final By CARD_BUTTON_XPATH = By.xpath("//span[text() = 'Корзина']");

    private static final By LOGIN_PAGE_XPATH = By.xpath("//a[text() = 'Вход/регистрация']");

    private static final By ADD_TO_CAMPARASION_LIST_ICON_XPATH = By.xpath("//div[contains(@class,'center-block')]//a[contains(@class,'item-compare-btn')]");

    private static final By CATEGORY_SECTION_MOUSE_XPATH = By.xpath("//span[contains(text(), 'Игровые мыши')]");
//fixed xpath
    //anyway, its invisible because of some elements overlapping probably.
    //if you want to interact with it, use JavascriptExecutor
    private static final By CHECKBOX_BRAND_OF_CHOSEN_PRODUCT_XPATH = By.xpath("//input[contains(@id, 'm25')]");

    private static final By INPUT_MAX_PRICE = By.id("price-max");

    private static final By COMPARASION_PRODUCTS_XPATH = By.xpath("//span[contains(text(), 'Сравнение товаров')]");

    private static final By PRODUCT_TYPE_DROPDOWN_XPATH = By.xpath("//div[contains(@class, 'col-filter-div')]//select");

    private static final By OPTION_LASER_FROM_PRODUCT_TYPE_XPATH = By.xpath("//div[contains(@class, 'col-filter-div')]//select//option[contains(text(), 'Лазерный')]");

    private static final By INPUT_DPI_AND_CPI_RESOLUTION = By.id("at52-max");

    private static final By SUB_CATEGORY_OPTION_XPATH = By.xpath("//div[contains(@class, 'brands-list')]//div//a");

    private static final By ADDO_TO_WISH_LIST_BUTTON_XPATH = By.xpath("//div[contains(@class, 'center-block')]//a[contains(@class,'item-favourite-small-btn')]");

    private static final By BOOKMARKS_PAGE_BUTTON_XPATH = By.xpath("//span[text() = 'Закладки']");

    // don't use absolutely the same xpath! parameterize them!
    // ex:
      private static final String HEADER_PANEL_BUTTON_XPATH_PATTERN = "//a[text() = '%s']";

    private static final By DELIVERY_PAGE_BUTTON_XPATH = By.xpath("//a[text() = 'Доставка']");

    private static final By WARRANTY_PAGE_BUTTON_XPATH = By.xpath("//a[text() = 'Гарантия']");

    private static final By PAYMENT_PAGE_BUTTON_XPATH = By.xpath("//a[text() = 'Оплата']");

    private static final By DISCOUNT_SYSTEM_PAGE_BUTTON_XPATH = By.xpath("//a[text() = 'Система скидок']");


    public MainPage openHomePage() {
        open(APPLICATION_URL);
        maximizeWindow();
        return this;
    }


    public MainPage addProductToCard() {
        WebElement buyButton = waitForExpectedElement(BUY_PRODUCT_BUTTON);
        buyButton.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }

    public MainPage closePopUpWindow() {
        WebElement closeButton = waitForExpectedElement(CLOSE_BUTTON_WINDOW_LOCATOR);
        closeButton.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }


    public BasketPage goToTheCardPage() {
        WebElement closeButton = waitForExpectedElement(CARD_BUTTON_XPATH);
        closeButton.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return new BasketPage();
    }


    public MainPage addItemToComparasionList() {
        WebElement comparasionButton = waitForExpectedElement(ADD_TO_CAMPARASION_LIST_ICON_XPATH);
        comparasionButton.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }


    public MainPage chooseProductCategory() {
        WebElement sectionProductButton = waitForExpectedElement(CATEGORY_SECTION_MOUSE_XPATH);
        sectionProductButton.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }


    public MainPage checkBrandOfChosenProduct() {
        WebElement chooseBrandCheckbox = waitForExpectedElement(CHECKBOX_BRAND_OF_CHOSEN_PRODUCT_XPATH);
        chooseBrandCheckbox.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }

    public MainPage filloutInputFormaxPrice() {
        WebElement fillOutMaxPrice = waitForExpectedElement(INPUT_MAX_PRICE);
        fillOutMaxPrice.sendKeys(MAX_PRICE_VALUE, Keys.ENTER);
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }

    public MainPage clickOnTheProductTypeDropDown() {
        WebElement productTypeDropDown = waitForExpectedElement(PRODUCT_TYPE_DROPDOWN_XPATH);
        productTypeDropDown.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }

    public MainPage chooseProductFromProductTypeDropDown() {
        WebElement productFromProductTypeDropDown = waitForExpectedElement(OPTION_LASER_FROM_PRODUCT_TYPE_XPATH);
        productFromProductTypeDropDown.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }

    public MainPage filloutInputDPIAndCPIResolutionValue() {
        WebElement fillOutDPIAndCPIResolutionValue = waitForExpectedElement(INPUT_DPI_AND_CPI_RESOLUTION);
        fillOutDPIAndCPIResolutionValue.sendKeys(DPI_AND_CPI_RESOLUTION_VALUE, Keys.ENTER);
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;

    }


    public MainPage chooseProductSubCategoryFromResultList() {
        WebElement subcategoryOption = waitForExpectedElement(SUB_CATEGORY_OPTION_XPATH);
        subcategoryOption.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }

    public MainPage addProductToWishListFromResultList() {
        WebElement wishListButton = waitForExpectedElement(ADDO_TO_WISH_LIST_BUTTON_XPATH);
        wishListButton.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return this;
    }

    public WishListPage openProductInTheWishListPage() {
        WebElement wishListPage = waitForExpectedElement(BOOKMARKS_PAGE_BUTTON_XPATH);
        wishListPage.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return new WishListPage();
    }


    public LoginPage openLoginPage() {
        WebElement loginPage = waitForExpectedElement(LOGIN_PAGE_XPATH);
        loginPage.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return new LoginPage();
    }

    // fixed. do parametrization similar for other places where applicable (where the same xpath witch differs only with text values are used
    public DeliveryPage openDeliveryPage(String buttonText) {
        WebElement deliveryPage = waitForExpectedElement(By.xpath(String.format(HEADER_PANEL_BUTTON_XPATH_PATTERN, buttonText)));
        deliveryPage.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return new DeliveryPage();
    }

    public BasketPage openBasketPage() {
        WebElement basketPage = waitForExpectedElement(CARD_BUTTON_XPATH);
        basketPage.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return new BasketPage();
    }


    public ComparasionListPage openComparasionListPage() {
        WebElement comparasionListPage = waitForExpectedElement(COMPARASION_PRODUCTS_XPATH);
        comparasionListPage.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return new ComparasionListPage();
    }


    public WarrantyPage openWarrantyPage() {
        WebElement warrantyPage = waitForExpectedElement(WARRANTY_PAGE_BUTTON_XPATH);
        warrantyPage.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return new WarrantyPage();
    }

    public PaymentPage openPaymentPage() {
        WebElement paymentPage = waitForExpectedElement(PAYMENT_PAGE_BUTTON_XPATH);
        paymentPage.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return new PaymentPage();
    }

    public DiscountSystemPage openDiscountSystemPage() {
        WebElement discountSystemPage = waitForExpectedElement(DISCOUNT_SYSTEM_PAGE_BUTTON_XPATH);
        discountSystemPage.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return new DiscountSystemPage();
    }

    public BookmarksPage openBookmarksPage() {
        WebElement discountSystemPage = waitForExpectedElement(BOOKMARKS_PAGE_BUTTON_XPATH);
        discountSystemPage.click();
        waitPageIsLoadedAndJQueryIsProcessed();
        return new BookmarksPage();
    }
}




