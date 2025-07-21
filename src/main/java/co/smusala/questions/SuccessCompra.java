package co.smusala.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.smusala.ui.Compra.VIEW_CHECKOUT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SuccessCompra implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor){
        WaitUntil.the(VIEW_CHECKOUT, isEnabled()).forNoMoreThan(15).seconds();
        return VIEW_CHECKOUT.resolveFor(actor).isVisible();
    }

    public static SuccessCompra isVisible(){
        return new SuccessCompra();
    }
}
