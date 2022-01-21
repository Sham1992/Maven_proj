package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page 
{
	public WebDriver driver;
	
	public Search_Page(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "Submit")
	private WebElement submit_btn;
	
	public WebElement getSubmit_btn() 
	{
		return submit_btn;
	}
	
}
