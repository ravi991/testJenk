package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.pages.Search;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;

public class LoginTestCRM extends BaseClass {

	
	@Test(priority =1)
	public void loginApp()
	{
		looger=report.createTest("Login to Portal");
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		looger.info("Starting Application");
		
		loginpage.loginToCrm(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1)); 
		
		looger.pass("Login Success");
		
		
		
	}
	
	@Test(priority =2)
	public void search()
	{
		Search search= PageFactory.initElements(driver, Search.class);
		
		search.searchItem(excel.getStringData("Login", 1, 0));
	}
}
