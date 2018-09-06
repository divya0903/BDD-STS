package com.cg.flipkart.bean;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FlipkartSearchPage {

	@FindBy(how=How.CLASS_NAME,className="LM6RPg")
	private WebElement search;
	
	@FindBy(how=How.CLASS_NAME,className="_2BhAHa")
	private WebElement button;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"container\"]/div/div[1]/div[2]/div/div[1]/div[2]/div[1]/div/span/span")
	private WebElement actualValid;
	
	@FindBy(how=How.XPATH,xpath="//*[@id=\"container\"]/div/div[1]/div[2]/div/div[1]/div/div[1]")
	private WebElement actualInvalid;
	
	public String getActualValid() {
		return actualValid.getText();
	}
	
	public String getActualInvalid() {
		return actualInvalid.getText();
	}
	
	public String getSearch() {
		return search.getAttribute("value");
	}
	
	public void setSearch(String search) {
		this.search.sendKeys(search);
	}
	
	public WebElement getButton() {
		return button;
	}
	
	public void setButton(WebElement button) {
		this.button = button;
	}
	
	public void clickOnSearch()
	{
		button.submit();
	}
	
}
