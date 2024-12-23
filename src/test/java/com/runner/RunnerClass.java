package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features = {"src/test/java/Feature"},
		glue= {"com.Steps","com.Hoos"},
		dryRun=!true,
		snippets=SnippetType.CAMELCASE,
		plugin= {"pretty",
				"html:Reports/HtmlReport.html"
		},
		tags="@smoke and @run or @Examples"
		)


public class RunnerClass extends AbstractTestNGCucumberTests{
	

}
