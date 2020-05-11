package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		String url="http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admn");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.xpath("//a[contains[@id,'span')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[starts-with(text(),'Log')]")).click();
		driver.findElement(By.xpath("//input[@class='formInputText'and/or @id='firstName']")).click();
		driver.findElement(By.xpath("//*[@id='firstName']")).click();
	}
//xpath 1 doesn't support "ends with "function
}
