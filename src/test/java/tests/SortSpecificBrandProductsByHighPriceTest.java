package tests;

import models.User;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.BrandPage;
import pages.InfoPage;
import pages.LoginPage;

public class SortSpecificBrandProductsByHighPriceTest extends BaseTest{
    @Test
    @Parameters({"test_username", "test_password"})
    public void sortByHighPriceSpecBrandProduct(String email, String paswrd) {
        InfoPage infoPage = new InfoPage();
        LoginPage loginPage = new LoginPage();
        User u = new User(email, paswrd);
        BrandPage brandPage = new BrandPage();

        infoPage.goToLoginPage();
        loginPage.loginToTestAcct(u.getUsername(), u.getPassword());
        infoPage.hoverMouseOnBrandsTab();
        infoPage.chooseSpecificBrand();
        brandPage.clickCheckbox();
        brandPage.sortByHighPrice();
    }
}
