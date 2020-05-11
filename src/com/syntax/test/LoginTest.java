package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.util.CommonMethods;
import com.syntax.util.ConfigsReader;

public class LoginTest extends CommonMethods{

	public static void main(String[] args) {
		/*
		 * User should be able to login application with valid credentials
		 */
		//setUp();
			WebElement username=driver.findElement(By.id("txtUsername"));
		//	sendText(username,ConfigsReader.getProperty("username"));
			
			//sending password
			WebElement password=driver.findElement(By.id("txtPassword"));
	//		sendText(password,ConfigsReader.getProperty("password"));
			//click on login
			
			//close browser
			tearDown();
	}

}
