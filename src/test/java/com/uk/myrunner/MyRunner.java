package com.uk.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "./Features",
		glue = "com.uk.stepdefination",
	    tags = "@negative"
		)

public class MyRunner extends AbstractTestNGCucumberTests{

}
