package com.assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pay {
	public static void main(String[] args) throws InterruptedException, Exception{
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/Pay/PaymentDetails");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7000));
		
		
		driver.findElement(By.xpath("//div[@class='expand-icon']")).click();
		driver.findElement(By.id("offerCode")).sendKeys("2345aa");
		driver.findElement(By.xpath("//div[contains(text(),'APPLY')]")).click();
		driver.findElement(By.xpath("Offer is either invalid or expired.")).getText();
		
	}
	

}
