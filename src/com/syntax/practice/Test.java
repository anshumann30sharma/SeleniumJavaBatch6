package com.syntax.practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Settings.SeleniumSetting;

public class Test {

	public static void main(String[] args) {
		
		SeleniumSetting.driver("chrome");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(SeleniumSetting.getpUrl());
		
		driver.findElement(By.name("userName")).sendKeys(SeleniumSetting.getUserName());
		driver.findElement(By.name("password")).sendKeys(SeleniumSetting.getPwd());
		driver.findElement(By.name("login")).click();
		
		

	}

}
