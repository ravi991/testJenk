package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search {

WebDriver driver;
	
	public Search(WebDriver ldriver)
	{
		this.driver=ldriver;
	}


		@FindBy(name="search_course") WebElement search;
		
		@FindBy(xpath="//*[@id=\"primary_menu\"]/nav[1]/form/button") WebElement searchbtn;
		
		public void searchItem(String searchCourse)
		{
			try
			{
				Thread.sleep(2000);
			}catch(InterruptedException e)
			{
				
			}
			
			search.sendKeys(searchCourse);
			searchbtn.click();
		}
	

}
