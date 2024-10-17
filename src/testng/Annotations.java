package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Annotations {
	WebDriver driver;
	@Test(priority = 1)

	public void f1() {
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		

		
	}
	@Test(priority = 2)
	public void f2() {

		driver.findElement(By.name("email")).sendKeys("Aishu@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Aishu@123");
		
		
		
	}
	@Test(priority = 3)
	public void f3() {
	
		driver.close();
		
	}

}
