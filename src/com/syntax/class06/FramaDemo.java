package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.util.BaseClass;

public class FramaDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		BaseClass.setUp();
		String text=driver.findElement(By.xpath("//h3[text()='click on the below link : ']")).getText();
		System.out.println(text);
		
		
		//by Index
		driver.switchTo().frame(0);
		
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Vital");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		//by Name/id
		driver.switchTo().frame("iframe_a");
		name.clear();
		driver.findElement(By.id("name"));
		name.sendKeys("Sarmed");
		driver.switchTo().defaultContent();
		
		//By webElement
		WebElement firstFrame=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
		driver.switchTo().frame(firstFrame);
		name.clear();
		name.sendKeys("Asel");
		
		
		
		
		Thread.sleep(3000);
		tearDown();
		
		

	}

}
