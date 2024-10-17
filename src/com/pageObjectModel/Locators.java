package com.pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Locators {
	
	//public static By Fb_creation_xpath=By.xpath("//a[conatins(text(),'Create New Account']");
	public static By Fb_Fname_name=By.name("firstname");
	public static By Fb_Lname_name=By.name("lastname");
	public static By Fb_Mob_name=By.name("reg_email__");
	public static By Fb_Pass_id=By.id("password_step_input");
	public static By Fb_Day_id=By.id("day");
	public static By Fb_Mon_id=By.id("month");
	public static By Fb_Year_id=By.id("year");
	public static By Fb_Gender_css=By.cssSelector("input[name='sex'][value='1']");
	
	

}
