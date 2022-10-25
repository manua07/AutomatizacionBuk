package co.buk.test.certificate.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME = Target.the("This the input username").located(By.xpath("//form[@id='login']/div[1]/input[@type='text']"));
    public static final Target PASSWORD = Target.the("This the input password").located(By.xpath("//form[@id='login']/div[2]/input[@type='password']"));

}
