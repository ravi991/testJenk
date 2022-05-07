package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}

	@FindBy(xpath="//*[@id=\"loginlabel\"]") WebElement loginclick;
	
	@FindBy(name="log") WebElement uname;
	
	@FindBy(name="pwd") WebElement pass;
	
	@FindBy(name="wp-submit") WebElement loginButton;
	
	public void loginToCrm(String usernameApplication,String passwordApplication)
	{
		
		try
		{
			Thread.sleep(2000);
		}catch(InterruptedException e)
		{
			
		}
		loginclick.click();
		uname.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();
	}
}
