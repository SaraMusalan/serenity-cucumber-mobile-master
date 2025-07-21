package co.smusala.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class Compra {

    public static final Target SELECCION_PRODUCTO = Target.the("Clic en el producto a seleccional")
            .located(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/productIV\").instance(1)"));
    public static final Target BOTON_ADD_CART = Target.the("Clic en Add to cart")
            .located(AppiumBy.accessibilityId("Tap to add product to cart"));
    public static final Target BOTON_CARRITO = Target.the("Clic en el carrito de compras")
            .located(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/cartIV\")"));
    public static final Target BOTON_CHECKOUT = Target.the("Clic en Proceed to Checkout")
            .located(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/cartBt\")"));
    public static final Target ENTER_NAME = Target.the("Ingrese el nombre completo")
            .located(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/fullNameET\")"));
    public static final Target ENTER_ADRESS = Target.the("Ingresar direccion")
            .located(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/address1ET\")"));
    public static final Target ENTER_CIUDAD = Target.the("Ingresar la ciudad")
            .located(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/cityET\")"));
    public static final Target ENTER_ZIP = Target.the("Ingrese el Zip Code")
            .located(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/zipET\")"));
    public static final Target ENTER_PAIS = Target.the("Ingrese el pais")
            .located(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/countryET\")"));
    public static final Target BOTON_PAYMENT = Target.the("Clic en To Payment")
            .located(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/paymentBtn\")"));
    public static final Target ENTER_FULL_NAME = Target.the("Ingresar datos de TC, nombre")
            .located(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/nameET\")"));
    public static final Target ENTER_CARD = Target.the("Ingrese el numero de la tarjeta")
            .located(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/cardNumberET\")"));
    public static final Target ENTER_DATE = Target.the("Ingrese la fecha de expiracion")
            .located(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/expirationDateET\")"));
    public static final Target ENTER_SECURITY = Target.the("Ingrese el codigo de seguridad")
            .located(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/securityCodeET\")"));
    public static final Target BOTON_ORDER = Target.the("Clic en Review Order")
            .located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/paymentBtn"));
    public static final Target BOTON_PLACE_ORDER = Target.the("Clic en Place Order")
            .located(AppiumBy.id("com.saucelabs.mydemoapp.android:id/paymentBtn"));
    public static final Target VIEW_CHECKOUT = Target.the("Visuaizar la compra")
            .located(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"com.saucelabs.mydemoapp.android:id/completeTV\")"));
}
