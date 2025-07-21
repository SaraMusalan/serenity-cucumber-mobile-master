package co.smusala.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.smusala.ui.Compra.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class CompraApp implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println("Seleccion del menu principal");
        actor.attemptsTo(
                WaitUntil.the(SELECCION_PRODUCTO, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(SELECCION_PRODUCTO),
                Click.on(BOTON_ADD_CART),
                Click.on(BOTON_CARRITO),
                Click.on(BOTON_CHECKOUT),
                Enter.theValue("Sonia").into(ENTER_NAME),
                Enter.theValue("Calle 45").into(ENTER_ADRESS),
                Enter.theValue("Bogota").into(ENTER_CIUDAD),
                Enter.theValue("11011").into(ENTER_ZIP),
                Enter.theValue("Colombia").into(ENTER_PAIS),
                Click.on(BOTON_PAYMENT),
                Enter.theValue("Sonia A").into(ENTER_FULL_NAME),
                Enter.theValue("4512451245124512").into(ENTER_CARD),
                Enter.theValue("41/45").into(ENTER_DATE),
                Enter.theValue("123").into(ENTER_SECURITY),
                Click.on(BOTON_ORDER),
                Click.on(BOTON_PLACE_ORDER)
        );

    }
    public static CompraApp conProductos() {
        return instrumented(CompraApp.class);
    }

}
