package runner;




@RunWith(Cucumber.class)
@CucumberOptions(
	features=".//features/Login.feature",
			glue="StepDefinations",
			dryRun=false,
			monochrome=true,
			publish=true
	
)
public class TestRunner {
	
}
