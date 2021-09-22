package com.Vinsys;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProgramm {
	public static void main(String[] args) {
		
	
	
	//WebDriverManager.firefoxdriver().setup();
	//FirefoxDriver driver = new FirefoxDriver();
	//driver.get("https://opensource-demo.orangehrmlive.com/");
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driverch = new ChromeDriver();
	driverch.get("https://opensource-demo.orangehrmlive.com/");
	
	//driverch.findElement(By.tagName("a")).click();
	//driverch.findElement(By.tagName("//a[2]")).click();
	
  String str=  driverch.findElement(By.id("txtUserName")).getAttribute("name");
	System.out.println(str);
	
	
}
}