package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static utils.Wait.waitForPageToLoad;
import static utils.DriverProvider.getCurrentDriver;

public class InfoPage {
    private String loginLinkXpath = "//a[@href='https://www.fithealthy.eu/en/login']";
    private String brandsTabXpath = "//a[@ng-mouseover='menu.setActive(1, $event)']";
    private Actions actions = new Actions(getCurrentDriver());
    private String specificBrandXpath = "//a[@href='/en/taxons/scitec-nutrition']";
    private String logoutBtnXpathForTxt = "//a[@class='f-hdr-links__item-link'][@href='https://www.fithealthy.eu/en/logout']";
    private String expectedLogoutBtnTxt = "Logout";

    public void goToLoginPage() {
        //Initialized element
        WebElement loginForm = getCurrentDriver().findElement(By.xpath(loginLinkXpath));
        //Perform action
        loginForm.click();
    }
    public Boolean isLogoutBtnPresent() {
        String logoutBtnTxt = getCurrentDriver().findElement(By.xpath(logoutBtnXpathForTxt)).getText();
        if (expectedLogoutBtnTxt.equalsIgnoreCase(logoutBtnTxt)) return true;
        else return false;
    }
    public void hoverMouseOnBrandsTab() {
        WebElement brandsTab = getCurrentDriver().findElement(By.xpath(brandsTabXpath));
        actions.moveToElement(brandsTab).perform();
        waitForPageToLoad();
    }
    public void chooseSpecificBrand() {
        WebElement specificBrand = getCurrentDriver().findElement(By.xpath(specificBrandXpath));
        specificBrand.click();
    }
}
