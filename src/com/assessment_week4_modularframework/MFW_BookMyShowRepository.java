package com.assessment_week4_modularframework;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MFW_BookMyShowRepository {
	public static WebDriver driver;
	
	public static void openApplication() {
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		driver=new ChromeDriver();
		String appurl=MFW_BookMYShowInputDataClass.Appurl;
		System.out.println(appurl);
		driver.get(appurl);
		driver.manage().window().maximize();
	}

	public static void BookMyShowfunctions() {

	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	WebElement state=driver.findElement(MFR_BookMyShowLocators.state);
	js.executeScript("arguments[0].style.border='4px solid blue'",state);
	state.click();
	
	
	WebElement movies=driver.findElement(MFR_BookMyShowLocators.movies);
	js.executeScript("arguments[0].style.border='4px solid blue'",movies);
	movies.click();
	
	
	WebElement m1=driver.findElement(MFR_BookMyShowLocators.movieName);
	js.executeScript("arguments[0].style.border='4px solid blue'",m1);
	m1.click();
	
	
	WebElement m2=driver.findElement(MFR_BookMyShowLocators.bookTicket);
	js.executeScript("arguments[0].style.border='4px solid blue'",m2);
	m2.click();
	
	
	WebElement m3=driver.findElement(MFR_BookMyShowLocators.movieType);
	js.executeScript("arguments[0].style.border='4px solid blue'",m3);
	m3.click();
	
	
	WebElement m4=driver.findElement(MFR_BookMyShowLocators.popup);
	js.executeScript("arguments[0].style.border='4px solid blue'",m4);
	m4.click();
	
	
	WebElement m5=driver.findElement(MFR_BookMyShowLocators.time);
	js.executeScript("arguments[0].style.border='4px solid blue'",m5);
	m5.click();
	
	
	WebElement m6=driver.findElement(MFR_BookMyShowLocators.Accept);
	js.executeScript("arguments[0].style.border='4px solid blue'",m6);
	m6.click();
	
	
	WebElement m7=driver.findElement(MFR_BookMyShowLocators.Seaters);
	js.executeScript("arguments[0].style.border='4px solid blue'",m7);
	m7.click();
	
	
	WebElement m8=driver.findElement(MFR_BookMyShowLocators.proceed);
	js.executeScript("arguments[0].style.border='4px solid blue'",m8);
	m8.click();
	
	
	WebElement m9=driver.findElement(MFR_BookMyShowLocators.seat1);
	js.executeScript("arguments[0].style.border='4px solid blue'",m9);
	m9.click();
	
	
	WebElement m10=driver.findElement(MFR_BookMyShowLocators.seat2);
	js.executeScript("arguments[0].style.border='4px solid blue'",m10);
	m10.click();
	
	
	WebElement m11=driver.findElement(MFR_BookMyShowLocators.procced2);
	js.executeScript("arguments[0].style.border='4px solid blue'",m11);
	m11.click();
	
	
	WebElement m12=driver.findElement(MFR_BookMyShowLocators.payment);
	js.executeScript("arguments[0].style.border='4px solid blue'",m12);
	m12.click();
	
	
	WebElement m13=driver.findElement(MFR_BookMyShowLocators.email);;
	js.executeScript("arguments[0].style.border='4px solid blue'",m13);
	m13.sendKeys(MFW_BookMYShowInputDataClass.email);
	
	}

	public static void alert() {
		driver.switchTo().alert().accept();
	}

	public static void captureScreenShot(String image) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screenshot" + image + ".png"));
	}

	public static void ImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

}
