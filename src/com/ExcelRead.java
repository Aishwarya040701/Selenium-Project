package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelRead{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        
		
			
			FileInputStream fi=new FileInputStream("TestData//InputDataExcel.xlsx");
			XSSFWorkbook wbook=new XSSFWorkbook(fi);
			XSSFSheet wsht0=wbook.getSheet("url");
			String Url=wsht0.getRow(1).getCell(0).getStringCellValue();
			driver.get(Url);
			XSSFSheet wsht=wbook.getSheetAt(1);
			int rowcount=wsht.getLastRowNum();
			System.out.println(rowcount);
			
			for(int i=1;i<=rowcount;i++) {
			String Fname=wsht.getRow(i).getCell(0).getStringCellValue();
			System.out.println(Fname);
			String Lname=wsht.getRow(i).getCell(1).getStringCellValue();
			System.out.println(Lname);
			String Mob=wsht.getRow(i).getCell(2).getStringCellValue();
			System.out.println(Mob);
			String Password=wsht.getRow(i).getCell(3).getStringCellValue();
			System.out.println(Password);
			String day=wsht.getRow(i).getCell(4).getStringCellValue();
			System.out.println(day);
			String mon=wsht.getRow(i).getCell(5).getStringCellValue();
			System.out.println(mon);
			String year=wsht.getRow(i).getCell(6).getStringCellValue();
			System.out.println(year);
			String gender=wsht.getRow(i).getCell(7).getStringCellValue();
			System.out.println(gender);
			
			WebElement Fb_Fname =driver.findElement(By.name("firstname"));
			Fb_Fname.clear();
			Fb_Fname.sendKeys(Fname);
			
			WebElement Fb_Lname = driver.findElement(By.name("lastname"));
			Fb_Lname.clear();
			Fb_Lname.sendKeys(Lname);
			WebElement Fb_Mob = driver.findElement(By.name("reg_email__"));
			Fb_Mob.clear();
			Fb_Mob.sendKeys(Mob);
			
			WebElement Fb_Pass = driver.findElement(By.name("reg_passwd__"));
			Fb_Pass.clear();
			Fb_Pass.sendKeys(Password);
			
			Select Fb_Day = new Select(driver.findElement(By.name("birthday_day")));
		    Fb_Day.selectByVisibleText(day);
			Select Fb_Mon = new Select(driver.findElement(By.name("birthday_month")));
			Fb_Mon.selectByVisibleText("Jul");
			Select Fb_Year =  new Select(driver.findElement(By.name("birthday_year")));
			Fb_Year.selectByVisibleText(year);
			
			
			WebElement Fb_Gender;
			if(gender.equals("male")) {
				Fb_Gender= driver.findElement(By.cssSelector("input[name='sex'][value='2']"));
			}
			else {
				Fb_Gender = driver.findElement(By.cssSelector("input[name='sex'][value='1']"));
			}
			Fb_Gender.click();
			}
			
			
			
			
			
			wsht.getRow(0).createCell(8).setCellValue("Results");
			wsht.getRow(1).createCell(8).setCellValue("pass");
			wsht.getRow(2).createCell(8).setCellValue("Fail");
			wsht.getRow(3).createCell(8).setCellValue("pass");
			wsht.getRow(4).createCell(8).setCellValue("pass");
			wbook.write(new FileOutputStream("Logs//OutputDataExcel.xlsx"));
			
			wbook.close();
		
				
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		try {
			FileInputStream f2=new FileInputStream("Logs//OutputDataExcel.xlsx");
			XSSFWorkbook wbook=new XSSFWorkbook(f2);
			XSSFSheet wsht=wbook.getSheetAt(1);
			for(int j=1;j<5;j++) {
			String Fname=wsht.getRow(j).getCell(8).getStringCellValue();
			System.out.println(Fname);
			}
			}
			catch (Exception e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
			}
		
		

	}

}


