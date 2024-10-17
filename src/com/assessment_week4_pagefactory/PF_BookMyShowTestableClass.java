package com.assessment_week4_pagefactory;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.modularframework.InputDtaClass;

public class PF_BookMyShowTestableClass {
	 public static void main(String[] args) throws IOException {
		
	    WebDriver driver;

		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(PF_BookMYShowInputDataClass.Appurl);
		driver.manage().window().maximize();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		PageFactory.initElements(driver, PF_BookMYShowRepository.class);
		
		PF_BookMYShowRepository.SelectState.click();
		PF_BookMYShowRepository.SelectMovies.click();
		PF_BookMYShowRepository.SelectMoveName.click();
		PF_BookMYShowRepository.ClickBookMyTicket.click();
		PF_BookMYShowRepository.SelectMoiveType.click();
		PF_BookMYShowRepository.ClickOnPopUp.click();
		PF_BookMYShowRepository.SelectMoiveTime.click();
		PF_BookMYShowRepository.ClickOnPopupAccept.click();
		PF_BookMYShowRepository.SelectMovieSeates.click();
		PF_BookMYShowRepository.ClickOnProceed.click();
		PF_BookMYShowRepository.SelectSeat1.click();
		PF_BookMYShowRepository.SelectSeat2.click();
		PF_BookMYShowRepository.ClickOnProceed2.click();
		PF_BookMYShowRepository.ClickOnPayment.click();
		PF_BookMYShowRepository.EnterEmail.sendKeys("Aishu21234");
		
	
	
	
	
		
	}


}
