package testrunner;		

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)				
@CucumberOptions(features="Features",tags={"@all"},glue={"stepdefinitions"},plugin={"pretty","html:reports"})						
public class Runner 				
{		

}
