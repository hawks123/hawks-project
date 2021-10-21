package stepDefinition;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Initializer extends Base {

	// in this class we will define Before Hooks and after hooks Cucumber
		// before hooks will run before each scenario
		// After hooks will run afther each scenario
		
		@Before
		public void beforHooks(Scenario scenario) {
			logger.info("scenario" + scenario.getName()+ "Started");
			browser(); // this method come from base class and will lunch browser
			openBrowser(); // this method comes from Base class and will lunch url
			
		}
		
		@After
		public void afterHooks(Scenario scenario) {
			tearDown();
			logger.info("scenario" + scenario.getName()+ " "+ scenario.getStatus());
			
		}
}
