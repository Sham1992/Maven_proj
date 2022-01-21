package com.Maven_proj;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.io.FileHandler;

public class Base_Class 
{
	public static WebDriver driver;
	
	public static WebDriver browserlaunch (String type)
	{
		if(type.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"//driver//chromedriver.exe"	);
			driver = new ChromeDriver();
			
		}
		else if (type.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"//driver//geckodriver.exe"	);
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void clickelement (WebElement element)
	{
		element.click();
	}
	
	public static void inputvalue(WebElement element, String value) 
	{
		element.sendKeys(value);
	}
	
	public static void geturl(String url ) 
	{
		driver.get(url);
	}
	
	public static void close()
	{
		driver.close();
	}
	
		
	public static void screenshot() throws IOException 
	{
		Date currentdate = new Date();
		String newdate = currentdate.toString().replace(" " , "-").replace(":","-");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile, new File(".//Screenshot//"+newdate+".png"));
	}
	
	public static WebDriver wait(int value, String type ) 
	{
		if (type.equalsIgnoreCase("Seconds"))
		{
			driver.manage().timeouts().implicitlyWait(value,TimeUnit.SECONDS);
		}
		else if (type.equalsIgnoreCase("Minute")) 
		{
			driver.manage().timeouts().implicitlyWait(value,TimeUnit.MINUTES);
		}
		return driver;
	}
}	
