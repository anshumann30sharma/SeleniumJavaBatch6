package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.util.BaseClass;

public class AlertDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
	BaseClass.setUp();//Below code is http://uitestpractice.com/Students/Switchto
	driver.findElement(By.xpath("//button[@id='alert']")).click();
	//Handling simple alert/Popups
	Alert simpleAlert=driver.switchTo().alert();
	Thread.sleep(1000);
	String simpleAText=simpleAlert.getText();
	System.out.println("This is simple alert text: "+simpleAText);
	Thread.sleep(1000);
	simpleAlert.accept();
	//Handling confirmation  alert
	driver.findElement(By.id("confirm")).click();
	Alert confirmAlert = driver.switchTo().alert();
	Thread.sleep(1000);
	String confirmAText=confirmAlert.getText();
	System.out.println("This is confirm alert Text : "+confirmAText);
	Thread.sleep(1000);
	confirmAlert.dismiss();
	
	//Handling Prompt alerts/confirmation alerts by providing message
	String name="John Smith";
	driver.findElement(By.id("prompt")).click();
	Alert promptAlert=driver.switchTo().alert();
	System.out.println("This is Prompt alert Text : "+promptAlert.getText());
	promptAlert.sendKeys(name);
	promptAlert.accept();
	String text=driver.findElement(By.xpath("//div[@id='demo')]")).getText();
	System.out.println("Text added to alert Box: : "+text);
	
	if(text.contains("John Smith")) {
		System.out.println("Text was successfully added");
	}else {
		System.out.println("Text "+name+" was not entered");
		
	}
	BaseClass.tearDown();
	}

}
