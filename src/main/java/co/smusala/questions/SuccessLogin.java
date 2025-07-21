package co.smusala.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.smusala.ui.Home.DASHBOARD_TEXT;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class SuccessLogin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor){
        WaitUntil.the(DASHBOARD_TEXT, isEnabled()).forNoMoreThan(15).seconds();
        return DASHBOARD_TEXT.resolveFor(actor).isVisible();
    }

    public static SuccessLogin isVisible(){
        return new SuccessLogin();
    }

}
