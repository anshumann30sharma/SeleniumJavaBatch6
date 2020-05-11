package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.util.BaseClass;

public class frameRecap extends BaseClass {

	public static void main(String[] args) {
		setUp();
		//System.setProperty
		driver.switchTo().frame("FrameOne");
		boolean isHomeDis=driver.findElement(By.xpath("//a[@href='./index.html']")).isDisplayed();
		
		System.out.println("Is Home link displayed ?"+isHomeDis);
		driver.switchTo().frame("FrameOne");
		String welcomeMsge=driver.findElement(By.xpath("//h3[text()='Welcome to Selenium easy']")).getText();
		System.out.println("WelcomeMsge");
		
		
	}

}
