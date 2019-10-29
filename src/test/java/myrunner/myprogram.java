package myrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Training_h2a.06.17\\Desktop\\java project\\eclipse_abhijit\\myseleniumproject\\features\\background.feature"
,glue= {"stepdefs"},plugin={"pretty","html:target/cucumber_report"})
public class myprogram {

}
