package stepsdefinitions.front;


import com.co.project.questions.front.MensajeBusquedaExitosa;
import com.co.project.task.front.AbrirWeb;
import com.co.project.task.front.AplicarFiltros;
import io.cucumber.java.Before;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import stepsdefinitions.setup.front.SetupFront;

import static com.co.project.utils.front.Diccionario.PRODUCTO;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;


public class BusquedaProductoSteps extends SetupFront {


    @Before
    public void prepararTest(){
        setUpTest();
    }

    @Dado("que el usuario esta en la pagina de croper")
    public void que_el_usuario_esta_en_la_pagina_de_croper() {
        theActorInTheSpotlight().wasAbleTo(AbrirWeb.abrirWeb());
    }
    @Cuando("el usuario introduce el nombre del producto en el campo de busqueda")
    public void el_usuario_introduce_el_nombre_del_producto_en_el_campo_de_búsqueda() {
        theActorInTheSpotlight().attemptsTo(AplicarFiltros.aplicarFiltros());

    }
    @Entonces("el usuario deberia ver una lista de productos que coinciden con la busqueda")
    public void el_usuario_deberia_ver_una_lista_de_productos_que_coinciden_con_la_busqueda() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(MensajeBusquedaExitosa.mensajeBusquedaExitosa(),is(equalTo(PRODUCTO))));

    }


}
