package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;
import static utils.DriverProvider.getCurrentDriver;

public class BrandPage {
    private String checkboxWheyProteinXpath = "//li/label/input[@value='217']";
    private String dropdownSortByXpath = "//div[@class='btn-group f-lang-switch-form__select']/button[@class='btn btn-default btn-sm dropdown-toggle']";
    private String highPriceSortingCSS = "a[ng-click=\"$event.preventDefault(); grid.onSelectSorting('price', 'desc');\"]";

    public void clickCheckbox() throws InterruptedException {
        WebElement checkboxWheyProtein = getCurrentDriver().findElement(By.xpath(checkboxWheyProteinXpath));
        checkboxWheyProtein.click();
        sleep(3000);
    }

    public void sortByHighPrice() {
        WebElement dropdownSortBy = getCurrentDriver().findElement(By.xpath(dropdownSortByXpath));
        dropdownSortBy.click();

        WebElement highPriceSorting = getCurrentDriver().findElement(By.cssSelector(highPriceSortingCSS));
        highPriceSorting.click();
    }
}
