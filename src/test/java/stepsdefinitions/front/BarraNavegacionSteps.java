package stepsdefinitions.front;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import stepsdefinitions.setup.front.SetupFront;

public class BarraNavegacionSteps  extends SetupFront {

    @Before
    public void prepararTest(){
        setUpTest();
    }

    @Dado("que el usuario está en la página de inicio de Croper")
    public void que_el_usuario_está_en_la_página_de_inicio_de_croper() {

    }
    @Cuando("el usuario interactúa con cada botón de la barra de navegación")
    public void el_usuario_interactúa_con_cada_botón_de_la_barra_de_navegación() {

    }
    @Entonces("cada botón debería responder al clic del usuario")
    public void cada_botón_debería_responder_al_clic_del_usuario() {

    }
}
