package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page
{
	public WebDriver driver;
	
	public Login_Page(WebDriver driver2) 
	{
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement username;

	public WebElement getUsername() 
	{
		return username;
	}
	
	@FindBy(id = "password")
	private WebElement password;
	
	public WebElement getPassword() 
	{
		return password;
	}
	
	@FindBy(id = "login")
	private WebElement login_btn;

	public WebElement getLogin_btn() 
	{
		return login_btn;
	}
	
	
}
