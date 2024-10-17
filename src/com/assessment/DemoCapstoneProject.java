package com.assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class DemoCapstoneProject {
	public static void main(String[] args) throws InterruptedException, Exception{
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7000));
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("manga");
		driver.findElement(By.xpath("(//li[contains(text(),'Mangaluru')])[1]")).click();
		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("banga");
		driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Date')]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'8')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Search Buses')]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//i[@class='icon icon-close']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@for='dt12 pm to 6 pm'])[1]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//label[@for='bt_Single Seats'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'RESET')]")).click();
		Thread.sleep(4000);
	
		WebElement element1= driver.findElement(By.xpath("//li[@title='Water Bottle']"));
		WebElement element2= driver.findElement(By.xpath("//li[@title='Charging Point']"));
		WebElement element3= driver.findElement(By.xpath("//li[@title='Reading Light']"));
		WebElement element4= driver.findElement(By.xpath("//li[@title='CCTV']"));
		Actions aobj=new Actions(driver);
		aobj.moveToElement(element1).build().perform();
		Thread.sleep(1000);
		aobj.moveToElement(element2).build().perform();
		Thread.sleep(1000);
		aobj.moveToElement(element3).build().perform();
		Thread.sleep(1000);
		aobj.moveToElement(element4).build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'Amenities')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'Bus Photos')])[1]")).click();
		Thread.sleep(1000);
		WebElement ee=driver.findElement(By.xpath("//button[@data-role='none'][@class='slick-arrow slick-prev']"));
		Thread.sleep(1000);
		ee.click();
		Thread.sleep(1000);
		ee.click();
		Thread.sleep(1000);
		ee.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[contains(text(),'Boarding & Dropping Points')])[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'Reviews')])[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'Booking policies')])[1]")).click();
		Thread.sleep(2000);
		
		
	
//		Screen obj=new Screen();
//		Pattern img4=new Pattern("C:\\selenium_workspace\\SikuliScreenShots\\RedBus Screenshot\\photoscro.sikuli\\1666544816800.png");
//		obj.wait(img4,30);
//		obj.click(img4);
//		Thread.sleep(1000);
		
		
		
		
		
		
		
		
		driver.findElement(By.xpath("(//div[contains(text(),'View Seats')])[1]")).click();
		
		driver.findElement(By.cssSelector("li[data-price='1100']")).click();
		
		
	//driver.findElement(By.cssSelector("canvas[Seat No='A7']")).click();
		Screen obj=new Screen();
		Pattern img1=new Pattern("C:\\selenium_workspace\\SikuliScreenShots\\ss12.sikuli\\1666500629366.png");
		obj.wait(img1,30);
		obj.click(img1);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("span[title='Pvs Circle']")).click();
		driver.findElement(By.cssSelector("span[title='Nelamangala Circle']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed to book')]")).click();
		driver.findElement(By.name("Name_0")).sendKeys("Aishwarya");
		driver.findElement(By.cssSelector("div#div_22_0")).click();
		driver.findElement(By.name("Age_0")).sendKeys("21");
		driver.findElement(By.cssSelector("input[placeholder='Email ID']")).sendKeys("aishwaryaraihm@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone']")).sendKeys("6362296022");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'No, I would like to proceed without insurance')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Proceed to pay']")).click();
		driver.findElement(By.xpath("//div[@class='expand-icon']")).click();
		driver.findElement(By.id("offerCode")).sendKeys("2345aa");
		driver.findElement(By.xpath("//div[contains(text(),'APPLY')]")).click();
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Offer is either invalid or expired.')]")).getText());
		Pattern img2=new Pattern("C:\\selenium_workspace\\SikuliScreenShots\\phonepayicon.sikuli\\1666498471249.png");
		obj.wait(img2,30);
		obj.click(img2);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter UPI ID']")).sendKeys("aishu");
		driver.findElement(By.xpath("//div[contains(text(),'VERIFY')]")).click();
		WebElement e1=driver.findElement(By.xpath("//div[contains(text(),'Invalid UPI ID')]"));
		e1.click();
		System.out.println(e1.getText());
		
		

		
//		Thread.sleep(3000);
//		driver.close();
		
		
		
	}

}
