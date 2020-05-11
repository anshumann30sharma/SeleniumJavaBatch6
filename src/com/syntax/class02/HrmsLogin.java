package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmsLogin {

	public static void main(String[] args) {
		String url="http: //166.62.36.207/humanresources/symphony/web/index.php/dashbpard";
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		String fbUrl="http://www.facebook.com";
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("")).sendKeys("syntaxtest@yahoo.com");

	}

}
