package com.assessment_week4_modularframework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MFW_BookMyShowtTestable {
	public static WebDriver driver;
	
	@Test
    public void test1() throws IOException{
		MFW_BookMyShowRepository.openApplication();
		MFW_BookMyShowRepository.ImplicitWait();
		MFW_BookMyShowRepository.captureScreenShot("BookMyShowHomePage_MFW");
		
	}
	
	
	
	@Test
	public void test2() throws IOException{
		MFW_BookMyShowRepository.BookMyShowfunctions();
		MFW_BookMyShowRepository.ImplicitWait();
		MFW_BookMyShowRepository.captureScreenShot("BookMyShowFinalStage_MFW");
		
	}
	

}
