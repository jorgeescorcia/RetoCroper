package stepsdefinitions.front;


import com.co.project.task.front.AbrirWeb;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;

import io.cucumber.java.es.Entonces;
import stepsdefinitions.setup.front.SetupFront;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSteps extends SetupFront {

    @Before
    public void prepararTest(){
        setUpTest();
    }



    @Dado("que el usuario se encuentra en la pagina de inicio de sesion")
    public void que_el_usuario_se_encuentra_en_la_pagina_de_inicio_de_sesion() {
        theActorInTheSpotlight().wasAbleTo(AbrirWeb.abrirWeb());
    }
    @Cuando("el usuario ingresa un nombre de usuario y una contrasena validos")
    public void el_usuario_ingresa_un_nombre_de_usuario_y_una_contrasena_validos() {

    }
    @Entonces("el usuario debe tener acceso a la pagina de inicio")
    public void el_usuario_debe_tener_acceso_a_la_pagina_de_inicio() {

    }
    @Entonces("si el usuario ingresa los datos incorrectos")
    public void si_el_usuario_ingresa_los_datos_incorrectos() {

    }
    @Entonces("no debe ingresar a la web")
    public void no_debe_ingresar_a_la_web() {

    }




}
