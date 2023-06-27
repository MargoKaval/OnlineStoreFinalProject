package utils;

import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static utils.DriverProvider.getCurrentDriver;

public class Wait {
    static WebDriverWait wait;
    public static WebDriverWait waitToLoad() {
        if (wait == null) {
            init();
        }
        return wait;
    }
    private static void init() {
        wait = new WebDriverWait(getCurrentDriver(), Duration.ofSeconds(2));
    }

    //below is a custom method that pauses the execution for 3 seconds
    public static void waitForPageToLoad() {
        try {Thread.sleep(2000);}
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
