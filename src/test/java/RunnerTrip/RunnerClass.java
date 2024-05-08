package RunnerTrip;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import BaseTrip.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\featureTrip\\Trip.feature",glue = "stepTrip",dryRun = false)
public class RunnerClass extends BaseClass{

	@BeforeClass
	public static void start() {
		Bowserlaunch();
		Maximize();
	}
	
}
