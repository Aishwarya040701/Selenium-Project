package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonSignin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","Browsers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("http://automationpractice.com/index.php/");
		driver.manage().window().maximize();
		
		

		
		
		
		WebElement elc=driver.findElement(By.cssSelector("div#block_top_menu>ul>li:nth-child(2)>a"));
	//	driver.findElement(By.cssSelector("div#block_top_menu>ul>li:nth-child(2)>a")).click();

	//	driver.findElement(By.cssSelector("a[title='Evening Dresses']")).click();
//		Actions obj=new Actions(driver);
//		obj.moveToElement(elc).build().perform();
		driver.findElement(By.xpath("//li[@class='sfHover']//a[@title='Casual Dresses'][normalize-space()='Casual Dresses']")).click();
		//driver.findElement(By.cssSelector("a[title='Browse our different dresses to choose the perfect dress for an unforgettable evening!']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//*[@class='a-button-input']")).click();
//		driver.findElement(By.xpath("//*[@data-csa-c-content-id='nav_cs_gb']")).click();
//		Thread.sleep(4000);
//		driver.findElement(By.linkText("Women's Shoes")).click();
//		
//		
		
//		driver.findElement(By.cssSelector("a[data-csa-c-slot-id='nav_cs_0']")).click();
		//driver.findElement(By.linkText("Today's Deals")).click();
		
	//	driver.findElement(By.id("span[aria-label='Departments filter']>ul>li:nth-child(1)")).click();
		
		
//		//div#hmenu-content>ul>li:nth-child(29)>a
//		driver.findElement(By.id("nav-hamburger-menu")).click();
//		driver.findElement(By.linkText("Sign in")).click();
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.id("createAccountSubmit")).click();
//		
//		WebElement FName=driver.findElement(By.name("customerName"));
//		String FistName="Aishu";
//		FName.clear();
//		FName.sendKeys(FistName);
//		
//	
//		
//		
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		
//		
//		
//		
//	
		

	}

}
