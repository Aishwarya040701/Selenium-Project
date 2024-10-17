package com.assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class filpcart {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(700));
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		WebElement element1= driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
		Actions aobj=new Actions(driver);
		aobj.moveToElement(element1).build().perform();
		driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
		
	}

}
