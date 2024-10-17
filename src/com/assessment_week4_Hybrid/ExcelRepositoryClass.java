package com.assessment_week4_Hybrid;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ExcelRepositoryClass {
	public static WebDriver driver;

		public static void AppOpen(String filename,String sheetname) throws IOException {
			
			ExcelConnectionClass.ExcelConnection(filename, sheetname);
			String appUrl = ExcelConnectionClass.ExcelRows(1, 0);
			System.out.println(appUrl);

			// Application open
			System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(appUrl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		}
		
		public static void AmazonFunctionality(String filename,String sheetname) throws IOException {
			
			ExcelConnectionClass.ExcelConnection(filename, sheetname);
			int rowcount = ExcelConnectionClass.wsheet.getLastRowNum();
			for(int i = 1; i <= rowcount; i++) {
				String proName = ExcelConnectionClass.ExcelRows(i, 1);
				String proValue = ExcelConnectionClass.ExcelRows(i, 2);
				String Action = ExcelConnectionClass.ExcelRows(i, 3);
				//String Inputdata = ExcelConnectionClass.ExcelRows(i, 4);
				System.out.println(Action);

				switch (Action) {
				case "click":
					WebElement ele = driver.findElement(LocatorsClass.Locators(proName, proValue));
					ele.click();

					break;

				case "mouseover":
					WebElement ele1 = driver.findElement(LocatorsClass.Locators(proName, proValue));
					Actions Aobj = new Actions(driver);
					Aobj.moveToElement(ele1).build().perform();

					break;

				case "getSize":
					List<WebElement> el2 = driver.findElements(LocatorsClass.Locators(proName, proValue));
					int num = el2.size();
					System.out.println("Number :"+num);
					break;

				case "getAttribute":
					List<WebElement> el3 = driver.findElements(LocatorsClass.Locators(proName, proValue));

					String attribute;

					for (WebElement T : el3) {
						attribute = T.getAttribute("alt");
						System.out.println(attribute);

					}

					break;

				default:

					break;
				}
			
		}
			
		
	}
		
}

