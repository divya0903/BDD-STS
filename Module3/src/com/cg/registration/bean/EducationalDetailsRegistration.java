package com.cg.registration.bean;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author gudivya
 * Date of Creation : 24/08/2018
 * Class Name : EducationalDetailsRegistration
 * Purpose : It is a bean class which stores the webElements present the educational details html web page 
 */

public class EducationalDetailsRegistration {

	@FindBy(how=How.NAME,name="graduation")
	private List<WebElement> graduation;
	
	@FindBy(how=How.ID,id="txtPercentage")
	private WebElement percentage;
	
	@FindBy(how=How.ID,id="txtPassYear")
	private WebElement passingYear;
	
	@FindBy(how=How.ID,id="txtProjectName")
	private WebElement project;
	
	@FindBy(how=How.ID,id="")
	private List<WebElement> usedTechnology;
	
	@FindBy(how=How.ID,id="txtOtherTechs")
	private WebElement otherTechnology;
	
	@FindBy(how=How.ID,id="btnRegister")
	private WebElement registerButton;

	@FindBy(how=How.ID,id="cbTechnologies")
	private WebElement checkbox1;
	
	
	
	public WebElement getCheckbox1() {
		return checkbox1;
	}
	public void setCheckbox1(WebElement checkbox1) {
		this.checkbox1 = checkbox1;
	}
	public List<WebElement> getGraduation() {
		return graduation;
	}
	public void setGraduation(String graduation) {
		Select select = new Select(this.graduation.get(0));
	    select.selectByVisibleText(graduation);
	}
	public String getPercentage() {
		return percentage.getAttribute("value");
	}
	public void setPercentage(String percentage) {
		this.percentage.sendKeys(percentage);
	}
	public String getPassingYear() {
		return passingYear.getAttribute("value");
	}
	public void setPassingYear(String passingYear) {
		this.passingYear.sendKeys(passingYear);
	}
	public String getProject() {
		return project.getAttribute("value");
	}
	public void setProject(String project) {
		this.project.sendKeys(project);
	}
	
	public void setUsedTechnology(String usedTechnology) {
		this.usedTechnology.set(3, otherTechnology);
	}
	
	public String getOtherTechnology() {
		return otherTechnology.getAttribute("value");
	}
	public void setOtherTechnology(String otherTechnology) {
		this.otherTechnology.sendKeys(otherTechnology);
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
	public void setRegisterButton(WebElement registerButton) {
		this.registerButton = registerButton;
	}
	
	public void clickSubmit() {
		 registerButton.click();
	}
	public EducationalDetailsRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
