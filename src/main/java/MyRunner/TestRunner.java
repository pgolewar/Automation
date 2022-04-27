package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Automation/TestingWorkplace/Automation/src/main/java/FeatureFiles/LoginFeature", //the path of the feature files
		glue={"stepDefinitions"},
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, 
		dryRun = false 
				
		)
 
public class TestRunner {
 
}