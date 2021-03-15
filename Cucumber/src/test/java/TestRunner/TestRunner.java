package TestRunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
			
		
		features ="C:\\GITTESTPRACTICE\\NandiniCucumber\\Cucumber\\src\\test\\java\\Featurefile\\Sample.feature",
		glue= {"C:\\GITTESTPRACTICE\\NandiniCucumber\\Cucumber\\src\\test\\java\\Stepdefination\\Fbcreatenewuser.java"}     ////where exactly path your step definition file
		//dryRun = false,  /// to check mapping between the feature file and step definition file
		//monochrome = true, /// it will display the console output proper readable format
		//plugin= {"pretty", "html:test-output/cucumber.html","json:json_output/cucumber.json"} , ///to generate different types of report 
        //strict =true   ///it will check if any step is not defined in step definition file
)


public class TestRunner {

}
