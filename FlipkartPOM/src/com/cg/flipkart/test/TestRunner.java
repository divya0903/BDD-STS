package com.cg.flipkart.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"Features"}, 
			glue = {"com.cg.flipkart.stepdefinitions"},
			tags = {"@flipkart"})
			
public class TestRunner {

}
