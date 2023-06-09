package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static utils.DriverProvider.getCurrentDriver;
import static utils.Wait.waitToLoad;

public class BaseTest {
    @BeforeMethod
    public void setUp() {
        getCurrentDriver().get("https://www.fithealthy.eu/en/");
        waitToLoad();
    }
    /*@AfterMethod
    public void tearDown() { getCurrentDriver().quit(); }*/
}
