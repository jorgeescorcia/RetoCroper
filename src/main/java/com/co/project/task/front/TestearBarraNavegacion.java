package com.co.project.task.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;
import net.serenitybdd.screenplay.actions.Switch;

import static com.co.project.userinterface.croper.BarraDeNavegacion.*;

public class TestearBarraNavegacion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(
                Click.on(BTN_CATEGORIAS),
                Click.on(BTN_SEMILLAS),
                DoubleClick.on(BTN_SEMILLAS_INOCULANTES),
                Click.on(BTN_OFERTAS),
                Click.on(BTN_TIENDAS),
                Click.on(BTN_SEGUROS),
                Click.on(BTN_CREDITOS),
                DoubleClick.on(BTN_ENTIDADES_FINANCIERAS),


                Click.on(BTN_LISTAPRODUCTOS),
                Click.on(BTN_PAQUETES_TECNOLOGICOS),
                Click.on(BTN_VENDER),
                Click.on(BTN_GESTION),
                Click.on(BTN_NOTICIAS),
                Switch.toNewWindow()
        );

    }

    public static TestearBarraNavegacion testearBarraNavegacion(){
        return Tasks.instrumented(TestearBarraNavegacion.class);
    }
}
