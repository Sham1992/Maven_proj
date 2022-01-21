package com.Maven_proj;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_runner extends Base_Class
{
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		driver = browserlaunch("ChroMe");
		
		geturl("https://accounts.google.com/signin/v2/identifier?"
				+ "continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		WebElement signin = driver.findElement(By.xpath("//input[@type='email']"));
		inputvalue(signin, "sowmtakrishna");
		Thread.sleep(3000);
		
		WebElement next = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		clickelement(next);
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.name("password"));
		inputvalue(password,"Srujan@14.");
		Thread.sleep(3000);
		
		WebElement next1 = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		clickelement(next1);
		Thread.sleep(3000);
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver = wait(5, "seconds");
		
		WebElement compose = driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']"));
		clickelement(compose);
		//Thread.sleep(3000);
		driver = wait(5, "seconds");
		
		WebElement to = driver.findElement(By.name("to"));
		inputvalue(to, "shamalan6139@gmail.com");
		Thread.sleep(3000);
		
		WebElement subject = driver.findElement(By.name("subjectbox"));
		inputvalue(subject, "Testing mail");
		Thread.sleep(3000);
		
		WebElement mail = driver.findElement(By.xpath("//div[@role='textbox']"));
		inputvalue(mail, "Hi buddy" + "How r u?" + "Whr r u");
		Thread.sleep(3000);
		
		screenshot();
		
		WebElement send = driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']"));
		clickelement(send);
		
		WebElement sent = driver.findElement(By.xpath("(//a[@class='J-Ke n0'])[4]"));
		clickelement(sent);
		Thread.sleep(3000);
		
		screenshot();
	}
}
