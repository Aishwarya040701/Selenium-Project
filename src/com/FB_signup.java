package com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_signup {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    
	    
	    //How to maximize browser
	    driver.manage().window().maximize();
	   
	    
	    //How to open valid url

	    driver.get("https://www.facebook.com/signup");
	   
	    
	    //using Locators
	
	   WebElement ele2 = driver.findElement(By.name("firstname"));
	   ele2.sendKeys("Aishu");
	
	    driver.findElement(By.name("lastname")).sendKeys("Rai");
	    driver.findElement(By.name("reg_email__")).sendKeys("aishu@gmail.com");
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("aishu@gmail.com");
	    
	    driver.findElement(By.name("reg_passwd__")).sendKeys("aishu@1234");
	    new Select(driver.findElement(By.id("day"))).selectByIndex(7);
	    new Select(driver.findElement(By.id("month"))).selectByValue("7");
	    new Select(driver.findElement(By.id("year"))).selectByVisibleText("2001");
	    driver.findElement(By.className("_58mt")).click();
//	    driver.findElement(By.linkText("Female")).click();
	    
	    Thread.sleep(5000);
		driver.findElement(By.linkText("Already have an account?")).click();
	    
	    driver.findElement(By.id("email")).sendKeys("aishu@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("aishu@12345");
	    driver.findElement(By.id("loginbutton")).click();

	   // driver.close();

	}

}
