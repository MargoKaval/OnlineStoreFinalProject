package tests;

import models.User;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    @Parameters({"test_username", "test_password"})
    public void successfulLoginProcedure(String email, String paswrd) throws InterruptedException {
        //Create necessary page objects
        LoginPage loginPage = new LoginPage();
        User u = new User(email, paswrd);

        //Run scenario
        loginPage.loginToTestAcct(u.getUsername(), u.getPassword());
    }
}
