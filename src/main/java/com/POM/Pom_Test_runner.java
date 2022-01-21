package com.POM;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Maven_proj.Base_Class;

public class Pom_Test_runner extends Base_Class
{
	public static WebDriver driver = Base_Class.browserlaunch("chrome");
	public static Login_Page login = new Login_Page(driver);
	public static Search_Page hotel = new Search_Page(driver);
	
	public static void main(String[] args) throws IOException 
	{
		geturl("https://adactinhotelapp.com/");
		wait(5, "seconds");
		
		inputvalue(login.getUsername(), "shama1992");
		inputvalue(login.getPassword(), "qwerty9876543210");
		clickelement(login.getLogin_btn());
		
		screenshot();
		
		clickelement(hotel.getSubmit_btn());
		
		
	}
}
