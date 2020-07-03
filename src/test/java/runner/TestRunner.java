package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	
	@RunWith(Cucumber.class)


	@CucumberOptions(
	        //plugin = {"pretty"},
	      // features = "features",
	    		  features = "C:\\Users\\Smart\\eclipse-workspace\\Framework\\src\\test\\resources\\features\\DataDriven.feature",
	    		  glue= {"stepDefinitions"},
	        		
	        
	        		
	      monochrome=true,
	     // plugin= {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
	    		  plugin= {"pretty","html:target"},
	        //strict=true,
	        dryRun=false
	   
	         
	)
	public class TestRunner {
		
	}

