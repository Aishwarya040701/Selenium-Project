package com.assessment;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepageredbus {
	public static void main(String[] args) throws FindFailed, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		Screen obj = new Screen();
		Pattern BUSTICKETSMAIN = new Pattern(
				"C:\\selenium_workspace\\SikuliScreenShots\\RedBus Screenshot\\BUS TICKET MAIN.sikuli\\1666513733564.png");
		Pattern BUSTICKETS = new Pattern(
				"C:\\selenium_workspace\\SikuliScreenShots\\RedBus Screenshot\\BUS TICKETS HOME.sikuli\\1666511866450.png");
		Pattern Home = new Pattern(
				"C:\\selenium_workspace\\SikuliScreenShots\\RedBus Screenshot\\home new.sikuli\\1666799701819.png");
		Pattern ryde = new Pattern(
				"C:\\selenium_workspace\\SikuliScreenShots\\RedBus Screenshot\\rydenew.sikuli\\1666799605063.png");
		Pattern redRail = new Pattern(
				"C:\\selenium_workspace\\SikuliScreenShots\\RedBus Screenshot\\redrailnew.sikuli\\1666799626849.png");
		Pattern Help = new Pattern(
				"C:\\selenium_workspace\\SikuliScreenShots\\RedBus Screenshot\\help new.sikuli\\1666840972482.png");
		Pattern cancelTicket = new Pattern(
				"C:\\selenium_workspace\\SikuliScreenShots\\RedBus Screenshot\\cancel ticket new.sikuli\\1666799675533.png");
		Pattern printsmsticket = new Pattern(
				"C:\\selenium_workspace\\SikuliScreenShots\\RedBus Screenshot\\print sms ticketnew.sikuli\\1666799643826.png");
		Pattern profile = new Pattern(
				"C:\\selenium_workspace\\SikuliScreenShots\\RedBus Screenshot\\profile new.sikuli\\1666841041524.png");
		Pattern popupclose = new Pattern(
				"C:\\selenium_workspace\\SikuliScreenShots\\RedBus Screenshot\\popup block.sikuli\\1666842141372.png");
		
		obj.wait(BUSTICKETSMAIN, 60);
		obj.click();

		Thread.sleep(1000);

		obj.wait(ryde, 60);
		obj.click();
		Thread.sleep(1000);

		driver.navigate().back();

		obj.wait(redRail, 30);
		obj.click();
		Thread.sleep(1000);

		driver.navigate().back();

		obj.wait(Help, 30);
		obj.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[@class='modalCloseSmall'][@title='close']")).click();
		obj.wait(BUSTICKETSMAIN, 30);
		obj.click();
		Thread.sleep(1000);

		obj.wait(printsmsticket, 30);
		obj.click();
		Thread.sleep(2000);

		driver.navigate().back();

		obj.wait(cancelTicket, 30);
		obj.click();
		Thread.sleep(2000);

		driver.navigate().back();

		obj.wait(profile, 30);
		obj.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//span[contains(text(),'Sign In/Sign Up')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='icon icon-cross']")).click();

		obj.wait(Home, 30);
		obj.click();
		Thread.sleep(1000);
		
		obj.wait(popupclose, 30);
		obj.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("manga");
		driver.findElement(By.xpath("(//li[contains(text(),'Mangaluru')])[1]")).click();
		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("banga");
		driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Date')]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'26')]")).click();

		obj.wait(BUSTICKETSMAIN, 30);
		obj.click();

		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[contains(text(),'Bus Hire')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Tempo Traveller')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Train Tickets')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Cab Booking')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'About Us')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Contact us')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Mobile Version')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Agent Registration')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Careers')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Track My Bus')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Cancellation')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Print E Ticket')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'FAQ')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Sitemap')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Offers')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Blog')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Terms & Conditions')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Cookie Policy')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'India')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Indonesia')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Singapore')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Malaysia')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Colombia')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

		driver.findElement(By.xpath("//a[contains(text(),'Peru')]")).click();
		Thread.sleep(1000);
		driver.navigate().back();

	}

}
