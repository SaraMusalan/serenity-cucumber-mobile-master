package co.smusala.stepdefinitions;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Ability;

public class BrowseTheMobileApp implements Ability {
    private final AppiumDriver driver;

    public BrowseTheMobileApp(AppiumDriver driver) {
        this.driver = driver;
    }

    public static BrowseTheMobileApp with(AppiumDriver driver) {
        return new BrowseTheMobileApp(driver);
    }

    public AppiumDriver getDriver() {
        return driver;
    }
}
