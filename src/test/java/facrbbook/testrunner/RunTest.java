package facrbbook.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		           plugin="pretty",
		           features="src/test/resources/BUSINESS_LOGIC/CUCUMBER_SUITES",
		           tags="@SmokeTest",
		           glue="facebook.Cucumber",
		           monochrome=false
		         )






public class RunTest {

}
