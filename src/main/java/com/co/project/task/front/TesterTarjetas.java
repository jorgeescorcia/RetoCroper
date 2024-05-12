package com.co.project.task.front;

import com.co.project.questions.front.CompararURL;
import com.co.project.questions.front.ObtenerURLTarjeta;
import com.co.project.questions.front.UrlContienePalabra;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import static org.hamcrest.CoreMatchers.is;
import static com.co.project.userinterface.croper.Tarjetas.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TesterTarjetas implements Task {

    private List<Target> cards = Arrays.asList(
            INSUMOS_AGRICOLAS,
            PRODUCTOS_FINALES,
            TIENDAS,
            GESTION_FINCAS,
            CREDITO,
            OFERTAS
    );

    private Target randomCard;

    @Override
    public <T extends Actor> void performAs(T actor) {

        Random random = new Random();
         randomCard = cards.get(random.nextInt(cards.size()));

        // Haz clic en la tarjeta aleatoria
        actor.attemptsTo(
                Click.on(randomCard)

        );


       actor.should(
               seeThat("la URL contiene 'Insumo' si la tarjeta es INSUMOS_AGRICOLAS", UrlContienePalabra.deLaTarjeta(randomCard), is(true))


        );

    }

    public static TesterTarjetas testerTarjetas() {
        return new TesterTarjetas();
    }

    public Target getRandomCard() {
        return randomCard;
    }
}
