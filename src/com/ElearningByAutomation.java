package com;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElearningByAutomation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://elearningm1.upskills.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		//Parent to nth child----->div#top_main_content>ul>li:nth-child(1)>a
		
		driver.findElement(By.cssSelector("div.panel-body>ul>li:nth-child(1)>a")).click();
		
		
		Thread.sleep(3000);
		
		//using only class name(.)
		driver.findElement(By.cssSelector("input.form-control")).sendKeys("Aishwarya");
		//driver.findElement(By.cssSelector("input[class='form-control']")).sendKeys("Aishwarya");
		
		
		//Parent to child------>div.col-sm-8>input[name='lastname']
		driver.findElement(By.cssSelector("div.col-sm-8>input[name='lastname']")).sendKeys("Rai");
		
		
		//using class name and id
		driver.findElement(By.cssSelector("input[class='form-control'][name='email']")).sendKeys("Aishu@gmail.com");
		driver.findElement(By.cssSelector("input[class='form-control'][name='official_code']")).sendKeys("040701");
		
		
		//using  id(#) & class name(.)
		WebElement user=driver.findElement(By.cssSelector("input#username.form-control"));
		user.sendKeys("Aishu_040701");
		String a=user.getCssValue("font-size");
		String color=user.getCssValue("border-radius");
		System.out.println(a);
		System.out.println(color);
		
		
		//using only id(#)
		driver.findElement(By.cssSelector("input#pass1")).sendKeys("Aishu@12345");
		driver.findElement(By.cssSelector("input#pass2")).sendKeys("Aishu@12345");
		
		//If Starting Char change at runtime(^)
		driver.findElement(By.cssSelector("input[name^='phone']")).sendKeys("1234567890");
		
	
		driver.findElement(By.cssSelector("div.btn-group>button")).click();
		Thread.sleep(1000);

		driver.findElement(By.linkText("Italiano")).click();
		driver.findElement(By.cssSelector("input[name='status'][value='1']")).click();
		
     	driver.findElement(By.xpath("//div[@class='btn-group bootstrap-select show-tick form-control open']//input[@type='text']")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-id='extra_mail_notify_invitation']")).click();
		//button[@data-id='extra_mail_notify_invitation']//div[@class='btn-group bootstrap-select show-tick form-control open']//input[@type='text']
		
		//button[@data-id='extra_mail_notify_invitation'][@title='Once a day']
//		
//		//Thread.sleep(2000);
//
//		
//		//driver.findElement(By.linkText("Teacher (creates courses)")).click();
//		
//		 
//		
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();

	}

}
