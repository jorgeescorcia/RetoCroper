package com.co.project.userinterface.croper;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BarraDeNavegacion extends PageObject {

    public static final Target BTN_CATEGORIAS =
            Target.the("Categorias").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/cp-header[1]/header[1]/div[2]/cp-menu[1]/ul[1]/li[1]/cp-categories[1]/button[1]");

    public static final Target BTN_SEMILLAS =
            Target.the("Semillas").locatedBy("//body[1]/div[1]/div[2]/div[1]/cp-popover[1]/div[2]/ul[1]/li[7]/button[1]/span[1]");
    public static final Target BTN_SEMILLAS_INOCULANTES =
            Target.the("semillas sembradoras").locatedBy("//a[text()=' Inoculantes ']");


    //body[1]/div[1]/div[1]/div[1]/cp-popover[1]/div[2]/div[1]/button[2]
    public static final Target BTN_OFERTAS =
            Target.the("Ofertas").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/cp-header[1]/header[1]/div[2]/cp-menu[1]/ul[1]/li[2]/a[1]");

    public static final Target BTN_TIENDAS =
            Target.the("tiendas").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/cp-header[1]/header[1]/div[2]/cp-menu[1]/ul[1]/li[3]/a[1]");

    public static final Target BTN_SEGUROS =
            Target.the("seguros").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/cp-header[1]/header[1]/div[2]/cp-menu[1]/ul[1]/li[4]/a[1]");

    public static final Target BTN_CREDITOS =
            Target.the("seguros").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/cp-header[1]/header[1]/div[2]/cp-menu[1]/ul[1]/li[5]/button[1]");

    public static final Target BTN_ENTIDADES_FINANCIERAS =
            Target.the("seguros").locatedBy("//a[contains(text(), 'Entidades financieras')]");

    public static final Target BTN_LISTAPRODUCTOS =
            Target.the("seguros").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/cp-header[1]/header[1]/div[2]/cp-menu[1]/ul[1]/li[6]/a[1]");

    public static final Target BTN_PAQUETES_TECNOLOGICOS =
            Target.the("seguros").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/cp-header[1]/header[1]/div[2]/cp-menu[1]/ul[1]/li[7]/a[1]");

    public static final Target BTN_VENDER =
            Target.the("seguros").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/cp-header[1]/header[1]/div[2]/cp-menu[1]/ul[1]/li[8]/a[1]");

    public static final Target BTN_GESTION =
            Target.the("seguros").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/cp-header[1]/header[1]/div[2]/cp-menu[1]/ul[1]/li[9]/a[1]");

    public static final Target BTN_NOTICIAS =
            Target.the("seguros").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/cp-header[1]/header[1]/div[2]/cp-menu[1]/ul[1]/li[10]/a[1]");

}

