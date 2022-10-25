package co.buk.test.certificate.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("http://demo.testim.io/")
public class HomePage extends PageObject {

    public static final Target BUTTON_LOG_IN = Target.the("This the input login").located(By.className("NavButton__nav-button___34wHC"));
    public static final Target MESSAGE_ACCOUNT = Target.the("This the message validation account").located(By.xpath("//*[@id=\"app\"]/div/header/div/div[2]/ul/div/button/span[1]"));

}
