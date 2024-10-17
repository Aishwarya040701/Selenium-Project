package com.datadrivenframework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConnectionClass {
	public static XSSFWorkbook wbook;
	public static XSSFSheet wsht;
	public static String path="TestData//";
	
	
	public static void ExcelConnection(String FileName,String SheetName) throws IOException {
		
		FileInputStream fi=new FileInputStream(path+FileName);
		wbook=new XSSFWorkbook(fi);
		wsht=wbook.getSheet(SheetName);
	
	 }
	
	public static String ExcelRow(int row,int col) {
		return wsht.getRow(row).getCell(col).getStringCellValue();
	 }

}
