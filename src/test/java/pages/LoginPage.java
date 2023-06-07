package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPage {
    private WebDriver driver;
    private String loginLinkXpath = "//a[@href='https://www.fithealthy.eu/en/login']";
    private String usernameFieldId = "_username";
    private String passwordFieldId = "_password";
    private String loginBtnXpath = "//button[@class='btn btn-primary btn-lg']";
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginToTestAcct(String email, String paswrd){
        //Initialized element
        WebElement loginForm = driver.findElement(By.xpath(loginLinkXpath));
        //Perform action
        loginForm.click();

        WebElement usernameField = driver.findElement(By.id(usernameFieldId));
        WebElement passwordField = driver.findElement(By.id(passwordFieldId));
        WebElement loginBtn = driver.findElement(By.xpath(loginBtnXpath));

        usernameField.sendKeys(email);
        passwordField.sendKeys(paswrd);
        loginBtn.click();
    }
}
