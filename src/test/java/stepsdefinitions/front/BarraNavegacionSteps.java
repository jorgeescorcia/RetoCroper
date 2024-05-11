package stepsdefinitions.front;

import com.co.project.questions.front.VerificarUrl;
import com.co.project.task.front.AbrirWeb;
import com.co.project.task.front.TestearBarraNavegacion;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import stepsdefinitions.setup.front.SetupFront;

import static com.co.project.utils.front.Diccionario.VERIFICAR_URL;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
public class BarraNavegacionSteps  extends SetupFront {

    @Before
    public void prepararTest(){
        setUpTest();
    }

    @Dado("que el usuario esta en la pagina de inicio de Croper")
    public void que_el_usuario_esta_en_la_pagina_de_inicio_de_croper() {
        theActorInTheSpotlight().wasAbleTo(AbrirWeb.abrirWeb());

    }
    @Cuando("el usuario interactua con cada boton de la barra de navegacion")
    public void el_usuario_interactua_con_cada_boton_de_la_barra_de_navegacion() {
        theActorInTheSpotlight().wasAbleTo(TestearBarraNavegacion.testearBarraNavegacion());

    }

    @Entonces("cada boton del menu redirigira a la pagina correspondiente")
    public void cada_botón_del_menu_redirigira_a_la_pagina_correspondiente() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarUrl.value(),is(equalTo(VERIFICAR_URL))));

    }
}
