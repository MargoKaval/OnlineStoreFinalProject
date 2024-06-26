package tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BrandPage;
import pages.InfoPage;
import pages.LoginPage;

public class SortSpecificBrandProductsByHighPriceTest extends BaseTest{
    @Test
    @Parameters({"test_username", "test_password"})
    public void sortSpecificBrandProductsByHighPrice(String email, String paswrd) {
        InfoPage infoPage = new InfoPage();
        LoginPage loginPage = new LoginPage();
        User u = new User(email, paswrd);
        BrandPage brandPage = new BrandPage();

        infoPage.goToLoginPage();
        loginPage.loginToTestAcct(u.getUsername(), u.getPassword());
        infoPage.hoverMouseOnBrandsTab();
        infoPage.chooseSpecificBrand();
        brandPage.clickOutInStockCheckbox();
        brandPage.sortByHighPrice();
        Assert.assertTrue(brandPage.areProductsSortedByHighPrice());
    }
}
