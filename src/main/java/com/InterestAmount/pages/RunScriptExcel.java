package com.InterestAmount.pages;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RunScriptExcel {

	public static void write(int i, int j, String message) {
		try
		{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testcases\\EMI.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Run Scripts");
		if(sheet.getRow(i).getCell(j).getStringCellValue().equalsIgnoreCase("No Run")||sheet.getRow(i).getCell(j).getStringCellValue().equalsIgnoreCase("PASS")||sheet.getRow(i).getCell(j).getStringCellValue().equalsIgnoreCase("FAIL"))
		{
			if(message.equals("Pass"))
			{
				sheet.getRow(i).getCell(j).setCellValue("PASS");
			}
			else
			{
				sheet.getRow(i).getCell(j).setCellValue("FAIL");
			}
		}
		FileOutputStream output_file=new FileOutputStream(System.getProperty("user.dir")+"\\testcases\\EMI.xlsx");
		workbook.write(output_file);
		output_file.close();
		workbook.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
