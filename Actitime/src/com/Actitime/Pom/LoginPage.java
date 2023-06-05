package com.Actitime.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Deceleration
	@FindBy(id="username")
	private WebElement utbx;
	@FindBy(name="pwd")
	private WebElement pwtbx;
	@FindBy(xpath= "//div[.='Login ']")
	private WebElement lgbtn;
	
	//Initialization
	public LoginPage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	  
	}
	
	//utilization
	public WebElement getutbx () {
		return utbx;
		
	}
	public WebElement pwtbx () {
		return pwtbx;
		
	}
	public WebElement lgbtn () {
		return lgbtn;
		
	}
}
