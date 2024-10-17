package org.assessment_week4_pom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pom_BookMyShowRepository {
	
	public static WebElement SelectState(WebDriver driver) {
		return driver.findElement(Pom_BookMyShowLocators.state);
		
	}
	
	public static WebElement ClickMovies(WebDriver driver) {
		return driver.findElement(Pom_BookMyShowLocators.movies);
		
	}
	
	public static WebElement ClickMovieName(WebDriver driver) {
		return driver.findElement(Pom_BookMyShowLocators.movieName);
		
	}
	
	public static WebElement ClickBookTicket(WebDriver driver) {
		return driver.findElement(Pom_BookMyShowLocators.bookTicket);
		
	}
	
	public static WebElement ClickMovieType(WebDriver driver) {
		return driver.findElement(Pom_BookMyShowLocators.movieType);
		
	}
	
	public static WebElement ClickOnpopup(WebDriver driver) {
		return driver.findElement(Pom_BookMyShowLocators.popup);
		
	}
	
	public static WebElement ClickOnTime(WebDriver driver) {
		return driver.findElement(Pom_BookMyShowLocators.time);
		
	}
	
	public static WebElement ClickOnAcceptCondition(WebDriver driver) {
		return driver.findElement(Pom_BookMyShowLocators.Accept);
		
	}
	
	public static WebElement ClickNumberOfSeaters(WebDriver driver) {
		return driver.findElement(Pom_BookMyShowLocators.Seaters);
		
	}
	

	public static WebElement ClickOnProceed(WebDriver driver) {
		return driver.findElement(Pom_BookMyShowLocators.proceed);
		
	}
	
	public static WebElement ClickOnSeat1(WebDriver driver) {
		return driver.findElement(Pom_BookMyShowLocators.seat1);
		
	}
	
	public static WebElement ClickOnSeat2(WebDriver driver) {
		return driver.findElement(Pom_BookMyShowLocators.seat2);
		
	}
	
	public static WebElement ClickOnProcced2(WebDriver driver) {
		return driver.findElement(Pom_BookMyShowLocators.procced2);
		
	}
	
	public static WebElement ClickOnPayment(WebDriver driver) {
		return driver.findElement(Pom_BookMyShowLocators.payment);
		
	}
	
	public static WebElement EnterEmail(WebDriver driver) {
		return driver.findElement(Pom_BookMyShowLocators.email);
		
	}
	
	public static void alert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	
	public static void captureScreenShot(WebDriver driver,String image) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screenshot"+image+".png"));
	}
	
	
	public static void ImplicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

}
