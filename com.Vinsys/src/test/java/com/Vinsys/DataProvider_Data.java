package com.Vinsys;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Data {
   @DataProvider(name="Login")
	    public Object[] getData()
	    {
	        Object[] data = {"Admin","temp"};
	        return data;
	    }
	  
	  
	  
  }

