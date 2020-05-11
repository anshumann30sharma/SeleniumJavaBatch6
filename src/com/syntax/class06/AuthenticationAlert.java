package com.syntax.class06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlert {

	public static void main(String[] args) {
		//Actual url=http://abcdatabase.com/basicauth
		//userName=test
		//password=test
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://test:test@abcdatabase.com/basicauth");
		

	}

}
