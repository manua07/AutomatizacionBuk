package co.buk.test.certificate.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static co.buk.test.certificate.userinterface.CheckOutDestinationPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CheckOutDestinationTask implements Task {

    public String name;
    public String emailAddress;
    public String securityNumber;
    public String phoneNumber;

    public CheckOutDestinationTask(String name, String emailAddress, String securityNumber, String phoneNumber) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.securityNumber = securityNumber;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(INPUT_NAME),
                Enter.theValue(emailAddress).into(INPUT_EMAIL_ADDRESS),
                Enter.theValue(securityNumber).into(INPUT_SECURITY_NUMBER),
                Enter.theValue(phoneNumber).into(INPUT_PHONE_NUMBER)
        );
    }

    public static CheckOutDestinationTask withInformationAddress (String name, String emailAddress, String securityNumber, String phoneNumber){
        return instrumented(CheckOutDestinationTask.class,name,emailAddress,securityNumber,phoneNumber );
    }
}
