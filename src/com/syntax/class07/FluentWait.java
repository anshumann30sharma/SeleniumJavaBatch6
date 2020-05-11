package com.syntax.class07;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.syntax.util.BaseClass;

public class FluentWait extends BaseClass{
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
	driver=new ChromeDriver();
	//Wait<WebDriver>wait=new FluentWait<WebDriver>(driver)	;
	//FluentWait wait=new FluentWait(driver);
//	wait.withTimeout(Duration.ofSeconds(30));
//	wait.pollingEvery(Duration.ofSeconds(1));
//	wait.ignoring(NoSuchElementException.class);
	
}
}
