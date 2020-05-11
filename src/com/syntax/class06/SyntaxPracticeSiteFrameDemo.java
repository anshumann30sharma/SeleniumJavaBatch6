package com.syntax.class06;

import org.openqa.selenium.By;
import com.syntax.util.BaseClass;

public class SyntaxPracticeSiteFrameDemo extends BaseClass{

	public static void main(String[] args) {
	BaseClass.setUp();
	//System.setProperty
	driver.switchTo().frame("FrameOne");
	boolean logoIsDis=driver.findElement(By.id("hide")).isDisplayed();
	System.out.println("Logo inside frame is displayed: : "+logoIsDis);
	//driver.switchTo().parentFrame();
	driver.switchTo().defaultContent();
	driver.switchTo().frame("FrameTwo");
	boolean enrolBtnIsIsEnab=driver.findElement(By.id("enrol-btn")).isEnabled();
	System.out.println("Enrol Button inside frame Two is Enabled: :"+enrolBtnIsIsEnab);
		
BaseClass.tearDown();

	}

}
