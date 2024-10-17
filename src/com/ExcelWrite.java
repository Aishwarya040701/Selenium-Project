package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			FileInputStream f1=new FileInputStream("TestData//InputDataExcel.xlsx");
			XSSFWorkbook wbook1=new XSSFWorkbook(f1);
			XSSFSheet wsht1=wbook1.getSheetAt(1);

			wsht1.getRow(0).createCell(8).setCellValue("Results");
			wsht1.getRow(1).createCell(8).setCellValue("pass");
			wsht1.getRow(2).createCell(8).setCellValue("Fail");
			wsht1.getRow(3).createCell(8).setCellValue("pass");
			wsht1.getRow(4).createCell(8).setCellValue("pass");
			wbook1.write(new FileOutputStream("Logs//OutputDataExcel.xlsx"));
			
			wbook1.close();
			
			
			
		FileInputStream f2=new FileInputStream("Logs//OutputDataExcel.xlsx");
		XSSFWorkbook wbook2=new XSSFWorkbook(f2);
		XSSFSheet wsht2=wbook2.getSheetAt(1);
		for(int j=1;j<5;j++) {
		String Fname=wsht2.getRow(j).getCell(8).getStringCellValue();
		System.out.println(Fname);
		}
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		

	}

}
