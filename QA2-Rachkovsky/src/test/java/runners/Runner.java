package runners;

import pages.HomePage;
import pages.ProductPage;
import pages.OrderPage;
import models.ProductModel;
import models.UserModel;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.assertEquals;

public class Runner {
    public Common commonTest = new Common();
    public HomePage homePageTest = new HomePage();
    public ProductPage productPageTest = new ProductPage();
    public OrderPage orderPageTest = new OrderPage();
    public ProductModel productModelTest = new ProductModel();
    public UserModel userModelTest = new UserModel();

    @Before
    public void runnerBefore() {
        commonTest.startChromeDriver();
//        commonTest.startChromeDriverHeadless();
    }

    @Test
    public void runnerTest() throws InterruptedException {
        userModelTest.setFirstNameGS("AAA");
        userModelTest.setLastNameGS("BBB");
        userModelTest.setEmailAddressGS("CCC@CCC.com");
        userModelTest.setPhoneNumberGS("+37100000000");

        homePageTest.startWebpage();
        homePageTest.bannerMainClick();
        homePageTest.bannerSecondaryClick();
        homePageTest.cookieClick();
        homePageTest.categoryClick();
        homePageTest.bannerMainClick();
        homePageTest.subCategoryClick();
        homePageTest.bannerMainClick();
        homePageTest.subSubCategoryClick();
        homePageTest.bannerMainClick();
        homePageTest.filterClick();
        homePageTest.filterSelectClick();
        homePageTest.filterSelectProductClick();

        productModelTest.setProductNameCompareGS(productPageTest.productNameCompare());
        productModelTest.setProductPriceCompareGS(productPageTest.productPriceCompare());
        productPageTest.addClick();
        productPageTest.cartClick();

        orderPageTest.cartConfirmationClick();
        orderPageTest.registrationClick();
        orderPageTest.firstNameKeys(userModelTest.getFirstNameGS());
        orderPageTest.lastNameKeys(userModelTest.getLastNameGS());
        orderPageTest.emailAddressKeys(userModelTest.getEmailAddressGS());
        orderPageTest.phoneNumberKeys(userModelTest.getPhoneNumberGS());
        orderPageTest.newsClick();
        orderPageTest.newsConfirmationClick();
        orderPageTest.termsClick();
        orderPageTest.deliveryClick();
        orderPageTest.proceedButtonClick();
        orderPageTest.paymentTypeClick();
        orderPageTest.paymentProceedButtonClick();
        userModelTest.setOrderNameCompareGS(orderPageTest.orderNameCompare());
        userModelTest.setOrderPriceCompareGS(orderPageTest.orderPriceCompare());
        userModelTest.setOrderClientCompareGS(orderPageTest.orderClientCompare());
        userModelTest.setOrderClientInputCompareGS(userModelTest.getFirstNameGS() + " " + userModelTest.getLastNameGS() + "\n" + userModelTest.getEmailAddressGS() + "\n" + userModelTest.getPhoneNumberGS());

        assertEquals(productModelTest.getProductNameCompareGS().toLowerCase(),userModelTest.getOrderNameCompareGS().toLowerCase());
        assertEquals(productModelTest.getProductPriceCompareGS(),userModelTest.getOrderPriceCompareGS());
        assertEquals(userModelTest.getOrderClientInputCompareGS(),userModelTest.getOrderClientCompareGS());
    }

    @After
    public void runnerAfter() throws InterruptedException {
        commonTest.stopChromeDriver();
    }
}
