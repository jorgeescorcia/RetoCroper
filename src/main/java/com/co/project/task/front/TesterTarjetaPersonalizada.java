package com.co.project.task.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.co.project.userinterface.croper.Tarjetas.INSUMOS_AGRICOLAS;

public class TesterTarjetaPersonalizada implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(INSUMOS_AGRICOLAS)
        );


    }

    public static TesterTarjetaPersonalizada testerTarjetaPersonalizada(){
       return Tasks.instrumented(TesterTarjetaPersonalizada.class);
    }
}
