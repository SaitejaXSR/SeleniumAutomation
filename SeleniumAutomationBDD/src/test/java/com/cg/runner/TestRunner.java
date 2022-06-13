package com.cg.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features/dataDriven.feature", glue = "com.cg.testdef",
				stepNotifications = true,
				dryRun = false,
			monochrome = true,
				plugin = {"pretty"},
				snippets = SnippetType.CAMELCASE)
public class TestRunner {

}
