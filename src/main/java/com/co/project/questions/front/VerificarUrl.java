package com.co.project.questions.front;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class VerificarUrl implements Question<String> {
    @Override
    @Step("{0} checks the URL of the new tab")
    public String answeredBy(Actor actor) {
        // Cambia a la última pestaña abierta
        for (String windowHandle : BrowseTheWeb.as(actor).getDriver().getWindowHandles()) {
            BrowseTheWeb.as(actor).getDriver().switchTo().window(windowHandle);
        }

        // Obtiene la URL de la nueva pestaña
        String urlNuevaPrestaña = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();

        return urlNuevaPrestaña;
    }

    public static VerificarUrl value() {
        return new VerificarUrl();
    }
}