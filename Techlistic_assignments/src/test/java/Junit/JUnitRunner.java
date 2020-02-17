package Junit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\eclipse\\DataProvider\\src\\main\\java\\Features\\Assignments.feature",
glue ="StepDef",
//dryRun = false,
dryRun = true,
tags = "@Assignment4"
//,plugin = {"html:target/cucumber-html-report",
//		"json:target/cucumber.json",
//		"pretty:target/cucumber-pretty.txt",
//		"usage: target/cucumber-usage.json",
//		"junit:target/cucumber-results.xml"
//		}
)
public class JUnitRunner {

}
