package com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    
	    
	    //How to maximize browser
	    driver.manage().window().maximize();
	   
	    
	    //How to open valid url

	    driver.get("https://www.amazon.com");
	   
	    
	    //using Locators
//	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Chocolates");
	    driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
