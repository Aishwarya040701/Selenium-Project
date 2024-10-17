package com;

import org.openqa.selenium.By;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "Browsers//geckodriver.exe");
	    FirefoxDriver driver=new FirefoxDriver();
	    
	    //How to maximize browser
	    driver.manage().window().maximize();
	    
	    //How to open valid url
	    driver.get("https://www.facebook.com");
	    
	    //using Locators
	    
	    driver.findElement(By.id("email")).sendKeys("aishu@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("aishu@1234");

	}

}
