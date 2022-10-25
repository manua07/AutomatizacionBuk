package co.buk.test.certificate.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(
            glue = "co.buk.test.certificate.stepsdefinitions",
            features = "src/test/resources/features/login.feature",
            snippets = CucumberOptions.SnippetType.CAMELCASE,
            monochrome = true

    )

    public class LoginRunner {

}
