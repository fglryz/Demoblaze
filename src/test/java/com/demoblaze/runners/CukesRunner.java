package com.demoblaze.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "jason:target/cucumber.json",
                "html:target/cucumber-report.html",
                "junit:target/junit/junit-report.xml",
                "rerun:target/rerun.txt",
        },
        features ="src/test/resources/features",
        glue ="com/demoblaze/step_definition",
        dryRun = false,
        tags = "@smoke"

)
public class CukesRunner {

}
