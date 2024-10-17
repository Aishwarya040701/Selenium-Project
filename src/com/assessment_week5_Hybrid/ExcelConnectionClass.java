package com.assessment_week5_Hybrid;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConnectionClass {
	public static XSSFWorkbook wbook;
	public static XSSFSheet wsheet;
	public static String path="TestData//";
	
	
	public static void ExcelConnection(String Filename, String sheetname) throws IOException {
		//connection
		FileInputStream f=new FileInputStream(path+Filename);
		wbook =new XSSFWorkbook(f);
		wsheet=wbook.getSheet(sheetname);
	}
	
	//get value from excel
	public static String ExcelRows(int Row,int Col) throws IOException {
		return wsheet.getRow(Row).getCell(Col).getStringCellValue();
	}

}
