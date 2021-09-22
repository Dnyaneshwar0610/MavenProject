package com.Vinsys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolaQA {
  @Test
  public void f() {
	  
	  WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
	  
	  
      
      
    //Click
      /*
       driver.findElement(By.xpath("//button[text()='Click Me']")).click();
 
      String str =driver.findElement(By.xpath("//button[text()='Click Me']")).getAttribute("id");
     
     driver.findElement(By.id(str)).click();
      */
		WebElement str =driver.findElement(By.id("doubleClickBtn"));
		System.out.println(str.getAttribute("id"));
     
      //Double Click
      /*
      WebElement element=driver.findElement(By.id("doubleClickBtn"));
  
      Actions act = new Actions(driver);
      //act.moveToElement(element).doubleClick().build().perform();
      act.doubleClick(element).build().perform();
     */
      
      
     
      //Right Click
     
      /*
      WebElement element=driver.findElement(By.id("rightClickBtn"));
     
      Actions act = new Actions(driver);
      act.moveToElement(element).contextClick().build().perform();
      //act.contextClick(element).build().perform();
      
      */
		
		driver.findElement(By.tagName("//a[2]")).click();
      
  }
  
}
