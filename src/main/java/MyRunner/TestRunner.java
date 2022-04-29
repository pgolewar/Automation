package MyRunner;


import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Automation/TestingWorkplace/Automation/src/main/java/FeatureFiles/LoginFeature", //the path of the feature files
		glue={"stepDefinitions"}
		//format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		//monochrome = true, 
		//dryRun = false 
				
		)
@Test
public class TestRunner extends AbstractTestNGCucumberTests {
 
}