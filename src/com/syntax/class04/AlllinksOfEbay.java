package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlllinksOfEbay {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.ebay.com");
		List<WebElement>allLinks=driver.findElements(By.tagName("a"));//"a" stands for anchor
		System.out.println("Size of all links on Ebay : "+allLinks.size());//print list of WebElement
		int count=0;
		
		for(WebElement link : allLinks) {
			String text=link.getText();
			if(text.isEmpty()) {
				System.out.println(text);
				count++;
				
			}
		}
		System.out.println("Total number of links with text is: "+count);
		driver.quit();
		
	}

}
