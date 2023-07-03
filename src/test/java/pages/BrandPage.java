package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.DriverProvider.getCurrentDriver;
import static utils.Wait.waitForPageToLoad;

public class BrandPage {
    private String inStockCheckboxXpath = "//label/input[@ng-model='grid.inStockFirst']";
    private String dropdownSortByXpath = "//div[@class='btn-group f-lang-switch-form__select']/button[@class='btn btn-default btn-sm dropdown-toggle']";
    private String highPriceSortingCSS = "a[ng-click=\"$event.preventDefault(); grid.onSelectSorting('price', 'desc');\"]";
    private String wheyProteinCheckboxXpath = "//li/label/input[@value='217']";
    private String highPriceSortingXpath = "//button/span[@class='ng-binding']";
    private String expectedSortingTxt = "High price";
    private String firstInListProductXpath = "(//div/a[@class='f-product'])[1]";

    public void clickInStockCheckbox() {
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
    public void clickSpecificFilterCheckbox() {
        WebElement wheyProteinCheckbox = getCurrentDriver().findElement(By.xpath(wheyProteinCheckboxXpath));
        wheyProteinCheckbox.click();
        waitForPageToLoad();
    }
    public void clickOnFirstProductInList() {
        WebElement specificProduct = getCurrentDriver().findElement(By.xpath(firstInListProductXpath));
        specificProduct.click();
    }
    public Boolean areProductsSortedByHighPrice() {
        String highPriceSortingTxt = getCurrentDriver().findElement(By.xpath(highPriceSortingXpath)).getText();
        if (expectedSortingTxt.equalsIgnoreCase(highPriceSortingTxt)) return true;
        else return false;
    }
}
