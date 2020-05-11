package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

	public static void main(String[] args) {
		/*getCurrentUrl
		 * Commands with Page
		 * getTitle
		 */
		 
		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		String fbUrl="http://www.facebook.com";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.get(fbUrl);
		driver.getCurrentUrl();
		String url=driver.getCurrentUrl();	
		System.out.println("Current URL is: "+url);
		String title=driver.getTitle();
		System.out.println("Title of the page is: "+title);
		driver.close();
		

	}

}
