package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\main\\java\\com\\qa\\features\\contacts.feature",
					glue  = {"com\\qa\\stepDefinations"},
					plugin = {"pretty","html:test-output","junit:junit-output/cucumber.xml","json:json-output/output.json"},
					monochrome=true,
					strict=true,
					dryRun=false
						)
public class Runner {

}
