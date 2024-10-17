package com.modularframework;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ModularRepositoryClass {
	
	public static WebDriver driver;
	
	public static void applicationOpen() {
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(InputDtaClass.Appurl);
		driver.manage().window().maximize();
	
	}
	
	
	public static void FBCreation() {
		//driver.findElement(Locators.Fb_creation_xpath).click();
		driver.findElement(Locators.Fb_Fname_name).sendKeys(InputDtaClass.FB_Fname);
		driver.findElement(Locators.Fb_Lname_name).sendKeys(InputDtaClass.FB_Lname);
		driver.findElement(Locators.Fb_Mob_name).sendKeys(InputDtaClass.FB_Mob);
		driver.findElement(Locators.Fb_Pass_id).sendKeys(InputDtaClass.FB_Pass);
		new Select((WebElement) driver.findElement(Locators.Fb_Day_id)).selectByVisibleText(InputDtaClass.FB_Day);
		new Select((WebElement) driver.findElement(Locators.Fb_Mon_id)).selectByVisibleText(InputDtaClass.FB_Mon);
		new Select((WebElement) driver.findElement(Locators.Fb_Year_id)).selectByVisibleText(InputDtaClass.FB_Year);
		driver.findElement(Locators.Fb_Gender_css).click();

	}
	
	
	public static void alert() {
		driver.switchTo().alert().accept();
	}
	
	
	public static void captureScreenShot(String image) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screen1"+image+".png"));
	}
	
	
	public static void ImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	


}
