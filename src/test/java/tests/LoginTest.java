package tests;

import models.User;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.InfoPage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    @Parameters({"test_username", "test_password"})
    public void successfulLoginProcedure(String email, String paswrd) {
        //Create necessary page objects
        InfoPage infoPage = new InfoPage();
        LoginPage loginPage = new LoginPage();
        User u = new User(email, paswrd);

        //Run scenario
        infoPage.goToLoginPage();
        loginPage.loginToTestAcct(u.getUsername(), u.getPassword());
        Assert.assertTrue(infoPage.isLogoutBtnPresent());
    }
}
