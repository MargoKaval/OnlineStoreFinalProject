package tests;

import models.User;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.*;

public class RemoveFromBasketTest extends BaseTest{
    @Test
    @Parameters({"test_username", "test_password"})
    public void removeFromBasket(String email, String paswrd) {
        InfoPage infoPage = new InfoPage();
        LoginPage loginPage = new LoginPage();
        User u = new User(email, paswrd);
        BrandPage brandPage = new BrandPage();
        ProductPage productPage = new ProductPage();
        BasketPage basketPage = new BasketPage();

        infoPage.goToLoginPage();
        loginPage.loginToTestAcct(u.getUsername(), u.getPassword());
        infoPage.hoverMouseOnBrandsTab();
        infoPage.chooseSpecificBrand();
        brandPage.clickCheckbox();
        brandPage.sortByHighPrice();
        productPage.clickOnSpecificProduct();
        productPage.addToCart();
        basketPage.goToBasket();
        basketPage.clearBasket();
    }
}
