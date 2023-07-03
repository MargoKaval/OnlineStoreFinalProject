package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Wait.waitForPageToLoad;
import static utils.DriverProvider.getCurrentDriver;

public class ProductPage {
    private String addToCartBtnXpath = "//form[@name='AddToCartForm']/button[@type='submit']";
    private String checkoutBtnXpath = "//button[@class='btn btn-success']";
    private String basketBtnXpath = "//a[@class='f-main-block__cart f-cart-indicator ng-scope'][@href='https://www.fithealthy.eu/en/cart/']";

    public void addToCart() {
        WebElement addToCartBtn = getCurrentDriver().findElement(By.xpath(addToCartBtnXpath));
        addToCartBtn.click();
        waitForPageToLoad();
    }
    public void clickOnCheckout() {
        WebElement checkoutBtn = getCurrentDriver().findElement(By.xpath(checkoutBtnXpath));
        checkoutBtn.click();
    }
    public void goToBasket() {
        WebElement checkoutBtn = getCurrentDriver().findElement(By.xpath(basketBtnXpath));
        checkoutBtn.click();
    }
}
