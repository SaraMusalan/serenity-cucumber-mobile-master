package co.smusala.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"},
        features = "src/test/resources/features/MyDemoApp.feature",
        glue = {"co.smusala.stepdefinitions","co.smusala.hooks"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)


public class CucumberTestSuite {}
