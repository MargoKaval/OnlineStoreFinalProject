package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.DriverProvider.getCurrentDriver;
import static utils.Wait.waitForPageToLoad;

public class BrandPage {
    private String wheyProteinCheckboxXpath = "//li/label/input[@value='217']";
    private String inStockCheckboxXpath = "//label/input[@ng-model='grid.inStockFirst']";
    private String dropdownSortByXpath = "//div[@class='btn-group f-lang-switch-form__select']/button[@class='btn btn-default btn-sm dropdown-toggle']";
    private String highPriceSortingCSS = "a[ng-click=\"$event.preventDefault(); grid.onSelectSorting('price', 'desc');\"]";

    public void clickCheckbox() {
        WebElement wheyProteinCheckbox = getCurrentDriver().findElement(By.xpath(wheyProteinCheckboxXpath));
        wheyProteinCheckbox.click();
        waitForPageToLoad();

        WebElement inStockCheckbox = getCurrentDriver().findElement(By.xpath(inStockCheckboxXpath));
        inStockCheckbox.click();
        waitForPageToLoad();
    }
    public void sortByHighPrice() {
        WebElement dropdownSortBy = getCurrentDriver().findElement(By.xpath(dropdownSortByXpath));
        dropdownSortBy.click();

        WebElement highPriceSorting = getCurrentDriver().findElement(By.cssSelector(highPriceSortingCSS));
        highPriceSorting.click();
        //need this sleep to be able to click on specific product otherwise test fails
        waitForPageToLoad();
    }
}
