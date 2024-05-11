package com.co.project.task.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static com.co.project.userinterface.croper.BusquedaProducto.INPUT_BUSQUEDA;
import static com.co.project.userinterface.croper.BusquedaProducto.INPUT_BUSQUEDA_POPUP;
import static com.co.project.utils.front.Diccionario.PRODUCTO;

public class AplicarFiltros implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(INPUT_BUSQUEDA),
                Click.on(INPUT_BUSQUEDA_POPUP),
                Enter.theValue(PRODUCTO).into(INPUT_BUSQUEDA_POPUP),
                Hit.the(Keys.ENTER).into(INPUT_BUSQUEDA_POPUP)
        );

    }


    public static AplicarFiltros aplicarFiltros(){
        return Tasks.instrumented(AplicarFiltros.class);
    }

}
