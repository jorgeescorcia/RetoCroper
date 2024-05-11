package stepsdefinitions.setup.front;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;


import org.openqa.selenium.WebDriver;

import static com.co.project.utils.front.Diccionario.ACTOR_NAME;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SetupFront {
    @Managed
    private WebDriver webDriver;

    private  void setActorAndStage(){
        setTheStage(Cast.ofStandardActors());
        theActorCalled(ACTOR_NAME);
        theActorInTheSpotlight().can(BrowseTheWeb.with(webDriver));


    }

    protected void setUpTest(){
        setActorAndStage();
    }


}
