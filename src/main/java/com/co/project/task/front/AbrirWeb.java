package com.co.project.task.front;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static com.co.project.utils.front.Diccionario.URL_BASE;

public class AbrirWeb implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.url(URL_BASE)
        );
    }

    public static AbrirWeb abrirWeb(){
        return Tasks.instrumented(AbrirWeb.class);
    }
}
