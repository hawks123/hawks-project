package runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

@RunWith(Cucumber.class)
@CucumberOptions(
		// feattures tells cucumber where all feature files are located 
		//glue tells cucumber where all stepDefinition classes are located
		// with tags we will run one scenario, or multiple scenarios, or entire feature
		 // dryRun checks if there are any missing steps definition class for each
		//scenario steps in feature files
		//monochrome will mark console readable 
		// strict will mark scenario failed if there are any pending steps.
		// plugin will be used for generating a readable report
		features = "classpath:features" ,
		glue = "stepDefinition" ,
		tags = "@smokeTest", 
		dryRun = false ,
		monochrome = true,
		strict = true,
				plugin = {
						"pretty", 
						"html:target/site/cucumber-pretty",
						"json:target/cucumber.json" }, 
		publish = true
		
		
		)

public class TestRunner {
	
	/*
	 *  this method will invoke the cucumber reporting once the execution is over.
	 *  @AfterClass annotation is from Junit and this will run after (AfterHooks)
	 */
	@AfterClass
	public static void generatReport() {
		CucumberReportingConfig.reportConfig();
		
	}

}
