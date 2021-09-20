import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

//Это кукумбер
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"},
        glue = {"Steps"},
        plugin = {"Util.AllureListenerCucumber"},
        tags = "@Testt"
        )
public class CucumberRunnerTest {

}