package com.syntax.practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class firstP {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
        
        driver.get(url);
        
        Thread.sleep(1000);
        driver.findElement(By.linkText("Input Forms")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        
        WebElement bt1=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input")),
                   bt2=driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[2]/input"));
        Thread.sleep(1000);
        bt1.click();
        Thread.sleep(1000);
        bt2.click();
        System.out.println("is radio button 1 selelected? - "+bt1.isSelected());
        System.out.println();
        System.out.println("=============================================");
        System.out.println();
        System.out.println("is radio button 2 selelected? - "+bt2.isSelected());
        
        Thread.sleep(2000);
        
        driver.close();
        
        
    }
}