package com.co.project.questions.front;

import com.co.project.task.front.TesterTarjetas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import org.hamcrest.Matcher;

import static com.co.project.userinterface.croper.Tarjetas.*;


public class UrlContienePalabra implements Question<String> {

    private Target tarjeta;

    public UrlContienePalabra(Target tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String answeredBy(Actor actor) {
        String urlActual = BrowseTheWeb.as(actor).getDriver().getCurrentUrl();

        System.out.println("Esta es la web actual: " + urlActual);
        if (tarjeta.equals(INSUMOS_AGRICOLAS)) {
            return urlActual.toLowerCase().contains("Insumo") ? "true" : "false";
        } else if (tarjeta.equals(PRODUCTOS_FINALES)) {
            return urlActual.toLowerCase().contains("final") ? "true" : "false";
        } else if (tarjeta.equals(TIENDAS)) {
            return urlActual.toLowerCase().contains("stores") ? "true" : "false";
        } else if (tarjeta.equals(GESTION_FINCAS)) {
            return urlActual.toLowerCase().contains("login") ? "true" : "false";
        } else if (tarjeta.equals(CREDITO)) {
            return urlActual.toLowerCase().contains("banks") ? "true" : "false";
        } else if (tarjeta.equals(OFERTAS)) {
            return urlActual.toLowerCase().contains("offers") ? "true" : "false";
        }
        return  urlActual;
    }





    public static UrlContienePalabra deLaTarjeta(Target tarjeta) {
        return new UrlContienePalabra(tarjeta);
    }
}

