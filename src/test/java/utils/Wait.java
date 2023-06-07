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
}
