package co.smusala.ui;


import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {

    public static final Target VIEW = Target.the("VIEW")
            .located(AppiumBy.xpath("//androidx.drawerlayout.widget.DrawerLayout[@resource-id=\"com.saucelabs.mydemoapp.android:id/container\"]/android.view.ViewGroup"));
    public static final Target BOTON_MENU_HAMBURGUESA = Target.the("Clic en el menu hamburguesa")
            .located(AppiumBy.xpath("//android.widget.ImageView[@content-desc='View menu']"));

    public static final Target BOTON_OPCION_LOGIN = Target.the("Clic en la opcion LogIn")
            .located(AppiumBy.accessibilityId("Login Menu Item"));

    public static final Target ENTER_USERNAME = Target.the("Ingrese el usuario")
            .located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/nameET"));

    public static final Target ENTER_PASSWORD = Target.the("Ingresar la contraseNa")
            .located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/passwordET"));

    public static final Target BOTON_LOGIN = Target.the("Clic en LogIn")
            .located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/loginBtn"));

}
