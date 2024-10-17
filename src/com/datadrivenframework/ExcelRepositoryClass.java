package com.datadrivenframework;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExcelRepositoryClass {
	   public static WebDriver driver;
	
	
	public static void ExcelHelperClass(String Filename,String Sheetname) throws IOException {
		
		ExcelConnectionClass.ExcelConnection( Filename, Sheetname);
		String app_url=ExcelConnectionClass.ExcelRow(1, 0);
		System.out.println(app_url);
		
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(app_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
		
		public static void ExcelHelperClass1(String Filename,String Sheetname) throws IOException {
		
		ExcelConnectionClass.ExcelConnection(Filename, Sheetname);
		int rowcount=ExcelConnectionClass.wsht.getLastRowNum();
		System.out.println(rowcount);
		for(int i=1;i<rowcount;i++) {
			String proName=ExcelConnectionClass.ExcelRow(i, 1);
			String proValue=ExcelConnectionClass.ExcelRow(i, 2);	
			String action=ExcelConnectionClass.ExcelRow(i, 3);
			String Inputdata=ExcelConnectionClass.ExcelRow(i, 4);
			System.out.println("proName: "+proName+" proValue: "+proValue+" action: "+action+" Inputdata:"+Inputdata);
			
			switch (action) {
			case "textbox":
				driver.findElement(ExcelLocatorClass.ExcelLocator(proName, proValue)).sendKeys(Inputdata);
				break;
				
			case "dropdown":
				new Select(driver.findElement(ExcelLocatorClass.ExcelLocator(proName, proValue))).selectByVisibleText(Inputdata);
				break;
				
			case "radio":
				driver.findElement(ExcelLocatorClass.ExcelLocator(proName, proValue)).click();
				break;
				
			case "wait":
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
				break;
				
			case "capture":
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("screenshot//"+"FBsign_up_page"+".png"));
				break;
				
			case "Alert":
				driver.switchTo().alert().accept();
				break;

			default:
				break;
			}
		
		
		
		
		}
		
		
				
		
	}

}
