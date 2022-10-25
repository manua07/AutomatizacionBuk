package co.buk.test.certificate.stepsdefinitions;

import co.buk.test.certificate.task.LoginTask;
import co.buk.test.certificate.userinterface.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class LoginStepsDefinitions {

    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");
    private final HomePage homePage = new HomePage();

    @Before
    public void setUp(){
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("^el usuario desea entrar a la aplicación$")
    public void elUsuarioDeseaEntrarALaAplicación() {
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @When("^ingrese a la aplicacion con un username (.*) y password (.*)$")
    public void ingreseUnUserNameUserNameYPasswordPassword(String email, String password) {
        actor.attemptsTo(Click.on(HomePage.BUTTON_LOG_IN));
        actor.attemptsTo(
                LoginTask.whitCredentials(email,password)
        );
    }

    @Then("^el usuario ve el mensaje (.*) de bienvenida$")
    public void elUsuarioVeElMensajeMessageDeBienvenida(String message) {
        actor.attemptsTo(
                Ensure.that(HomePage.MESSAGE_ACCOUNT).text().isEqualTo(message));
    }
}
