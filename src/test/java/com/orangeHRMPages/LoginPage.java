package com.orangeHRMPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Prasad
 * topic:page object model creation 
 */
public class LoginPage {
	
//Locators	
	By txt_username_loc=By.name("username");
	By txt_password_loc=By.name("password");
	By btn_login_loc=By.cssSelector("button[type='submit']");
	By img_logo_loc=By.xpath("//img[@alt='company-branding']");
	
//constructor
	
	WebDriver driver;
	
	LoginPage(WebDriver driver)
	{
		this.driver= driver;
		
	}	
	
//Action methods
	
	public void enterUserName(String username)
	{
		driver.findElement(txt_username_loc).sendKeys(username);	
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(txt_password_loc).sendKeys(password);		
	}
	
	public void clickLoginBtn()
	{
		driver.findElement(btn_login_loc).click();
	}
	
	public boolean logoverification()
	{
		Boolean status=driver.findElement(img_logo_loc).isDisplayed();
		return status;
	}
	
}
