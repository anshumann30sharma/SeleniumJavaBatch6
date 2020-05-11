package com.syntax.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class secondP {

	public static String url="https://www.facebook.com/";
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
        WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
        Select selectm=new Select(month);
        Select selectd=new Select(day);
        Select selecty=new Select(year);
        selectm.selectByVisibleText("Oct");
       	 selectd.selectByIndex(30);
        selecty.selectByValue("1957");
        System.out.println(selectm.isMultiple());
	}
}