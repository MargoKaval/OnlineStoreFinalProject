package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static utils.DriverProvider.getCurrentDriver;

public class ProductPage {
    private String specificProductXpath = "//div/a[@href='/en/products/gaspari-nutrition-proven-whey']";

    /*public void clickOnSpecificProduct() {
        WebElement specificProduct = getCurrentDriver().findElement(By.cssSelector(specificProductXpath));
        specificProduct.click();
    }*/
}
