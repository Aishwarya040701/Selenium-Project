package com.assessment_week4_modularframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MFR_BookMyShowLocators {
	
	public static By state=By.xpath("//img[@alt='BANG']");
	

	public static By movies=By.linkText("Movies");
	

	public static By movieName=By.xpath("//img[@alt='Brahmastra']");
	
	
	public static By bookTicket=By.xpath("//div[@class='sc-1vmod7e-2 iBonLL']//span[contains(text(),'Book tickets')]");

	
	public static By movieType=By.xpath("(//section[@class='sc-vhz3gb-2 ceXPQZ']//div[@class='sc-vhz3gb-3 dRokFO']//span[contains(text(),'2D')])[2]");

	
	public static By popup=By.cssSelector("button[id='wzrk-cancel'][class='No thanks']");

	
	public static By time=By.xpath("//div[@class='showtime-pill-container']//a[@data-date-time='07:30 PM']");


	public static By Accept=By.cssSelector("div#btnPopupAccept");
	
	public static By Seaters=By.cssSelector("li#pop_4");

	public static By proceed=By.cssSelector("div#proceed-Qty");
	
	public static By seat1=By.cssSelector("div[id='A_1_06']");
	
	public static By seat2=By.cssSelector("div[id='A_2_06']");

  
	public static By procced2=By.cssSelector("a[id='btmcntbook']");
	
	public static By payment=By.cssSelector("div[id='prePay']");

	public static By email=By.cssSelector("input#txtEmail");

	
	

}
