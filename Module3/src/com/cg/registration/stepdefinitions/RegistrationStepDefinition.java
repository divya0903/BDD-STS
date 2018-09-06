package com.cg.registration.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.registration.bean.EducationalDetailsRegistration;
import com.cg.registration.bean.PersonalDetailsRegistration;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * 
 * @author gudivya
 * Date of Creation : 24/08/2018
 * Class Name : RegistrationStepDefinition
 * Purpose : To test the registration page with valid and invalid credentials
 *
 */
public class RegistrationStepDefinition {

	private WebDriver driver;
	private PersonalDetailsRegistration personalDetails;
	private EducationalDetailsRegistration educationalDetails;
	
	@Before
	public void setUpStepEnv() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe" );
	}
	
	@Given("^user is on personal details registration page$")
	public void user_is_on_personal_details_registration_page() throws Throwable {
	    
		driver = new ChromeDriver();
		driver.get("D:\\Module 3\\WebPages_Set 3\\PersonalDetails.html");
		personalDetails = PageFactory.initElements(driver, PersonalDetailsRegistration.class);
		educationalDetails = PageFactory.initElements(driver, EducationalDetailsRegistration.class);
	}

	@Then("^personal details registration page should load with tile 'Personal Details Registration'$")
	public void personal_details_registration_page_should_load_with_tile_Personal_Details_Registration() throws Throwable {
	    String expectedTitle="Personal Details";
	    String actualTitle=driver.getTitle();
	    assertEquals(expectedTitle, actualTitle);
	}

	@When("^user will click on next without entering First Name$")
	public void user_will_click_on_next_without_entering_First_Name() throws Throwable {
	    personalDetails.setFirstname("");
	    personalDetails.clickNext();
	}

	@Then("^'Please fill the First Name' message be should displayed$")
	public void please_fill_the_First_Name_message_be_should_displayed() throws Throwable {
		String expectedMessage="Please fill the First Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without entering Last Name$")
	public void user_will_click_on_next_without_entering_Last_Name() throws Throwable {
	    personalDetails.setFirstname("divya");
	    Thread.sleep(1000);
	    personalDetails.setLastname("");
	    personalDetails.clickNext();
	}

	@Then("^'Please fill the Last Name' message should be displayed$")
	public void please_fill_the_Last_Name_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Last Name";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without entering Email$")
	public void user_will_click_on_next_without_entering_Email() throws Throwable {
	    personalDetails.setLastname("gurumanchi");
	    Thread.sleep(1000);
	    personalDetails.setEmail("");
	    personalDetails.clickNext();
	}

	@Then("^'Please fill the Email' message should be displayed$")
	public void please_fill_the_Email_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Email";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without entering Contact no\\.$")
	public void user_will_click_on_next_without_entering_Contact_no() throws Throwable {
	    personalDetails.setEmail("divya@gmail.com");
	    personalDetails.setContactNo("");
	    personalDetails.clickNext();
	}

	@Then("^'Please fill the Contact No\\.' message should be displayed$")
	public void please_fill_the_Contact_No_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill the Contact No.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next withot entering valid Contact no\\.$")
	public void user_will_click_on_next_withot_entering_valid_Contact_no() throws Throwable {
	    personalDetails.setContactNo("78561");
	    personalDetails.clickNext();
	}

	@Then("^'Please enter valid Contact no\\.' message should be displayed$")
	public void please_enter_valid_Contact_no_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please enter valid Contact no.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without entering line (\\d+) & line (\\d+) in address$")
	public void user_will_click_on_next_without_entering_line_line_in_address(int arg1, int arg2) throws Throwable {
	    personalDetails.setContactNo("45685");
	    personalDetails.setLine1("");
	    personalDetails.setLine2("");
	    personalDetails.clickNext();
	}

	@Then("^'Please fill the Line(\\d+) and Line(\\d+) in Address' message should be displayed$")
	public void please_fill_the_Line_and_Line_in_Address_message_should_be_displayed(int arg1, int arg2) throws Throwable {
	    String expectedMessage="Please fill the address line 1";
	    String actualMessage=driver.switchTo().alert().getText();
	    Assert.assertEquals(expectedMessage, actualMessage);
	    Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without selcting City$")
	public void user_will_click_on_next_without_selcting_City() throws Throwable {
	    personalDetails.setLine1("Whitefield");
	    Thread.sleep(1000);
	    personalDetails.setLine2("Akshay Tech Park");
	    personalDetails.clickNext();
	}

	@Then("^'Please select city' message should be displayed$")
	public void please_select_city_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please select city";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next without selecting State$")
	public void user_will_click_on_next_without_selecting_State() throws Throwable {
		personalDetails.setCity("Pune");
	    personalDetails.clickNext();
	}

	@Then("^'Please select state' message should be displayed$")
	public void please_select_state_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please select state";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}

	@When("^user will click on next by entering all valid details$")
	public void user_will_click_on_next_by_entering_all_valid_details() throws Throwable {
	    personalDetails.setState("Maharashtra");
	    personalDetails.clickNext();
	}

	@Then("^'Personal details are validated\\.' message should be displayed$")
	public void personal_details_are_validated_message_should_be_displayed() throws Throwable {
		String expectedMessage="Personal details are validated and accepted successfully.";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		Thread.sleep(2000);
	}

	@Then("^navigates to the educational details page$")
	public void navigates_to_the_educational_details_page() throws Throwable {
		driver.switchTo().alert().dismiss();
	}

	@When("^user is on educational details page$")
	public void user_is_on_educational_details_page() throws Throwable {
	    
	}

	@Then("^educational details registration page should load with tile 'Educational Details'$")
	public void educational_details_registration_page_should_load_with_tile_Educational_Details() throws Throwable {
		String expectedTitle="Educational Details";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@When("^user clicks on register without selecting graduation$")
	public void user_clicks_on_register_without_selecting_graduation() throws Throwable {
	    
		educationalDetails.clickSubmit();
	}

	@Then("^'Please select graduation' message should be displayed$")
	public void please_select_graduation_message_should_be_displayed() throws Throwable {
	    String expectedMessage="Please Select Graduation";
	    String actualMessage=driver.switchTo().alert().getText();
	    Assert.assertEquals(expectedMessage, actualMessage);
	    Thread.sleep(2000);
	    driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on register without entering percentage$")
	public void user_clicks_on_register_without_entering_percentage() throws Throwable {
	    educationalDetails.setGraduation("BTech");
	    educationalDetails.setPercentage("");
	    educationalDetails.clickSubmit();
	}

	@Then("^'Please enter percentage' message should be displayed$")
	public void please_enter_percentage_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill Percentage detail";
	    String actualMessage=driver.switchTo().alert().getText();
	    Assert.assertEquals(expectedMessage, actualMessage);
	    Thread.sleep(2000);
	    driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on register without entering passing year$")
	public void user_clicks_on_register_without_entering_passing_year() throws Throwable {
		educationalDetails.setPercentage("86");
		educationalDetails.setPassingYear("");
		educationalDetails.clickSubmit();
	}

	@Then("^'Please enter passing year' message should be displayed$")
	public void please_enter_passing_year_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill Passing Year";
	    String actualMessage=driver.switchTo().alert().getText();
	    Assert.assertEquals(expectedMessage, actualMessage);
	    Thread.sleep(2000);
	    driver.switchTo().alert().dismiss();
	}
	
	@When("^user clicks on register without entering project name$")
	public void user_clicks_on_register_without_entering_project_name() throws Throwable {
	    educationalDetails.setPassingYear("2018");
	    educationalDetails.setProject("");
	    educationalDetails.clickSubmit();
	}

	@Then("^'Please enter project name' message should be displayed$")
	public void please_enter_project_name_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill Project Name";
	    String actualMessage=driver.switchTo().alert().getText();
	    Assert.assertEquals(expectedMessage, actualMessage);
	    Thread.sleep(2000);
	    driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on register without selecting technology used$")
	public void user_clicks_on_register_without_selecting_technology_used() throws Throwable {
	    educationalDetails.setProject("ProjectXYZ");
	    educationalDetails.clickSubmit();
	}

	@Then("^'Please select technologies used' message should be displayed$")
	public void please_select_technologies_used_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please Select Technologies Used";
	    String actualMessage=driver.switchTo().alert().getText();
	    Assert.assertEquals(expectedMessage, actualMessage);
	    Thread.sleep(2000);
	    driver.switchTo().alert().dismiss();
	}
	
	@When("^user selects others in technologies used and does not enter other technology$")
	public void user_selects_others_in_technologies_used_and_does_not_enter_other_technology() throws Throwable {
	   
		educationalDetails.getCheckbox1().click();
		educationalDetails.setOtherTechnology("");
	    educationalDetails.clickSubmit();
	}

	@Then("^'Please fill other technology' message should be displayed$")
	public void please_fill_other_technology_message_should_be_displayed() throws Throwable {
		String expectedMessage="Please fill other Technologies Used";
	    String actualMessage=driver.switchTo().alert().getText();
	    Assert.assertNotEquals(expectedMessage, actualMessage);
	    driver.switchTo().alert().dismiss();
	}

	@When("^user clicks on register with valid details$")
	public void user_clicks_on_register_with_valid_details() throws Throwable {
		
		educationalDetails.setOtherTechnology("SAP");
	    educationalDetails.clickSubmit();
	}

	@Then("^'Your registration is successfully done!!!' message should be displayed$")
	public void your_registration_is_successfully_done_message_should_be_displayed() throws Throwable {
		String expectedMessage="Your Registration Has succesfully done Plz check you registerd email for account activation link !!!";
	    String actualMessage=driver.switchTo().alert().getText();
	    Assert.assertEquals(expectedMessage, actualMessage);
	    Thread.sleep(2000);
	    driver.switchTo().alert().dismiss();
	    driver.close();
	}

}
