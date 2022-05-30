package com.guruprasad.bdd.bddRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\com\\guruprasad\\bdd\\featureFiles\\"}
		,glue = {"stepDef"}
		//,monochrome = true
		//,dryRun = true
		)

public class TestRunner {

}
