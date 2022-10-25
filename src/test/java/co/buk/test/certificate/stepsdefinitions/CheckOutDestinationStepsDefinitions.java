package co.buk.test.certificate.stepsdefinitions;

import co.buk.test.certificate.task.CheckOutDestinationTask;
import co.buk.test.certificate.userinterface.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.buk.test.certificate.userinterface.CheckOutDestinationPage.*;

public class CheckOutDestinationStepsDefinitions {


    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^que el usuario desea realizar el checkout de su destino$")
    public void queElUsuarioDeseaRealizarElCheckoutDeSuDestino() {
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @And("^ingrese la informacion de name (.*) email address (.*) social security number (.*) phone number (.*) y promo code (.*)$")
    public void ingreseLaInformacionDeNameNameEmailAddressEmailAddressSocialSecurityNumberSecurityNumberPhoneNumberPhoneNumberYPromoCodePromoCode(String name, String emailAddress, String securityNumber, String phoneNumber, String promoCode) {
        actor.attemptsTo(
                Click.on(BUTTON_BOOK),
                CheckOutDestinationTask.withInformationAddress(name,emailAddress,securityNumber, phoneNumber),
                Enter.theValue(promoCode).into(INPUT_PROMO_CODE),
                Click.on(BUTTON_APPLY_PROMO),
                Click.on(CHECK_AGREE_TERMS));

    }

    @Then("^usuario debe ver el total (.*) confirmando la orden$")
    public void usuarioDebeVerElMensajeMessageConfirmandoLaOrden(String total) {
        actor.attemptsTo(
                Ensure.that(MESSAGE_TOTAL).text().isEqualTo(total));
    }

}
