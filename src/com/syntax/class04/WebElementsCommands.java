package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {
	public static String url="http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx/";
	public static String userName="tester";
public static String password="test";
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		WebElement userName=driver.findElement(By.xpath("//input[contains(@id,'username"));
		userName.sendKeys("Tester");
		Thread.sleep(3000);
		userName.clear();
		WebElement pass=driver.findElement(By.cssSelector("input[name*='$password']"));
		userName.clear();
		Thread.sleep(3000);
		pass.sendKeys("test");
		WebElement loginBtn=driver.findElement(By.cssSelector("input[value='Login']"));
		loginBtn.submit();
		boolean logoIsDisplayed=driver.findElement(By.xpath("//h1[text(='Web Orders']")).isDisplayed();
		if(logoIsDisplayed) {
			System.out.println("Logo is Displayed, Test Case passed");
		}else {
			System.out.println("Logo is not Displayed, Test Case failed");
					
		}
		WebElement loginInfo=driver.findElement(By.xpath("//div[@class='login_info']"));
		String text=loginInfo.getText();
		if(text.contains("tester") ){
		System.out.println("User successfully logged in, Test Case passed");
		}else {
			System.out.println("User successfully cannot login, Test Case failed");
		}
		driver.quit();
		
	}

}
