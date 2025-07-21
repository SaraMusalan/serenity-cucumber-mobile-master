package co.smusala.stepdefinitions;

import co.smusala.drivers.AppiumDriverInstance;
import co.smusala.questions.SuccessCompra;
import co.smusala.questions.SuccessLogin;
import co.smusala.tasks.CompraApp;
import co.smusala.tasks.LoginApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class stepsDefinitions {

    @Given("{string} abre la app My Demo App")
    public void abreLaAppMyDemoApp(String actor) {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor")
                .can(BrowseTheMobileApp.with(AppiumDriverInstance.getDriver()));
    }

    @When("ingresa con las credenciales {string} y {string}")
    public void ingresaConLasCredencialesY(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginApp.conCredenciales(username, password));
    }

    @Then("inicia sesion exitosamente")
    public void iniciaSesionExitosamente() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(SuccessLogin.isVisible()));
    }


    @Given("{string} se encuentra logeado en la app My Demo App")
    public void seEncuentraLogeadoEnLaAppMyDemoApp(String actor) {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("actor").can(BrowseTheMobileApp.with(AppiumDriverInstance.getDriver()));
    }
    @When("selecciona productos")
    public void seleccionaProductos() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CompraApp.conProductos());
    }
    @Then("finaliza la compra exitosa")
    public void finalizaLaCompraExitosa() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(SuccessCompra.isVisible()));
    }
}
