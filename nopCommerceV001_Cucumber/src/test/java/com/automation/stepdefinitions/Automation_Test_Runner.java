package com.automation.stepdefinitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features ={"src/test/java/features/Login1.feature"},
glue="com.automation.stepdefinitions")
//format = {"pretty","html:/Users/hydusindia/workspace/Automation/reports"})//,tags="@execute")

//@CucumberOptions(features={"src/com/automation/features/NotificationExceptionSchemaMismatch.feature"}, 
//
//glue="com.automation.stepdefinitions",
//
//monochrome = true)



//@CucumberOptions(features={"src/com/automation/features/AuditsearchBasic.feature","src/com/automation/features/AuditSearchAdvanced.feature"}, 
//
//glue="com.automation.stepdefinitions")

/*monochrome = true, 

plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" }*/

//monochrome = true,
//
//
//plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"} 
//) 

//@CucumberOptions(features ={"src/com/automation/features/CustomerID.feature"},
//glue="com.automation.stepdefinitions")
////format = {"pretty","html:/Users/schintala/workspace/Automation/reports"},tags="@execute")

public class Automation_Test_Runner{ 
	
	
}






