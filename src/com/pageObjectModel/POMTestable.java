package com.pageObjectModel;

import java.time.Duration;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class POMTestable {
	public static WebDriver driver;
	@BeforeClass
	public static void Application_open() {
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(InputDtaClass.Appurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));	
	}
	
	@Test
	public void FB_Creation() {
		PageObjectRepositoryClass.Fb_Fname(driver).sendKeys(InputDtaClass.FB_Fname);
		PageObjectRepositoryClass.Fb_Lname(driver).sendKeys(InputDtaClass.FB_Lname);
		PageObjectRepositoryClass.Fb_Mob(driver).sendKeys(InputDtaClass.FB_Mob);
		PageObjectRepositoryClass.Fb_Pass(driver).sendKeys(InputDtaClass.FB_Pass);
		PageObjectRepositoryClass.Fb_Day(driver).selectByVisibleText(InputDtaClass.FB_Day);
		PageObjectRepositoryClass.Fb_Mon(driver).selectByVisibleText(InputDtaClass.FB_Mon);
		PageObjectRepositoryClass.Fb_Year(driver).selectByVisibleText(InputDtaClass.FB_Year);
		PageObjectRepositoryClass.Fb_Gender(driver).click();
		
	}
	

}
