package com.Vinsys;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataRead {
  @Test
  public void Dataconf() throws Exception {
	  
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  File file = new File ("C:\\Users\\Administrator\\eclipse-workspace\\com.Vinsys\\src\\test\\resources\\config.properties");
	   
	  FileInputStream FIS = new FileInputStream(file);
	  
	  Properties pro = new Properties();
	  pro.load(FIS);
	 
	  System.out.println(pro.getProperty("URL"));
	   
	  
	  
	  
	  
  }
}
