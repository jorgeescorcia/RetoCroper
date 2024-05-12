package com.co.project.questions.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

import static com.co.project.userinterface.croper.Tarjetas.*;

public class UrlContienePalabra implements Question<Boolean> {

    private Target tarjeta;

    public UrlContienePalabra(Target tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String urlActual = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();

        System.out.println("Esta es la web actual: "+urlActual);
        if (tarjeta.equals(INSUMOS_AGRICOLAS)) {
            return urlActual.toLowerCase().contains("Insumo");
        }
        if (tarjeta.equals(PRODUCTOS_FINALES)) {
            return urlActual.toLowerCase().contains("final");
        }
        if (tarjeta.equals(TIENDAS)) {
            return urlActual.toLowerCase().contains("stores");
        }
        if (tarjeta.equals(GESTION_FINCAS)) {
            return urlActual.toLowerCase().contains("login");
        }
        if (tarjeta.equals(CREDITO)) {
            return urlActual.toLowerCase().contains("banks");
        }

        if (tarjeta.equals(OFERTAS)) {
            return urlActual.toLowerCase().contains("offers");
        }
        return false;
    }

    public static UrlContienePalabra deLaTarjeta(Target tarjeta) {
        return new UrlContienePalabra(tarjeta);
    }
}
