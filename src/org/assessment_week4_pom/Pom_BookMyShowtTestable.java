package org.assessment_week4_pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pom_BookMyShowtTestable {
	public static WebDriver driver;
	
	@Test
	public void test1() throws IOException {
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		driver=new ChromeDriver();
		String appurl=Pom_BookMYShowInputDataClass.Appurl;
		System.out.println(appurl);
		driver.get(appurl);
		driver.manage().window().maximize();
		Pom_BookMyShowRepository.ImplicitWait(driver);
		Pom_BookMyShowRepository.captureScreenShot(driver, "BookMyShowHomePage");
	}
	
	@Test
	public void test2() throws IOException{
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement state=Pom_BookMyShowRepository.SelectState(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",state);
		state.click();
		
		
		WebElement movies=Pom_BookMyShowRepository.ClickMovies(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",movies);
		movies.click();
		
		
		WebElement m1=Pom_BookMyShowRepository.ClickMovieName(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",m1);
		m1.click();
		
		
		WebElement m2=Pom_BookMyShowRepository.ClickBookTicket(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",m2);
		m2.click();
		
		
		WebElement m3=Pom_BookMyShowRepository.ClickMovieType(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",m3);
		m3.click();
		
		
		WebElement m4=Pom_BookMyShowRepository.ClickOnpopup(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",m4);
		m4.click();
		
		
		WebElement m5=Pom_BookMyShowRepository.ClickOnTime(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",m5);
		m5.click();
		
		
		WebElement m6=Pom_BookMyShowRepository.ClickOnAcceptCondition(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",m6);
		m6.click();
		
		
		WebElement m7=Pom_BookMyShowRepository.ClickNumberOfSeaters(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",m7);
		m7.click();
		
		
		WebElement m8=Pom_BookMyShowRepository.ClickOnProceed(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",m8);
		m8.click();
		
		
		WebElement m9=Pom_BookMyShowRepository.ClickOnSeat1(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",m9);
		m9.click();
		
		
		WebElement m10=Pom_BookMyShowRepository.ClickOnSeat2(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",m10);
		m10.click();
		
		
		WebElement m11=Pom_BookMyShowRepository.ClickOnProcced2(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",m11);
		m11.click();
		
		
		WebElement m12=Pom_BookMyShowRepository.ClickOnPayment(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",m12);
		m12.click();
		
		
		WebElement m13=Pom_BookMyShowRepository.EnterEmail(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",m13);
		m13.sendKeys(Pom_BookMYShowInputDataClass.email);
		
		Pom_BookMyShowRepository.captureScreenShot(driver, "BookMyShowFinalStep");
		
		
	}
	

}
