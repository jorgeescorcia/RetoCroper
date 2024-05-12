package com.co.project.questions.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CompararURL implements Question<Boolean> {
    private String url;
    private String palabra;

    public CompararURL(String url, String palabra) {
        this.url = url;
        this.palabra = palabra;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return url.toLowerCase().contains(palabra.toLowerCase());
    }

    public static CompararURL conPalabra(String url, String palabra) {
        return new CompararURL(url, palabra);
    }
}
