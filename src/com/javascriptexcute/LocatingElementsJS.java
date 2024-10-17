package com.javascriptexcute;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.lowagie.text.Document;

public class LocatingElementsJS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value='tester@123';");
		
		

	}

}
