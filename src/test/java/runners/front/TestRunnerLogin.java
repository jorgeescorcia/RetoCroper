package runners.front;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;

import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;


@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/front/Login.feature",
        glue = "stepsdefinitions.front",
        snippets = CAMELCASE,
        tags = ""

)
public class TestRunnerLogin {

}
