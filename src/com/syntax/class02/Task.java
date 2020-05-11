package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("Register here")).click();
		driver.findElement(By.name("firstName")).sendKeys("Alpha");
		driver.findElement(By.name("lastName")).sendKeys("Chino");
		driver.findElement(By.name("phone")).sendKeys("4694964444");
		driver.findElement(By.name("address1")).sendKeys("1888 Morris Rd.");
		driver.findElement(By.name("address2")).sendKeys("");
		driver.findElement(By.name("city")).sendKeys("High Lands");
		driver.findElement(By.name("state")).sendKeys("TX");
		driver.findElement(By.name("postalCode")).sendKeys("75000");
		driver.findElement(By.id("email")).sendKeys("alphachino@gmail.com");
		driver.findElement(By.name("password")).sendKeys("aloa12345");
		driver.findElement(By.name("confirmpassword")).sendKeys("aloa12345");
	}
}