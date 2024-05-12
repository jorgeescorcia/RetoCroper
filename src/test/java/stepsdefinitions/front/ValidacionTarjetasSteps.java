package stepsdefinitions.front;

import com.co.project.questions.front.CompararURL;
import com.co.project.questions.front.ObtenerURLTarjeta;
import com.co.project.questions.front.UrlContienePalabra;
import com.co.project.task.front.AbrirWeb;
import com.co.project.task.front.TesterTarjetas;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.targets.Target;
import stepsdefinitions.setup.front.SetupFront;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;

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
        theActorInTheSpotlight().attemptsTo(TesterTarjetas.testerTarjetas());


    }
    @Entonces("la URL deberia corresponde a la tarjeta seleccionada")
    public void laURLDeberiaCorrespondeALaTarjetaSeleccionada() {
       theActorInTheSpotlight().should(GivenWhenThen.seeThat(UrlContienePalabra.deLaTarjeta(TesterTarjetas.testerTarjetas().getRandomCard()), is(true)));

    }
}
