package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;
import static utils.DriverProvider.getCurrentDriver;

public class LoginPage {
    private String loginLinkXpath = "//a[@href='https://www.fithealthy.eu/en/login']";
    private String usernameFieldId = "_username";
    private String passwordFieldId = "_password";
    private String loginBtnXpath = "//button[@class='btn btn-primary btn-lg']";

    public void loginToTestAcct(String email, String paswrd) throws InterruptedException {
        //Initialized element
        WebElement loginForm = getCurrentDriver().findElement(By.xpath(loginLinkXpath));
        //Perform action
        loginForm.click();

        WebElement usernameField = getCurrentDriver().findElement(By.id(usernameFieldId));
        WebElement passwordField = getCurrentDriver().findElement(By.id(passwordFieldId));
        WebElement loginBtn = getCurrentDriver().findElement(By.xpath(loginBtnXpath));

        usernameField.sendKeys(email);
        passwordField.sendKeys(paswrd);
        loginBtn.click();
        sleep(5000);
    }
}
