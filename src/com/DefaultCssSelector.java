package com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    
	    
	    //How to maximize browser
	    driver.manage().window().maximize();
	   
	    
	    //How to open valid url

	    driver.get("https://www.facebook.com/signup");
	   
	    
	    //using cssSelector Locators single property
	    driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Aishu");
	    
	  //using cssSelector Locators double property
	    driver.findElement(By.cssSelector("input[name='lastname'][aria-label='Surname']")).sendKeys("Rai");
	    
	    
	    
	    
	    

	}

}
