package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {
//public static String url="https://"
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		WebElement maleRadioB=driver.findElement(By.xpath("//input[@id='sex-0']"));
		System.out.println(maleRadioB.isDisplayed());//true
		System.out.println(maleRadioB.isEnabled());//true
		System.out.println(maleRadioB.isSelected());//false
		System.out.println("----------");
		//first way to click on a radio button
		System.out.println("Radio Btn is Selected: : " +maleRadioB.isSelected());
		
		//second way to click on radio btn
		List<WebElement>listRadio=driver.findElements(By.xpath("input[@name='profession']"));

	List<WebElement> proList = null;
	int listSize= proList().size();
	System.out.println("Size of CheckBoxes are: : "+listSize);
	String valueToBeSelected="Manual Tester";
	
	for(WebElement profession:proList) {
		if(profession.isEnabled()) {//checking is the checkbox is enabled
			String value=profession.getAttribute("value");//get value of value attribute
			System.out.println(value);
			if(value.contentEquals(valueToBeSelected)) {
				profession.click();
				break;
				
			}
		}
		
	}
	
	}

	private static List<WebElement> proList() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
