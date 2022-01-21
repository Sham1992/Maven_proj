package com.Maven_proj;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Adactin_testrunner extends Base_Class
{
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		driver = browserlaunch("chrome");
		geturl("https://adactinhotelapp.com/");
		wait(5, "seconds");
				
		WebElement username = driver.findElement(By.id("username"));
		inputvalue(username, "shama1992");
			
		WebElement password = driver.findElement(By.id("password"));
		inputvalue(password, "qwerty9876543210");
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.id("login"));
		clickelement(login);
		
		wait(5, "seconds");

		WebElement location = driver.findElement(By.id("location"));
		Select loc = new Select(location);
		loc.selectByVisibleText("New York");
		Thread.sleep(3000);

		WebElement hotel = driver.findElement(By.id("hotels"));
		Select hot = new Select(hotel);
		hot.selectByValue("Hotel Sunshine");
		Thread.sleep(3000);

		WebElement room = driver.findElement(By.id("room_type"));
		Select ro = new Select(room);
		ro.selectByIndex(4);
		Thread.sleep(3000);

		WebElement date = driver.findElement(By.id("datepick_in"));
		date.clear();
		date.sendKeys("22/01/2022");
		Thread.sleep(3000);

		WebElement date1 = driver.findElement(By.id("datepick_out"));
		date1.clear();
		date1.sendKeys("24/01/2022");
		Thread.sleep(3000);

		WebElement adult = driver.findElement(By.id("adult_room"));
		Select ad = new Select(adult);
		ad.selectByValue("2");
		Thread.sleep(3000);

		WebElement child = driver.findElement(By.id("child_room"));
		Select ch = new Select(child);
		ch.selectByValue("1");
		Thread.sleep(3000);

		WebElement submit = driver.findElement(By.id("Submit"));
		clickelement(submit);
		

		WebElement select = driver.findElement(By.xpath("//input[@type='radio']"));
		clickelement(select);
		
		WebElement continue1 = driver.findElement(By.id("continue"));
		clickelement(continue1);
		Thread.sleep(2000);

		wait(5, "seconds");
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		inputvalue(firstname, "Sham");
		Thread.sleep(2000);
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		inputvalue(lastname,"S.J");
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.id("address"));
		inputvalue(address, "No:2a, ABC apartment, CD Street, New Jersy");
		Thread.sleep(2000);
		
		WebElement cardno = driver.findElement(By.id("cc_num"));
		inputvalue(cardno, "1234567890123456");

		WebElement card = driver.findElement(By.id("cc_type"));
		Select cd = new Select(card);
		cd.selectByVisibleText("VISA");

		WebElement expirym = driver.findElement(By.id("cc_exp_month"));
		Select exm = new Select(expirym);
		exm.selectByValue("6");

		WebElement expiryy = driver.findElement(By.id("cc_exp_year"));
		Select exy = new Select(expiryy);
		exy.selectByVisibleText("2022");

		WebElement ccv = driver.findElement(By.id("cc_cvv"));
		inputvalue(ccv, "369");
		
		WebElement book = driver.findElement(By.id("book_now"));
		clickelement(book);
		Thread.sleep(5000);
		
		wait(5, "seconds");
		
		WebElement bookeditems = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
		clickelement(bookeditems);
		
		screenshot();
		Thread.sleep(3000);

		WebElement logout = driver.findElement(By.id("logout"));
		clickelement(logout);



	}
}
