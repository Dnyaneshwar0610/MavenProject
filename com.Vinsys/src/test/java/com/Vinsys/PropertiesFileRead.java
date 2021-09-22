package com.Vinsys;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesFileRead {
  @Test
  public void f() throws Exception {
	 
		     
	      File file = new File("C:\\Users\\Administrator\\eclipse-workspace\\com.Vinsys\\src\\test\\resources\\or.properties");
	     
	      FileInputStream fInput= new FileInputStream(file);
	     
	      Properties prop = new Properties();
	     
	      prop.load(fInput);
	     
	      System.out.println(prop.getProperty("objUsername"));
	      System.out.println(prop.getProperty("objPassword"));
	      System.out.println(prop.getProperty("objLoginBtn"));
	      

	  
	  
	  
	  
	  
	  
	  
  }
	  
  }

