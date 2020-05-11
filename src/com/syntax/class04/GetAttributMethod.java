package com.syntax.class04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributMethod {

	public static void main(String[] args) {
		String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		

	}

}
