package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.util.CommonMethods;

public class FacebookSignUp extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
	//	setUp();
		//WebElement signUp=driver.findElement(By.className("websubmit"));
		WebElement monthDD=driver.findElement(By.id("month"));
		selectDdValue(monthDD,8 );
		//select day
		WebElement dayDD=driver.findElement(By.id("day"));
		selectDdValue(dayDD,30);
		//select year
		
		//WebElement monthDD=driver.findElement(By.id("month"));
		//selectDdValue(monthDD,8 );

		//obj.selectByVisibleText("June");
		Thread.sleep(3000);
		tearDown();
		

	}

}
