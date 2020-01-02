package com.odoo.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-cucumber-reports"
        },
        features = "src/test/resources/features/",
        glue = "com/odoo/step_defs",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {
}

