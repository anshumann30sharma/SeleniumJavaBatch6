package com.syntax.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.util.BaseClass;

public class ExplicitWait extends BaseClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/dynamic-elements-loading.html");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.id("Start Button")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Welcome Syntax Technologies')]")).isDisplayed();
		
		
		boolean text=driver.findElement(By.xpath("//h4[contains(text(),'Welcome Syntax Technologies')]")).isDisplayed();
		//boolean isDisp=driver.findElement(By.xpath("//p[contains(text(),'First Name')]")).isDisplayed();
		
		
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'First Name')]")));
		//WebElement ele=driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
		
	
		//System.out.println("First Name is Displayed : :"+ele.isDisplayed());
	System.out.println(text);
	driver.quit();
	
	}
	

}
