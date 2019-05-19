package stepdefination;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/raghav/IdeaProjects/MyMavenProject1/src/test/java/features",
        glue = {"stepdefinations"},
        tags = {"@example2"},
        format = {"html:target/reports"}
)

public class TestRunner {
}
