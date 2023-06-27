package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.DriverProvider.getCurrentDriver;
public class BasketPage {
    //private String checkoutBrnXpath = "//div[@class='modal-footer']/button[@ng-click='form.onCheckout()']";
    private String basketBtnXpath="//a[@class='f-main-block__cart f-cart-indicator ng-scope'][@href='https://www.fithealthy.eu/en/cart/']";
    private String removeBtnXpath = "//td/a[@href='#']";
    public void goToBasket() {
        WebElement checkoutBtn = getCurrentDriver().findElement(By.xpath(basketBtnXpath));
        checkoutBtn.click();
    }
    public void clearBasket(){
        WebElement removeBtn = getCurrentDriver().findElement(By.xpath(removeBtnXpath));
        removeBtn.click();
    }
}
