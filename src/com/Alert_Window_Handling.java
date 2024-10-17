package com;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Alert_Window_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//maximizing chrome browser
		driver.manage().window().maximize();
		
		//using implicitlyWait command for avoiding time delay 
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(40000));
		
        // using valid url
		driver.get("http://omayo.blogspot.com/");
		
	     WebElement seleniumWindow = driver.findElement(By.cssSelector("a#selenium143"));
	     seleniumWindow.click();
	     
	     
	    
	    WebElement bloggerWindow=driver.findElement(By.xpath("//div[@class='widget-content']//a[contains(text(),'Blogger')]"));
	    bloggerWindow.click();
	    
	       Set<String> window = driver.getWindowHandles();
	       Iterator<String> itr=window.iterator();
	      
	       String sewin = null,blowin = null,mainwin = null;
	       while(itr.hasNext()) {
	    	   String windowid = itr.next();
	    	   driver.switchTo().window(windowid);
	    	   if(driver.getCurrentUrl().equals("http://selenium143.blogspot.com/")) {
	    		   System.out.println("Selenium window"+windowid);
	    		    sewin = windowid;
	    		   System.out.println(driver.findElement(By.xpath("//a[contains(text(),'What is Selenium?')]")).isDisplayed()); 
	    		   Thread.sleep(2000);
	    	   }
	    	   else if(driver.getCurrentUrl().equals("https://www.blogger.com/about/?bpli=1")) {
	    		   System.out.println("Selenium window "+windowid);
	    		   blowin = windowid;
	    		   driver.findElement(By.xpath("//*[contains(text(),'Sign in')]")).click();
	    		   Thread.sleep(2000);
	    		   
	    	   }
	    	   else if(driver.getCurrentUrl().equals("http://omayo.blogspot.com/")) {
	    		   System.out.println("Selenium window "+windowid);
	    		   mainwin = windowid;
	    		   Thread.sleep(2000);
	    	
	    	  
	    	    
	       }
	    
	       } 
	       driver.switchTo().window(sewin);
	       Thread.sleep(2000);
	       driver.close();
	       driver.switchTo().window(blowin);
	       Thread.sleep(2000);
	       driver.close();
	       driver.switchTo().window(mainwin);
	       
	       driver.findElement(By.id("alert1")).click();
	       Thread.sleep(2000);
	       String alert1 = driver.switchTo().alert().getText();
	       System.out.println(alert1);
	       driver.switchTo().alert().accept();
	       Thread.sleep(2000);
	       
	       driver.findElement(By.id("prompt")).click();
	       Thread.sleep(2000);
	       driver.switchTo().alert().sendKeys("Hello234");
	       Thread.sleep(2000);
	      // driver.switchTo().alert().accept();
	       
	
	       
	         

	}

}
