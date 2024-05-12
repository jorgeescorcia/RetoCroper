package com.co.project.questions.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class ObtenerURLTarjeta implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).getDriver().getCurrentUrl();
    }

    public static ObtenerURLTarjeta actual() {
        return new ObtenerURLTarjeta();
    }
}
