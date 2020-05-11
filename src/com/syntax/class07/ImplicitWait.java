package com.syntax.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.util.BaseClass;

public class ImplicitWait extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://uitestpractice.com/Students/contact");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.linkText("This is a Ajax link")).click();
		String text=driver.findElement(By.className("ContactUs")).getText();
		System.out.println(text);
		
	}

}
