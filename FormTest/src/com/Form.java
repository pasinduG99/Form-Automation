package com;

import java.awt.Checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webDriver.chrome.driver","D://selenium jars and drivers//drivers//chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate to the site
		driver.get("https://demoqa.com/automation-practice-form");
		
		//Name
		driver.findElement(By.id("firstName")).sendKeys("Pasindu");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Gunaratne");
		//Emial
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("pasinduclash74@gmail.com");
		
		//Radio Button
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		
		//Mobile
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("0771234345");
		
		//Date of birth
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		
		//Select month
		Thread.sleep(4000);
		Select selectmonth = new Select(driver.findElement(By.cssSelector(".react-datepicker__month-select")));
	
		selectmonth.selectByIndex(6);
		
		//Select Year
		Select selectyear = new Select(driver.findElement(By.cssSelector(".react-datepicker__year-select")));
		Thread.sleep(4000);
		selectyear.selectByValue("1999");
		
		//Day
		driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, July 17th, 1999']")).click();
		
		//Subjects
		//WebElement from  = driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']"));
		
		
		//Checkbox 
		 driver.findElement(By.xpath("//label[normalize-space()='Sports']")).click();
		
		

	}

}
