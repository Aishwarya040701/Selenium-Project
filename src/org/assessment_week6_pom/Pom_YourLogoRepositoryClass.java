package org.assessment_week6_pom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pom_YourLogoRepositoryClass {
	
	public static WebElement Clickele1(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element1);
		
	}
	
	public static WebElement Clickele2(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element2);
		
	}
	
	public static WebElement Clickele3(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element3);
		
	}
	
	public static WebElement Clickele4(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element4);
		
	}
	
	public static WebElement Clickele5(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element5);
		
	}
	
	public static WebElement Clickele6(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element6);
		
	}
	
	public static WebElement Clickele7(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element7);
		
	}
	
	public static WebElement Clickele8(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element8);
		
	}
	
	public static WebElement Clickele9(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element9);
		
	}
	

	public static WebElement Clickele10(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element10);
		
	}
	
	public static WebElement Clickele11(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element11);
		
	}
	
	public static WebElement Clickele12(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element12);
		
	}
	
	public static WebElement Clickele13(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element13);
		
	}
	
	public static WebElement Clickele14(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element14);
		
	}
	
	public static WebElement Clickele15(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element15);
		
	}
	
	public static WebElement Clickele16(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element16);
		
	}
	
	public static WebElement Clickele17(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element17);
		
	}
	
	public static WebElement Clickele18(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element18);
		
	}
	
	public static WebElement Clickele19(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element19);
		
	}
	
	public static WebElement Clickele20(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element20);
		
	}
	
	public static WebElement Clickele21(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element21);
		
	}
	
	public static WebElement Clickele22(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element22);
		
	}
	
	public static WebElement Clickele23(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element23);
		
	}
	
	public static WebElement Clickele24(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element24);
		
	}
	
	public static WebElement Clickele25(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element25);
		
	}
	
	public static WebElement Clickele26(WebDriver driver) {
		return driver.findElement(Pom_YourLogoLocators.element26);
		
	}
	
	
	
	public static void alert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	
	public static void captureScreenShot(WebDriver driver,String image) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screenshot//"+image+".png"));
	}
	
	
	public static void ImplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}

}
