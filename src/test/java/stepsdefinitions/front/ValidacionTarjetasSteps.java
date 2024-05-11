package stepsdefinitions.front;

import com.co.project.task.front.AbrirWeb;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import stepsdefinitions.setup.front.SetupFront;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

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

    }
    @Entonces("la URL debería corresponde a la tarjeta seleccionada")
    public void la_url_debería_corresponde_a_la_tarjeta_seleccionada() {

    }
}
