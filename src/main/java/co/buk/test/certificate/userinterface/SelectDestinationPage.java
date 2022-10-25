package co.buk.test.certificate.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectDestinationPage {

    public static final Target INPUT_DEPARTING = Target.the("This the input departing").located(By.xpath("//*[@id=\"app\"]/div/section[1]/div[3]/div/div[1]/div/div/input[@type='text']"));
    public static final Target INPUT_RETURNING = Target.the("This the input returning").located(By.xpath("//*[@id=\"app\"]/div/section[1]/div[3]/div/div[2]/div/div/input[@type='text']"));
    public static final Target BUTTON_SELECT_DESTINATION = Target.the("This the button select destination").located(By.xpath("//*[@id=\"app\"]/div/section[1]/div[4]/button[@type='button']"));
    public static final Target INPUT_ADULTS = Target.the("This the input adults").located(By.xpath("//*[@id=\"app\"]/div/section[1]/div[3]/div/div[3]/div/input[@value='Adults (18+)']"));
    public static final Target OPTION_ADULTS_1 = Target.the("This is the option 1 adults").located( By.xpath("//*[@id=\"app\"]/div/section[1]/div[3]/div/div[3]/ul/li[2]"));

    public static final Target INPUT_CHILDREN = Target.the("This the input children").located(By.xpath("//*[@id=\"app\"]/div/section[1]/div[3]/div/div[4]/div/input[@value='Children (0-7)']"));
    public static final Target OPTION_CHILDREN_1 = Target.the("This is the option 1 children").located( By.xpath("//*[@id=\"app\"]/div/section[1]/div[3]/div/div[4]/ul/li[2]"));
    public static final Target INPUT_SEARCH_LAUNCH = Target.the("This the input search launch").located(By.xpath("//*[@id=\"app\"]/div/section[2]/div[4]/div/div/div[1]/div/input[@value='Launch']"));
    public static final Target INPUT_SEARCH_PLANET_COLOR = Target.the("This the input search planet color").located(By.xpath("//*[@id=\"app\"]/div/section[2]/div[4]/div/div/div[2]/div/input[@value='Planet color']"));
    public static final Target OPTION_MADAN = Target.the("This is the option madan").located( By.xpath("//*[@id=\"app\"]/div/section[2]/div[4]/div/div/div[1]/ul/li[2]"));
    public static final Target OPTION_SHENJI = Target.the("This is the option shenji").located( By.xpath("//*[@id=\"app\"]/div/section[2]/div[4]/div/div/div[1]/ul/li[3]"));
    public static final Target OPTION_GREEN = Target.the("This is the option green").located( By.xpath("//*[@id=\"app\"]/div/section[2]/div[4]/div/div/div[2]/ul/li[2]"));
    public static final Target OPTION_RED = Target.the("This is the option red").located( By.xpath("//*[@id=\"app\"]/div/section[2]/div[4]/div/div/div[2]/ul/li[3]"));
    public static final Target DESTINATION_SEARCH = Target.the("This the products quantity add car").located(By.className("theme__title___35Wsy"));

}

