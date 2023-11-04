package Mango_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Mango_Utility.Mango_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resources/Mango_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Mango_StepDefinition",tags={"@tag1"})

public class Mango_TestRunner extends AbstractTestNGCucumberTests{

	@BeforeTest
	public void manStartURL() {
		Mango_Base man = new Mango_Base();
		man.ManBrowser();
			
	}
	
	@AfterTest
	public void manCloseURL() {
		Mango_Base man = new Mango_Base();
		man.driver.quit();
		
		
	}
	
	
	
}
