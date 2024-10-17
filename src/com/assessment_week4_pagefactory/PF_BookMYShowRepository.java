package com.assessment_week4_pagefactory;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PF_BookMYShowRepository {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//img[@alt='BANG']")
	public static WebElement SelectState;
	
	@FindBy(linkText="Movies")
	public static WebElement SelectMovies;
	
	@FindBy(xpath="//img[@alt='Brahmastra']")
	public static WebElement SelectMoveName;
	
	@FindBy(xpath="//div[@class='sc-1vmod7e-2 iBonLL']//span[contains(text(),'Book tickets')]")
	public static WebElement ClickBookMyTicket;
	
	@FindBy(xpath="(//section[@class='sc-vhz3gb-2 ceXPQZ']//div[@class='sc-vhz3gb-3 dRokFO']//span[contains(text(),'2D')])[2]")
	public static WebElement SelectMoiveType;
	
	@FindBy(css="button[id='wzrk-cancel'][class='No thanks']")
	public static WebElement ClickOnPopUp;
	
	@FindBy(xpath="//div[@class='showtime-pill-container']//a[@data-date-time='07:30 PM']")
	public static WebElement SelectMoiveTime;
	
	@FindBy(css="div#btnPopupAccept")
	public static WebElement ClickOnPopupAccept;
	
	@FindBy(css="li#pop_4")
	public static WebElement SelectMovieSeates;
	
	@FindBy(css="div#proceed-Qty")
	public static WebElement ClickOnProceed;
	
	@FindBy(css="div[id='A_1_06']")
	public static WebElement SelectSeat1;
	
	@FindBy(css="div[id='A_2_06']")
	public static WebElement SelectSeat2;
	
	@FindBy(css="a[id='btmcntbook']")
	public static WebElement ClickOnProceed2;
	
	@FindBy(css="div[id='prePay']")
	public static WebElement ClickOnPayment;
	
	@FindBy(css="input#txtEmail")
	public static WebElement EnterEmail;
	
//	public static void alert() {
//		driver.switchTo().alert().accept();
//	}
//	
//	
//	public static void captureScreenShot(String image) throws IOException {
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("screenshot//"+image+".png"));
//	}
//	
//	
//	public static void ImplicitWait() {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//	}
//	
//	

}
