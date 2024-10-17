package com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Automationpractice {

	public static void main(String[] args) {
		//Opening chrome browser
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//maximizing chrome browser
		driver.manage().window().maximize();
		
		//using implicitlyWait command for avoiding time delay 
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(40000));
		
        // using valid url
		driver.get("http://automationpractice.com/index.php/");
		
		//finding web element by cssSelector locator--->parent to nth-child and storing in WebElement Variable
		WebElement elc1 = driver.findElement(By.cssSelector("div#block_top_menu>ul>li:nth-child(2)>a"));
		
		//creating a obj1 and performing mouse operation
		Actions obj1 = new Actions(driver);
		obj1.moveToElement(elc1).build().perform();
		driver.findElement(By.xpath("//li[@class='sfHover']//a[contains(text(),'Casual Dresses')]")).click();
		
		//finding web element by xpath locator and storing in WebElement Variable
		WebElement elc2 = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		
		//creating a obj2 and performing mouse operation
		Actions obj2 = new Actions(driver);
		obj2.moveToElement(elc2).build().perform();
		
		//finding web element by cssSelector locator
		driver.findElement(By.cssSelector("a[title='Add to cart']")).click();
		// driver.findElement(By.xpath("//span[normalize-space()='Add to cart']")).click();
		
		
		//finding web element by cssSelector locator
		driver.findElement(By.cssSelector("a[title='Proceed to checkout']")).click();

		//finding web element by xpath locator
		driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")).click();

		////finding web element by id locator
		driver.findElement(By.id("email_create")).sendKeys("HM040701Aishu12345Ra@gmail.com");
		
		//finding web element by name locator
		driver.findElement(By.name("SubmitCreate")).click();
		
		//finding web element by cssSelector locator--->Double property--->radio button
		driver.findElement(By.cssSelector("input[name='id_gender'][value='2']")).click();
		
		//finding web element by cssSelector locator--->only by id
		driver.findElement(By.cssSelector("input#customer_firstname")).sendKeys("AishuR");
        driver.findElement(By.cssSelector("input#customer_lastname")).sendKeys("HMLR");
		driver.findElement(By.cssSelector("input#passwd")).sendKeys("aishu12345R");
		
        ////finding web element by cssSelector locator--->DropDown 
		new Select(driver.findElement(By.cssSelector("select#days"))).selectByValue("4");
		new Select(driver.findElement(By.cssSelector("select#months"))).selectByVisibleText("July ");
		new Select(driver.findElement(By.cssSelector("select#years"))).selectByValue("2001");

		//finding web element by cssSelector locator--->only by id
		driver.findElement(By.cssSelector("input#address1")).sendKeys("Kuvempunagar");
		driver.findElement(By.cssSelector("input#city")).sendKeys("Hassan");
		driver.findElement(By.cssSelector("input#address1")).sendKeys("Hassan");
		

		//finding web element by cssSelector locator--->DropDown
		new Select(driver.findElement(By.cssSelector("select[name='id_state']"))).selectByVisibleText("Kentucky");
		
		//finding web element by cssSelector locator--->only by id
		driver.findElement(By.cssSelector("input#postcode")).sendKeys("57320");
		
		//finding web element by cssSelector locator--->DropDown
		new Select(driver.findElement(By.cssSelector("div.selector>select[name='id_country']"))).selectByVisibleText("United States");
		
		//finding web element by id locator
		driver.findElement(By.id("phone_mobile")).sendKeys("8912343779");
		driver.findElement(By.id("submitAccount")).click();
		
		//finding web element by xpath locator
		driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'I agree to the terms of service and will adhere to them unconditionally.')]")).click();
		driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")).click();

		
	}

}
