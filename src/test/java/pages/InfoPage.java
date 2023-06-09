package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;
import static utils.DriverProvider.getCurrentDriver;

public class InfoPage {
    private String loginLinkXpath = "//a[@href='https://www.fithealthy.eu/en/login']";
    private String brandsTabXpath = "//a[@ng-mouseover='menu.setActive(1, $event)']";
    private Actions actions = new Actions(getCurrentDriver());
    private String specificBrandXpath = "//a[@href='/en/taxons/gaspari-nutrition']";

    public void goToLoginPage() {
        //Initialized element
        WebElement loginForm = getCurrentDriver().findElement(By.xpath(loginLinkXpath));
        //Perform action
        loginForm.click();
    }

    public void hoverMouseOnBrandsTab() throws InterruptedException {
        WebElement brandsTab = getCurrentDriver().findElement(By.xpath(brandsTabXpath));
        actions.moveToElement(brandsTab).perform();
        sleep(2000);
    }

    public void chooseSpecificBrand() throws InterruptedException {
        WebElement specificBrand = getCurrentDriver().findElement(By.xpath(specificBrandXpath));
        specificBrand.click();
        sleep(2000);
    }




}
