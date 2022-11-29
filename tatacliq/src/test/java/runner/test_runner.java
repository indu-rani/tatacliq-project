package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//import io.cucumber.*;
//import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(features={"src/test/resources/footer/footer.feature"},glue= {"definition"},plugin ={"html:testoutput/cucumber.html"})
public class test_runner {

}


	
