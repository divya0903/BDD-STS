package com.cg.registration.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * 
 * @author gudivya
 * Date of Creation : 24/08/2018
 * Class Name : TestRunner
 * Purpose : To run the test cases in stepDefinition class
 */
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features"},
		glue= {"com.cg.registration.stepdefinitions"}
		
)
public class TestRunner {

}
