package co.buk.test.certificate.task;

import co.buk.test.certificate.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {

    private final String emailAddress;
    private final String password;


    public LoginTask(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(emailAddress).into(LoginPage.USERNAME),
                Enter.theValue(password).into(LoginPage.PASSWORD).thenHit(Keys.ENTER)
        );
    }

    public static LoginTask whitCredentials(String emailAddress, String password){
        return instrumented(LoginTask.class, emailAddress, password);
    }
}

