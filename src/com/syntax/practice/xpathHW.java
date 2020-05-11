package com.syntax.practice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Settings.SeleniumSetting;
import java.io.IOException;
import java.net.SocketException;


public class xpathHW {
	
	/*
	Using xPath ONLY
	TC 2: Mercury Tours Registration: 
	Open chrome browser
	Go to "http://newtours.demoaut.com/"
	Click on Register Link
	Fill out all required info
	Click Submit
	User successfully registered
	*/

//	public class HW1April28 {
		public static void main(String[] args) throws IOException, InterruptedException {
			String url="http://newtours.demout.com/";
			System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[contains(text(), 'Register')]")).click();
			driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys("Sohil");
			driver.findElement(By.xpath("//input[starts-with(@name,'last')]")).sendKeys("Aryan");
			driver.findElement(By.xpath("//input[contains(@name,'phone')]")).sendKeys("2028174198");
			driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).sendKeys("sohilaryan@gmail.com");
			driver.findElement(By.xpath("//input[starts-with(@name,'address1')]")).sendKeys("14120 Newbrook Dr");
			driver.findElement(By.xpath("//input[contains(@name,'address2')]")).sendKeys("Suite #210");
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Chantilly");
			driver.findElement(By.xpath("//input[starts-with(@name,'state')]")).sendKeys("VA");
			driver.findElement(By.xpath("//input[starts-with(@name,'postal')]")).sendKeys("20151");
			// selecting country from dropdown box
			driver.findElement(By.xpath("//select[@name='country'] //option[@value='214']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("SohilA");
			driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("sohil123");
			driver.findElement(By.xpath("//input[starts-with(@name,'confirm')]")).sendKeys("sohil123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[starts-with(@name,'register')]")).click();
			if (driver.findElement(By.xpath("//font/b[contains(text(),'Sohil Aryan')]")) != null) {
				System.out.println("User successfully registered");
			} else {
				System.out.println("User Registration not successfull");
			}
			Thread.sleep(3000);
			driver.manage().deleteAllCookies();
//			driver.quit();//commented out to get rid of java.net.SocketException: Connection reset;
		}
	}

