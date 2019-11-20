package junit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty","html:target/format"},
		features ="C:\\Users\\training\\Desktop\\BDDCucumberFrameWork\\src\\main\\resources\\Features\\Mynthra.feature",
		glue= {"StepDefinition"},
		dryRun = false,
		monochrome = true,
		tags="@all")
public class JunitRunner {
	

}
