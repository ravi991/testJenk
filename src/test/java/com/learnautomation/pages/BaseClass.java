package com.learnautomation.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ConfigDataProvider;
import com.learnautomation.utility.ExcelDataProvider;

public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;
	public ExtentReports report;
	public ExtentTest looger;
	
	@BeforeSuite
	public void setUpSuite()
	{
		excel =new ExcelDataProvider();
		config=new ConfigDataProvider();
		
		ExtentHtmlReporter extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir")+ "/Reports/report.html"));
		report =new ExtentReports();
		report.attachReporter(extent);
		
	}
	@BeforeClass
	public void setup()
	{
		driver=BrowserFactory.startApplication(driver,config.getBrowser(),config.getStagingUrl());
	}
	
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod()
	{
		report.flush();
	}
}
