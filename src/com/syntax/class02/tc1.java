package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1 {

	public static void main(String[] args) {
		/*Open chrome browser
		Go to “https://www.facebook.com/”
		Enter first name
		Enter last name
		Enter mobile number
		Click on sign up button*/
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.name("firstname")).sendKeys("Refia");
        driver.findElement(By.name("lastname")).sendKeys("Hafsa");
        driver.findElement(By.id("u_0_r")).sendKeys("1234456678");
        driver.findElement(By.name("websubmit")).click();

	}

}
