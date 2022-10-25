package co.buk.test.certificate.stepsdefinitions;

import co.buk.test.certificate.userinterface.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static co.buk.test.certificate.userinterface.SelectDestinationPage.*;

public class SelectDestinationStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^que el usuario desea seleccionar proximo destino$")
    public void queElUsuarioDeseaSeleccionarProximoDestino() {
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @And("^seleccione un destination$")
    public void seleccioneUnDestination() throws InterruptedException {
        actor.attemptsTo(Click.on(INPUT_DEPARTING),
                Hit.the(Keys.ENTER).into(INPUT_DEPARTING),
                Click.on(INPUT_RETURNING),
                Hit.the(Keys.ENTER).into(INPUT_RETURNING),
                Click.on(INPUT_ADULTS),
                Click.on(OPTION_ADULTS_1),
                Click.on(INPUT_CHILDREN),
                Click.on(OPTION_CHILDREN_1),
                Click.on(BUTTON_SELECT_DESTINATION)
                );
    }

    @And("^busque un launch madan y planet color$")
    public void busqueUnLaunchLaunchYPlanetColorPlanetcolor() {
        actor.attemptsTo(Scroll.to(INPUT_SEARCH_LAUNCH),
                Click.on(INPUT_SEARCH_LAUNCH),
                Click.on(OPTION_MADAN),
                Click.on(INPUT_SEARCH_PLANET_COLOR),
                Click.on(OPTION_GREEN));
    }

    @And("^busque un launch Shenji y planet color$")
    public void busqueUnLaunchShenjiYPlanetColor() {
        actor.attemptsTo(Scroll.to(INPUT_SEARCH_LAUNCH),
                Click.on(INPUT_SEARCH_LAUNCH),
                Click.on(OPTION_SHENJI),
                Click.on(INPUT_SEARCH_PLANET_COLOR),
                Click.on(OPTION_RED));
    }

    @Then("^usuario debe ver lauch buscado (.*)$")
    public void usuarioDebeVerLauchBuscadoLaunch(String launchSearch) {
        actor.attemptsTo(
                Ensure.that(DESTINATION_SEARCH).text().isEqualTo(launchSearch));
    }

}





