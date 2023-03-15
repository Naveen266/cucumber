package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feature/commlogin.feature",
		glue="Stepdefination",
tags=" @cart",
		
	plugin={"html:Report/para.html","pretty:Report/para.txt"}
		
		)
public class Runner1 {
	

}
