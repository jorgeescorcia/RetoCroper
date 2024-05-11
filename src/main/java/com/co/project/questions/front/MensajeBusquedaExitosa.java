package com.co.project.questions.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.co.project.userinterface.croper.BusquedaProducto.VERIFICAR_NOMBRE_PRODUCTO;

public class MensajeBusquedaExitosa implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(VERIFICAR_NOMBRE_PRODUCTO).answeredBy(actor);
    }

    public static MensajeBusquedaExitosa mensajeBusquedaExitosa(){
        return new MensajeBusquedaExitosa();
    }
}
