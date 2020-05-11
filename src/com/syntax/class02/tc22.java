package com.syntax.class02;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class tc22 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.zillow.com/");
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        String actualurl = driver.getCurrentUrl();
//  String expected = "zillow"; 
        if (actualurl.contains("zillow")) {
            String url = driver.getTitle();// retrieving the currently working page
            System.out.println("The url contains Zillow");
        } else {
            System.out.println("Wrong url");
        }
        driver.quit();
    }
}



		
