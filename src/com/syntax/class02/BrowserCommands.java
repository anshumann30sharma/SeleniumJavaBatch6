package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
//@test
	public static void main(String[] args) throws InterruptedException  {
	System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	driver.navigate().refresh();
	driver.navigate().to("https://www.google.com");
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().to("https://www.Amazon.com");
	driver.navigate().forward();
	driver.close();
	}
}
