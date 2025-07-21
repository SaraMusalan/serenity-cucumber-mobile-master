package co.smusala.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.smusala.ui.Login.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class LoginApp implements Task {

    private final String username;
    private final String password;

    public LoginApp(String username, String password) {
        this.username = username;
        this.password = password;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Seleccion del menu principal");
        System.out.println("¿El menú está visible?: " + BOTON_MENU_HAMBURGUESA.resolveFor(actor).isVisible());
        System.out.println("¿Presente?: " + BOTON_MENU_HAMBURGUESA.resolveFor(actor).isPresent());
        System.out.println("¿Visible?: " + BOTON_MENU_HAMBURGUESA.resolveFor(actor).isVisible());
            actor.attemptsTo(
                    WaitUntil.the(BOTON_MENU_HAMBURGUESA, isVisible()).forNoMoreThan(20).seconds(),
                    Click.on(BOTON_MENU_HAMBURGUESA),
                    Click.on(BOTON_OPCION_LOGIN),
                    Enter.theValue(username).into(ENTER_USERNAME),
                    Enter.theValue(password).into(ENTER_PASSWORD),
                    Click.on(BOTON_LOGIN)
    );
    }

    public static LoginApp conCredenciales(String username, String password) {
        return instrumented(LoginApp.class, username, password);
    }
}