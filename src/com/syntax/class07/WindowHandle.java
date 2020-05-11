package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.util.BaseClass;

public class WindowHandle extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice//window-popup-modal-demo.html");
		String signUpTitle=driver.getTitle();
		System.out.println("Main Page Title is : ;"+signUpTitle);
		String parentWindowHandle=driver.getWindowHandle();
		System.out.println("What is the Parent Window Handle?"+parentWindowHandle);
		 driver.findElement(By.linkText("Follow on Instagram")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Like us on Facebook")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Follow on Instagram & Facebook")).click();
		 Thread.sleep(2000);
		 
		 Set<String>allWindowHandles=driver.getWindowHandles();//returns set of window handle od all window
		 System.out.println("What is the number of Windows opened ?"+allWindowHandles.size());
		 
		 	 Iterator<String>it=allWindowHandles.iterator();
		 	 
		 	 while(it.hasNext()) {
		 		 String handle=it.next();//grab the next window handle
		 		 if(!handle.equals(parentWindowHandle)) {//switch to next window only if not same as parent window
		 			 driver.switchTo().window(handle);
		 			 System.out.println(driver.getTitle());
		 			 driver.close();
		 			 Thread.sleep(3000);
		 			 
		 		 }
		 	 }
		 	driver.quit(); 
}

}
