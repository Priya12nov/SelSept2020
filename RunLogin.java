package ruuner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= "src/test/java/feature/DuplicateLead.feature",glue= "steps",
monochrome = true,
snippets = SnippetType.CAMELCASE)
public class RunLogin extends AbstractTestNGCucumberTests {

}
