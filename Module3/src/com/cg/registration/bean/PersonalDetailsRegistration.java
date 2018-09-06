package com.cg.registration.bean;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 *  @author gudivya
 * Date of Creation : 24/08/2018
 * Class Name : PersonalDetailsRegistration
 * Purpose : It is a bean class which stores the webElements present the personal details html web page 
 */
public class PersonalDetailsRegistration {

	@FindBy(how=How.ID,id="txtFirstName")
	private WebElement firstname;
	
	@FindBy(how=How.ID,id="txtLastName")
	private WebElement lastname;
	
	@FindBy(how=How.ID,id="txtEmail")
	private WebElement email;
	
	@FindBy(how=How.ID,id="txtPhone")
	private WebElement contactNo;
	
	@FindBy(how=How.ID,id="txtAddress1")
	private WebElement line1;
	
	@FindBy(how=How.ID,id="txtAddress2")
	private WebElement line2;
	
	@FindBy(name="city")
	private List<WebElement> city;
	
	@FindBy(name="state")
	private List<WebElement> state;
	
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[11]/td/a")
	private WebElement next;
	
	public String getFirstname() {
		return firstname.getAttribute("value");
	}
	public void setFirstname(String firstname) {
		this.firstname.sendKeys(firstname);
	}
	
	public String getLastname() {
		return lastname.getAttribute("value");
	}
	public void setLastname(String lastname) {
		this.lastname.sendKeys(lastname);
	}
	
	public String getEmail() {
		return email.getAttribute("value");
	}
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	
	public String getContactNo() {
		return contactNo.getAttribute("value");
	}
	public void setContactNo(String contactNo) {
		this.contactNo.sendKeys(contactNo);
	}
	
	public String getLine1() {
		return line1.getAttribute("value");
	}
	public void setLine1(String line1) {
		this.line1.sendKeys(line1);
	}
	
	public String getLine2() {
		return line2.getAttribute("value");
	}
	public void setLine2(String line2) {
		this.line2.sendKeys(line2);
	}
	
	public List<WebElement> getCity() {
		return city;
	}
	public void setCity(String city) {
		Select select = new Select(this.city.get(0));
	    select.selectByVisibleText(city);    
	}
	
	public List<WebElement> getState() {
		return state;
	}
	public void setState(String state) {
		Select select = new Select(this.state.get(0));
	    select.selectByVisibleText(state);
	}
	
	public WebElement getNext() {
		return next;
	}
	public void setNext(WebElement next) {
		this.next = next;
	}
	
	public void clickNext() {
		 next.click();
	}
	public PersonalDetailsRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
