package com.co.project.task.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static com.co.project.userinterface.croper.Tarjetas.*;





public class TesterTarjetas implements Task {

    private List<Target> cards = Arrays.asList(
            INSUMOS_AGRICOLAS,
            PRODUCTOS_FINALES,
            TIENDAS,
            GESTION_FINCAS,
            CREDITO,
            OFERTAS
    );


    @Override
    public <T extends Actor> void performAs(T actor) {

        Random random = new Random();
        Target  randomCard = cards.get(random.nextInt(cards.size()));


        // Haz clic en la tarjeta aleatoria
        actor.attemptsTo(
                Click.on(randomCard)

        );


    }
    public static TesterTarjetas testerTarjetas() {
        return new TesterTarjetas();
    }





}
