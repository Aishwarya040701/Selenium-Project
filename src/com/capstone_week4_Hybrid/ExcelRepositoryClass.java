package com.capstone_week4_Hybrid;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.python.modules.thread.thread;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class ExcelRepositoryClass {
	public static WebDriver driver;

	public static void AppOpen(String filename, String sheetname, String extentname) throws IOException {
		ExtentReports logger0 = new ExtentReports();
		logger0.init("ExtentReports//" + extentname, true);
		logger0.startTest("RedBus application open ");
		ExcelConnectionClass.ExcelConnection(filename, sheetname);
		String appUrl = ExcelConnectionClass.ExcelRows(1, 0);
		System.out.println(appUrl);
		logger0.log(LogStatus.INFO, "Collecting Data From Excel");

		// Application open
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	}

	public static void RedBusFunctionality(String filename, String sheetname, String extentname)
			throws IOException, InterruptedException, FindFailed {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));

		ExtentReports logger = new ExtentReports();
		logger.init("ExtentReports//" + extentname, true);
		logger.startTest("RedBus Functionalities");
		ExcelConnectionClass.ExcelConnection(filename, sheetname);
		int rowcount = ExcelConnectionClass.wsheet.getLastRowNum();
		System.out.println(rowcount);

		for (int i = 1; i <= rowcount; i++) {
			String proName = ExcelConnectionClass.ExcelRows(i, 1);
			String proValue = ExcelConnectionClass.ExcelRows(i, 2);
			String Action = ExcelConnectionClass.ExcelRows(i, 3);
			String Inputdata = ExcelConnectionClass.ExcelRows(i, 4);
			System.out.println("Action performed "+Action);
			logger.log(LogStatus.INFO, "Collecting Data From Excel");
			Thread.sleep(1000);

			switch (Action) {
			case "click":

				WebElement ele = driver.findElement(LocatorsClass.Locators(proName, proValue));
				System.out.println("Element : "+ele.getText());
				ele.click();
				Thread.sleep(2000);
				logger.log(LogStatus.INFO, "Click operation");
				break;

			case "SikuliClick":
				Screen obj = new Screen();
				Pattern image = new Pattern(Inputdata);
				obj.wait(image, 60);
				obj.click();
				logger.log(LogStatus.INFO, "Sikuli Click operation");
				Thread.sleep(1000);

				break;

			case "BackNavigation":
				driver.navigate().back();

				break;

			case "close":
				driver.close();
				break;

			case "sendkeys":
				WebElement ele2 = driver.findElement(LocatorsClass.Locators(proName, proValue));

				ele2.sendKeys(Inputdata);
				logger.log(LogStatus.INFO, "SendKeys operation");

				break;

			case "clickwithsleep":
				Thread.sleep(7000);
				WebElement ele3 = driver.findElement(LocatorsClass.Locators(proName, proValue));

				ele3.click();
				logger.log(LogStatus.INFO, "click operation");

				break;

			case "getText":
				
				WebElement ele4 = driver.findElement(LocatorsClass.Locators(proName, proValue));

				ele4.click();
				System.out.println("Error message "+ele4.getText());
				logger.log(LogStatus.INFO, "click operation");

				break;

			case "photoclick":

				WebElement ele5 = driver.findElement(LocatorsClass.Locators(proName, proValue));

				ele5.click();
				Thread.sleep(2000);
				ele5.click();
				Thread.sleep(2000);
				ele5.click();
				Thread.sleep(2000);
				ele5.click();
				Thread.sleep(2000);
				logger.log(LogStatus.INFO, "click operation");

				break;

			case "mouseover":
				Thread.sleep(2000);
				WebElement ele6 = driver.findElement(LocatorsClass.Locators(proName, proValue));

				Actions aobj = new Actions(driver);
				aobj.moveToElement(ele6).build().perform();

				logger.log(LogStatus.INFO, "click operation");

				break;

			case "clickThreadsleep":

				WebElement ele7 = driver.findElement(LocatorsClass.Locators(proName, proValue));

				ele7.click();
				Thread.sleep(4000);

				logger.log(LogStatus.INFO, "Click operation");
				break;

			case "screenshot":

				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("screenshot//"+Inputdata+".png"));

				logger.log(LogStatus.INFO, "capture screenshot operation");
				break;

			default:

				break;
			}

		}

	}

}
