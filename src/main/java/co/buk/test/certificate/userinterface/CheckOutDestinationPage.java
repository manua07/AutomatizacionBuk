package co.buk.test.certificate.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckOutDestinationPage {

    public static final Target BUTTON_BOOK = Target.the("This the button book").located(By.xpath("//*[@id=\"app\"]/div/section[2]/div[5]/div/div/div[1]/div[4]/button[@type='button']"));
    public static final Target INPUT_NAME = Target.the("This the input name").located(By.xpath("//*[@id=\"app\"]/div/div[2]/section[1]/div[3]/div[1]/form/div[1]/input[@type='text']"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("This the input email address").located(By.xpath("//*[@id=\"app\"]/div/div[2]/section[1]/div[3]/div[1]/form/div[2]/input[@type='email']"));
    public static final Target INPUT_SECURITY_NUMBER = Target.the("This the input security number").located(By.xpath("//*[@id=\"app\"]/div/div[2]/section[1]/div[3]/div[1]/form/div[3]/input[@type='text']"));
    public static final Target INPUT_PHONE_NUMBER = Target.the("This the input phone number").located(By.xpath("//*[@id=\"app\"]/div/div[2]/section[1]/div[3]/div[1]/form/div[4]/input[@type='tel']"));
    public static final Target INPUT_PROMO_CODE = Target.the("This the input promo code").located(By.xpath("//*[@id=\"app\"]/div/div[2]/section[1]/div[3]/div[2]/div[4]/div[1]/div/input[@name='promo']"));
    public static final Target BUTTON_APPLY_PROMO = Target.the("This the button apply promo").located(By.xpath("//*[@id=\"app\"]/div/div[2]/section[1]/div[3]/div[2]/div[4]/div[2]/button[@type='button']"));
    public static final Target CHECK_AGREE_TERMS = Target.the("This the check agree terms").located(By.xpath("//*[@id=\"app\"]/div/div[2]/section[1]/div[3]/div[2]/div[5]/div/label/div"));
    public static final Target MESSAGE_TOTAL = Target.the("This the message total ").located(By.xpath("//*[@id=\"app\"]/div/div[2]/section[1]/div[3]/div[2]/div[6]/div/div/strong"));

}
