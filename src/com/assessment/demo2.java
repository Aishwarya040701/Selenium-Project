package com.assessment;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		
		
		WebElement state=driver.findElement(By.xpath("//img[@alt='BANG']"));
		state.click();
		
		WebElement movies=driver.findElement(By.linkText("Movies"));
		movies.click();
			
		WebElement m1=driver.findElement(By.xpath("//img[@alt='Brahmastra']"));
		m1.click();
		
		WebElement m2=driver.findElement(By.xpath("//div[@class='sc-1vmod7e-2 iBonLL']//span[contains(text(),'Book tickets')]"));
		m2.click();
		
		WebElement m3=driver.findElement(By.xpath("(//section[@class='sc-vhz3gb-2 ceXPQZ']//div[@class='sc-vhz3gb-3 dRokFO']//span[contains(text(),'2D')])[2]"));
		m3.click();
		
		WebElement m4=driver.findElement(By.cssSelector("button#wzrk-cancel"));
		m4.click();
		
		WebElement m5=driver.findElement(By.xpath("//div[@class='showtime-pill-container']//a[@data-date-time='07:30 PM']"));
		m5.click();

		WebElement m6=driver.findElement(By.cssSelector("div#btnPopupAccept"));
		m6.click();
		
		WebElement m7=driver.findElement(By.cssSelector("li#pop_4"));
		m7.click();
		
		WebElement m8=driver.findElement(By.cssSelector("div#proceed-Qty"));
		m8.click();
		
		WebElement m9=driver.findElement(By.cssSelector("div[id='A_8_03']"));
		m9.click();
				
		WebElement m10=driver.findElement(By.cssSelector("div[id='A_8_04']"));
		m10.click();
      
		WebElement m11=driver.findElement(By.cssSelector("a[id='btmcntbook']"));
		m11.click();
		
		WebElement m12=driver.findElement(By.cssSelector("div#prePay"));
		m12.click();
		
		WebElement m13=driver.findElement(By.cssSelector("input#txtEmail"));
		m13.sendKeys("Aishu21234");
        
        
        
		
		

	}

}
