package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
        
        		(features ={"src/test/java/features/Login1.feature"},		
        glue="com.automation.stepdefinitions",
        dryRun=false,
        monochrome=true,
        plugin={"pretty","html:test-output"},
        tags={"@sanity"}
        		
		)

public class TestRunner {


}
