package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static void main(String[] args) throws InterruptedException {
		 String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.cssSelector("input[id='txtUserName']")).sendKeys("Admn");
		driver.findElement(By.cssSelector("input[name*='txtUser']")).click();
		driver.findElement(By.cssSelector("input[name*='txtPass']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.cssSelector("input[id^='btn']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class$='trigger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("a[text()='trigger']")).click();
		driver.findElement(By.xpath("input[class=formInputText'][name='firstName']")).click();
		
	}
//Cascading sheet style(CSS) Selector
	//tagName{attributeName='attributeValue']
	//with class attribute (dot) can be used, there should be not gaps in the attributes of class attribute
	//replace the space with dot
	
}
