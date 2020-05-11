package com.syntax.class07;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.util.BaseClass;

public class windowHandleWithLoop extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demoqa.com/automation-practice-switch-windows-2/");
		String signUpTitle=driver.getTitle();
		System.out.println("Main Page Title is : ;"+signUpTitle);
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("What is the Parent Window Handle?"+parentWindowHandle);
		
		for(int i=1;i<=3;i++) {
		driver.findElement(By.id("button1")).click();
		Thread.sleep(3000);
	}
Set<String>allWindowHandles=driver.getWindowHandles();

for(String handle: allWindowHandles) {
	System.out.println("Id of the Window : :  "+handle);
	driver.switchTo().window(handle);
	driver.get("http ://www.google.com");
	Thread.sleep(3000);
			driver.close();

}
}
 
}

