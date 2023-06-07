package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
    public void successfulLoginProcedure() {
        //Create necessary page objects
        LoginPage loginPage = new LoginPage(driver);

        //Run scenario
        loginPage.loginToTestAcct("merame@inbox.lv", "itisSTR0NGpass");
    }
}
