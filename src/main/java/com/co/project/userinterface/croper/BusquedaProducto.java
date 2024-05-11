package com.co.project.userinterface.croper;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BusquedaProducto extends PageObject {

    public static final Target INPUT_BUSQUEDA =
            Target.the("Busqueda").locatedBy("//header/div[1]/div[1]/span[1]/button[1]");

    public static final Target INPUT_BUSQUEDA_POPUP =
            Target.the("Busqueda").locatedBy("//input[@placeholder='Busca las que necesitas...']");


    public static final Target VERIFICAR_NOMBRE_PRODUCTO =
            Target.the("Busqueda").locatedBy("//h2[@title='Filtro de aceite - R53727']");



}
