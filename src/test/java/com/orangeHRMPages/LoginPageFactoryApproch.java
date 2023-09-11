package com.orangeHRMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactoryApproch {
	
	WebDriver driver;
	
//constructor+pageFactory
	LoginPageFactoryApproch(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
//WebElements Locators+Identification or user defined name
	
	@FindBy(name = "username")
	WebElement txt_username;
	
	@FindBy(xpath ="//input[@placeholder='Password']" ) 
	WebElement txt_password;
	
	@FindBy (xpath = "//button[@type='submit']") 
	WebElement btn_login;
	
	@FindBy(xpath= "//img[@alt='company-branding']")
	WebElement img_logo;
	
//Action Methods

	public void enterUserName(String username) 
	{
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) 
	{
		txt_password.sendKeys(password);
	}
	
	public void clickLoginBtn() 
	{
		btn_login.click();
		
	}
	public boolean logoverification() 
	{
		boolean status= img_logo.isDisplayed();
		return status;
		
		
	}
}
