package run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/bdd", tags={"@CT000,@CT001"},
glue = "classpath:page", monochrome = true, dryRun = false,
plugin={"html:target/cucumber-html-report","json:target/cucumber.json"})

public class AllTests {}
