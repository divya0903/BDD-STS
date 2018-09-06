package com.cg.flipkart.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.flipkart.bean.FlipkartSearchPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartStepDefinition {

	private WebDriver driver;
	private FlipkartSearchPage searchPage;
	

	@Before
	public void setUpEnv()
	{
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
	}
	
	@Given("^user is given flipkart application into their desktop where they search for mobile$")
	public void user_is_given_flipkart_application_into_their_desktop_where_they_search_for_mobile() throws Throwable {
	    
		  driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  searchPage = new FlipkartSearchPage();
		  PageFactory.initElements(driver, searchPage);
	}

	@When("^there is availability of mobile$")
	public void there_is_availability_of_mobile() throws Throwable {
	    
		searchPage.setSearch("redmi note 5");
		searchPage.clickOnSearch();
		Thread.sleep(2000);
	}

	@Then("^display all the details of the product$")
	public void display_all_the_details_of_the_product() throws Throwable {
	   
		/*String actual=driver.getCurrentUrl().toString();
		String expected="https://www.flipkart.com/search?q=redmi%20note%205&marketplace=FLIPKART&otracker=start&as-show=on&as=off";
		assertEquals(expected,actual);*/
		
		String expected="redmi note 5";
		assertEquals(expected, searchPage.getActualValid());
	}

	@When("^there is no availability of mobile$")
	public void there_is_no_availability_of_mobile() throws Throwable {
	    
		searchPage.setSearch("dhsbasdasdgg");
		searchPage.clickOnSearch();
		Thread.sleep(2000);
	}

	@Then("^display no matches found$")
	public void display_no_matches_found() throws Throwable {
		/*String expected="https://www.flipkart.com/search?q=dhsbasdasdgg&marketplace=FLIPKART&otracker=start&as-show=off&as=off";
		String actual=driver.getCurrentUrl().toString();
		assertEquals(expected, actual);*/
		
		String expected="Sorry, no results found!";
		assertEquals(expected, searchPage.getActualInvalid());
				
	}
}
