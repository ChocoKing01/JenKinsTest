package RunnerG;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeaturesFile\\first.feature",glue="stepDefoall",format={"pretty","html:target/cucum"})
public class Firtrunner {

}
