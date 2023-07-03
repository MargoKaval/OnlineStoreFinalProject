package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.DriverProvider.getCurrentDriver;
import static utils.Wait.waitForPageToLoad;

public class BasketPage {
    //private String checkoutBtnXpath = "//div[@class='modal-footer']/button[@ng-click='form.onCheckout()']";
    private String removeBtnXpath = "//td/a[@href='#']";
    private String quantityOfItemsInBasketXpath = "//p/span[@ng-bind='basket.getCount()']";
    private String expectedItemsQuantity = "0";

    public void clearBasket(){
        WebElement removeBtn = getCurrentDriver().findElement(By.xpath(removeBtnXpath));
        removeBtn.click();
        waitForPageToLoad();
    }
    public Boolean isBasketEmpty() {
        String infoTxt = getCurrentDriver().findElement(By.xpath(quantityOfItemsInBasketXpath)).getText();
        if (expectedItemsQuantity.equalsIgnoreCase(infoTxt)) return true;
        else return false;
    }
}
