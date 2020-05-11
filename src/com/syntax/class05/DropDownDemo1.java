package com.syntax.class05;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.syntax.util.BaseClass;

public class DropDownDemo1 extends BaseClass{
//@test
	public static void main(String[] args) throws InterruptedException {
		setUp();//open chrome browser launch Syntax Practice
		WebElement weekDD=driver.findElement(By.id("select-demo"));
		Select select=new Select(weekDD);
		/*
		 * Selenium provides three different ways to select a value from a DD
		 * 1.byIndex();
		 * 2.ByVisibleText
		 */
		List<WebElement>options=select.getOptions();
		System.out.println("Number of Options in the DD: : "+options.size());
		
		select.selectByIndex(3);
		for(int i=0;i<options.size();i++) {
			select.selectByIndex(i);
			Thread.sleep(3000);
			
		}
		select.selectByVisibleText("Friday");
		
		
			Thread.sleep(3000);
				tearDown();
	}

}
