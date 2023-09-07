package com.ep.cucumber.runner;

 
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.ep.cucumber.hooks.ScenarioHooks;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

 
@CucumberOptions(tags = "@smoke", features = { "src\\test\\resources\\features\\PIM2.feature" }, glue = {
		"com.ep.cucumber.steps", "com.ep.cucumber.hooks" }, plugin = { "pretty", "html:target/cucumber/report.html",
				"json:target/cucumber/report.json" }, monochrome = true, dryRun = !true)
public class RunnerClass2 extends AbstractTestNGCucumberTests {
	@Parameters({ "browsername" })
	@BeforeTest
	public void getBrowser(String browser) {
		ScenarioHooks.browser.set(browser);
	}
}
