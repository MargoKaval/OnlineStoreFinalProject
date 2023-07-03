package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Wait.waitForPageToLoad;
import static utils.DriverProvider.getCurrentDriver;

public class ProductPage {
    private String addToCartBtnXpath = "//form[@name='AddToCartForm']/button[@type='submit']";
    private String checkoutBtnXpath = "//button[@class='btn btn-success']";
    private String basketIndicatorXpath = "//a[@class='f-main-block__cart f-cart-indicator ng-scope'][@href='https://www.fithealthy.eu/en/cart/']";

    public void addToCart() {
        WebElement addToCartBtn = getCurrentDriver().findElement(By.xpath(addToCartBtnXpath));
        addToCartBtn.click();
        waitForPageToLoad();
    }
    public void proceedToBasket() {
        WebElement checkoutBtn = getCurrentDriver().findElement(By.xpath(checkoutBtnXpath));
        WebElement basketIndicator = getCurrentDriver().findElement(By.xpath(basketIndicatorXpath));
        //is enabled here checks if the element is enabled for user interaction
        if (checkoutBtn.isDisplayed() && checkoutBtn.isEnabled()) {
            checkoutBtn.click();
        } else {basketIndicator.click();}
    }
}
