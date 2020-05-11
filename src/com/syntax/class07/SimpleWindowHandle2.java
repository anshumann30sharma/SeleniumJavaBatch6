package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.util.BaseClass;

public class SimpleWindowHandle2 extends BaseClass{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		String signUpTitle=driver.getTitle();
		System.out.println("Main Page Title is: : "+signUpTitle);
		
		driver.findElement(By.linkText("Help")).click();
		//two methods
		Set<String>allWindowHandles=driver.getWindowHandles();
		System.out.println("Number of Windows opened are: " +allWindowHandles.size());
		
		Iterator<String>it=allWindowHandles.iterator();
		String mainWindowHandle=it.next();//Returns id of main window
		System.out.println("Id of Main window :"+mainWindowHandle);
		String childWindowHandle=it.next();//Returns id of child window
		System.out.println("Id of ChildWindow is : "+childWindowHandle);
		driver.switchTo().window(childWindowHandle);
		String childWindowTitle=driver.getTitle();
		System.out.println("Child Page Title is : : "+childWindowTitle);
		// driver.close();
		
				
		

	}

}
