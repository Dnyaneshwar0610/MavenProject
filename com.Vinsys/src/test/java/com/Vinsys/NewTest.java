package com.Vinsys;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
  @Test
  public void f() {
	  

	  WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//driver.findElement(By.tagName("a")).click();
		driver.findElement(By.tagName("//a[2]")).click();
	    //String str=  driver.findElement(By.id("txtUserName")).getAttribute("type");
		//System.out.println(str);
		
		
		
		
  }
}
