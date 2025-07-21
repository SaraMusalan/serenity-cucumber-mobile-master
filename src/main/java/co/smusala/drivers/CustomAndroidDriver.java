package co.smusala.drivers;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import java.net.URL;
import java.time.Duration;

public class CustomAndroidDriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("emulator-5554")
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setApp("C:/Users/Saram/IdeaProjects/Mobile/serenity-cucumber-mobile-master/src/test/resources/apps/mda.apk")
                .setAppWaitActivity("com.saucelabs.mydemoapp.android.view.activities.MainActivity")
                .setAppWaitDuration(Duration.ofSeconds(30));
        try {
            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
            System.out.println("Driver iniciado correctamente: " + driver.getClass().getSimpleName());
            return driver;
        } catch (Exception e) {
            throw new RuntimeException("Error creando el driver de Appium", e);
        }
    }

    @Override
    public boolean takesScreenshots() {
        return true;
    }
}