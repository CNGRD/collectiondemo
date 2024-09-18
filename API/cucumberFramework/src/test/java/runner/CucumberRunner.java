package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"./src/test/java/features"},glue = {"stepdefinition","hook"},/*tags="@Search"*/ dryRun=true
,plugin ={"html:Reports/CucumberReports.html","json:Reports/CucumberJsonReports.json","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class CucumberRunner extends AbstractTestNGCucumberTests
{
	
	
}
