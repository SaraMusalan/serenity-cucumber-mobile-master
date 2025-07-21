package co.smusala.ui;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class Home {

    public static final Target DASHBOARD_TEXT = Target.the("Validar LogIn")
            .located(AppiumBy.accessibilityId("Logout Menu Item"));
}
