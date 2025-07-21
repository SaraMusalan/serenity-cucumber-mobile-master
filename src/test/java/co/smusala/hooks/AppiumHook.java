package co.smusala.hooks;

import co.smusala.drivers.AppiumDriverInstance;
import co.smusala.stepdefinitions.BrowseTheMobileApp;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.smusala.utils.Hook.descargarSiNoExiste;

public class AppiumHook {

        @Before
        public void setUp() {
            // Si usas descarga automática de APK
            descargarSiNoExiste("https://github.com/saucelabs/my-demo-app-android/releases/download/2.2.0/mda-2.2.0-25.apk", "src/test/resources/apps/mda.apk");

            OnStage.setTheStage(new OnlineCast());

            OnStage.theActorCalled("Actor")
                   .can(BrowseTheMobileApp.with(AppiumDriverInstance.getDriver()));
        }

    @After
    public void tearDown() {
        AppiumDriverInstance.closeDriver();
    }
    }

