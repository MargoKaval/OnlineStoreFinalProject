package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.Wait.waitForPageToLoad;
import static utils.DriverProvider.getCurrentDriver;

public class ProductPage {
    private String specificProductXpath = "//a[@href='/en/products/scitec-nutrition-100%25-whey-isolate-2000-g']";
    private String addToCartBtnXpath = "//form[@name='AddToCartForm']/button[@type='submit']";

    public void clickOnSpecificProduct() {
        WebElement specificProduct = getCurrentDriver().findElement(By.xpath(specificProductXpath));
        specificProduct.click();
    }
    public void addToCart() {
        WebElement addToCartBtn = getCurrentDriver().findElement(By.xpath(addToCartBtnXpath));
        addToCartBtn.click();
        waitForPageToLoad();
    }
}
