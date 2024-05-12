package com.co.project.userinterface.croper;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Tarjetas extends PageObject {

    public static final Target BTN_INICIO =
            Target.the("Insumos Agricolas").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/cp-header[1]/header[1]/div[1]/div[1]/a[1]/cp-icon[1]");


    public static final Target INSUMOS_AGRICOLAS =
            Target.the("Insumos Agricolas").locatedBy("//a[h3[contains(text(), 'Insumos agrícolas')]]");

    public static final Target PRODUCTOS_FINALES =
            Target.the("Insumos Agricolas").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/main[1]/div[1]/cp-home[1]/cp-carousel[1]/section[1]/div[1]/cp-carousel-slide[2]/a[1]");
    public static final Target TIENDAS =
            Target.the("Insumos Agricolas").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/main[1]/div[1]/cp-home[1]/cp-carousel[1]/section[1]/div[1]/cp-carousel-slide[3]/a[1]");
    public static final Target GESTION_FINCAS =
            Target.the("Insumos Agricolas").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/main[1]/div[1]/cp-home[1]/cp-carousel[1]/section[1]/div[1]/cp-carousel-slide[4]/a[1]");
    public static final Target CREDITO =
            Target.the("Insumos Agricolas").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/main[1]/div[1]/cp-home[1]/cp-carousel[1]/section[1]/div[1]/cp-carousel-slide[5]/a[1]");
    public static final Target OFERTAS =
            Target.the("Insumos Agricolas").locatedBy("//body[1]/cp-root[1]/cp-layout[1]/main[1]/div[1]/cp-home[1]/cp-carousel[1]/section[1]/div[1]/cp-carousel-slide[6]/a[1]");
















}
