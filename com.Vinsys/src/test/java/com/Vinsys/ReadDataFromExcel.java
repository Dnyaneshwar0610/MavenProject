package com.Vinsys;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
  @Test
  public void f() throws Exception {
	  
	  File src = new File("C:\\Users\\Administrator\\Desktop\\Day5  selenium\\TestCases.xls");
      
      FileInputStream fis = new FileInputStream(src);
     
      HSSFWorkbook wb = new HSSFWorkbook(fis);
     
      HSSFSheet sheet=wb.getSheet("Data");
     
      int rowCount =sheet.getLastRowNum();
      int colCount = sheet.getRow(0).getLastCellNum();
     
      System.out.println(rowCount);
     
      System.out.println(colCount);
     
      for(int r=0;r<=rowCount;r++)
      {
          for(int c=0;c<colCount;c++)
          {
              System.out.print(sheet.getRow(r).getCell(c).getStringCellValue() + "|");               
          }
          System.out.println();
      }
         
      FileOutputStream fout = new FileOutputStream(src);
     
      sheet.getRow(2).createCell(2).setCellValue("Pass");
     
      wb.write(fout);
     
      wb.close();
         
     
     
  }

	  
	  
	  
	  
	  
	  
	  
	  
  }

