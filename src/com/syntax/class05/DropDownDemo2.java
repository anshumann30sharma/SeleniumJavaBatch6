package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.util.BaseClass;

public class DropDownDemo2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		setUp();
		WebElement continents=driver.findElement(By.id("continents"));
		Select select=new Select(continents);
		List<WebElement>options=select.getOptions();//it will return list of all options in the DD
		for(WebElement option: options) {
			String text= option.getText();
			System.out.println(text);
			
			if(text.contentEquals("Africa")) {
				option.click();
				String ddtext= option.getText();
				if(ddtext.contentEquals("Africa")) {
					System.out.println("Africa is selected : : "+option.isSelected());
					
					
				}
				Thread.sleep(2000);
				
			}
			//you can select by visible text
		}
		boolean isMultiple=select.isMultiple();
		System.out.println("The Continent DD is Multiple: : "+ isMultiple);
		
		
	}

}
