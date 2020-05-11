package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.util.BaseClass;

public class TaskAmazon extends BaseClass{

	public static void main(String[] args) {
		setUp();
		WebElement searchDropDown=driver.findElement(By.id("searchDropDownBox"));
	Select selectDD=new Select(searchDropDown);
	List<WebElement>ddOptions=selectDD.getOptions();
		for(WebElement option: ddOptions) {
			String optionText=option.getText();
			System.out.println(optionText);		
		}
		selectDD.selectByVisibleText("Books");
		WebElement searchTextbox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		searchTextbox.sendKeys("Harry Potter");
		WebElement searchButton= driver.findElement(By.className("//input[@type='submit'][@class='nav']"));
		searchButton.click();
		

		List<WebElement>bookSeriesCheckboxes=driver.findElements(By.xpath("['a-spacing-micro']"));
		for(WebElement bookSeriesCheckbox : bookSeriesCheckboxes) {
			String checkboxText=bookSeriesCheckbox.getText();
	//		if(!bookSeriesCheckbox.isSelected() && Checkbox) {
				
			}
		}
	}
	

	//}

