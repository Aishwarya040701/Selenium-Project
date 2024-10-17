package com.pageObjectModel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PageObjectRepositoryClass {
	
	public static WebElement Fb_Fname(WebDriver driver) {
		return driver.findElement(Locators.Fb_Fname_name);
		
	}

	public static WebElement Fb_Lname(WebDriver driver) {
		return driver.findElement(Locators.Fb_Lname_name);
		
	}
	
	public static WebElement Fb_Mob(WebDriver driver) {
		return driver.findElement(Locators.Fb_Mob_name);
		
	}
	
	public static WebElement Fb_Pass(WebDriver driver) {
		return driver.findElement(Locators.Fb_Pass_id);
		
	}
	
	public static Select Fb_Day(WebDriver driver) {
		return new Select(driver.findElement(Locators.Fb_Day_id));
		
	}
	
	public static Select Fb_Mon(WebDriver driver) {
		return new Select(driver.findElement(Locators.Fb_Mon_id));
		
	}
	public static Select Fb_Year(WebDriver driver) {
		return new Select(driver.findElement(Locators.Fb_Year_id));
		
	}
	public static WebElement Fb_Gender(WebDriver driver) {
		return driver.findElement(Locators.Fb_Gender_css);
		
	}
	public static void alert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	
	public static void captureScreenShot(WebDriver driver,String image) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screen1"+image+".png"));
	}
	
	
	public static void ImplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	
		
}
	

