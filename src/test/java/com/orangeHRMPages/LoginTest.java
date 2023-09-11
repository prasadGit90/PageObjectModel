package com.orangeHRMPages;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 
{
	WebDriver driver;
	
	//LoginPage lp;
	LoginPageFactoryApproch lp;
	
	@BeforeClass
	void setUp() 
	{
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
//------------------------------------------------------------------------------------------------------
	@Test
	void testLogo() {
		
		//lp =new LoginPage(driver);
		lp =new LoginPageFactoryApproch(driver);
		lp.logoverification();
		Assert.assertEquals(lp.logoverification(), true);

		
	}
	
	
	@Test
	void verifyValidCredentials()
	{
		lp.enterUserName("Admin");
		lp.enterPassword("admin123");
		lp.clickLoginBtn();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		
	}
//------------------------------------------------------------------------------------------------------	
	@AfterClass
	void teardown() 
	{
		driver.quit();
		
	}

}
