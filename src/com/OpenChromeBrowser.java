package com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) throws InterruptedException  {
		
		//How to open chrome browser at runtime
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    
	    
	    //How to maximize browser
	    driver.manage().window().maximize();
	   
	    
	    //How to open valid url

	    driver.get("https://www.facebook.com");
	   
	    
	    //using Locators
//	    
	    driver.findElement(By.id("email")).sendKeys("aishu@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("aishu@1234");
	    //driver.close();
	    

	}

}
