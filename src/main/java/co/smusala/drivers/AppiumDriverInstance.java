package co.smusala.drivers;

import io.appium.java_client.android.AndroidDriver;

public class AppiumDriverInstance {
    static AndroidDriver driver;

    public static AndroidDriver getDriver() {
        if (driver == null) {
            driver = (AndroidDriver) new CustomAndroidDriver().newDriver();
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
