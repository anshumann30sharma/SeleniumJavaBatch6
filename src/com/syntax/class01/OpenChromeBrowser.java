package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();//go ahead and open chrome browser
	
		//driver.get("//http://www.google.com");
		driver.get("https:www.facebook.com");
		String url=driver.getCurrentUrl();
		if(url.equalsIgnoreCase("https:www.facebook.com")) {
			String title=driver.getTitle();
			System.out.println(title);
		}else {
			System.out.println("Wrong Urlis returned");
		}
	driver.close();
		
		//System.out.println(driver.getTitle());

	}

}
