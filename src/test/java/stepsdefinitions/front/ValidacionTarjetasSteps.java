package stepsdefinitions.front;

import com.co.project.questions.front.VerificarUrl;
import com.co.project.task.front.AbrirWeb;
import com.co.project.task.front.TesterTarjetaPersonalizada;
import com.co.project.task.front.TesterTarjetasAleatoriamente;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import net.serenitybdd.screenplay.GivenWhenThen;
import stepsdefinitions.setup.front.SetupFront;

import static com.co.project.utils.front.Diccionario.VERIFICAR_URL;
import static com.co.project.utils.front.Diccionario.VERIFICAR_URL_PERSONALIZADA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;

public class ValidacionTarjetasSteps extends SetupFront {

    public void prepararTest(){
        setUpTest();
    }


    @Dado("que estoy en la pagina principal")
    public void que_estoy_en_la_pagina_principal() {
        theActorInTheSpotlight().wasAbleTo(AbrirWeb.abrirWeb());
    }
    @Cuando("hago clic sobre una de las tarjetas")
    public void hago_clic_sobre_una_de_las_tarjetas() {
        theActorInTheSpotlight().attemptsTo(TesterTarjetasAleatoriamente.testerTarjetas());
        theActorInTheSpotlight().attemptsTo(TesterTarjetaPersonalizada.testerTarjetaPersonalizada());


    }
    @Entonces("la URL deberia corresponde a la tarjeta seleccionada")
    public void laURLDeberiaCorrespondeALaTarjetaSeleccionada() {
       // theActorInTheSpotlight().should(GivenWhenThen.seeThat(TesterTarjetas.testerTarjetas(UrlContienePalabra.deLaTarjeta()),is(true)));;
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarUrl.value(),is(equalTo(VERIFICAR_URL_PERSONALIZADA))));
    }
}
