package org.assessment_week6_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Pom_YourLogoLocators {
	
	public static By element1=By.cssSelector("div#block_top_menu>ul>li:nth-child(2)>a");
	

	public static By element2=By.xpath("//li[@class='sfHover']//a[contains(text(),'Casual Dresses')]");
	

	public static By element3=By.xpath("//img[@title='Printed Dress']");
	
	
	public static By element4=By.cssSelector("a[title='Add to cart']");

	
	public static By element5=By.cssSelector("a[title='Proceed to checkout']");

	
	public static By element6=By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]");

	
	public static By element7=By.id("email_create");


	public static By element8=By.name("SubmitCreate");
	
	public static By element9=By.cssSelector("input[name='id_gender'][value='2']");

	public static By element10=By.cssSelector("input#customer_firstname");
	
	public static By element11=By.cssSelector("input#customer_lastname");
	
	public static By element12=By.cssSelector("input#passwd");

  
	public static By element13=By.cssSelector("select#days");
	
	public static By element14=By.cssSelector("select#months");

	public static By element15=By.cssSelector("select#years");
	
	public static By element16=By.cssSelector("input#address1");
	
	public static By element17=By.cssSelector("input#city");
	
	public static By element18=By.cssSelector("input#address1");
	
	public static By element19=By.cssSelector("select[name='id_state']");
	
	public static By element20=By.cssSelector("input#postcode");
	
	public static By element21=By.cssSelector("div.selector>select[name='id_country']");
	
	public static By element22=By.id("phone_mobile");
	
	public static By element23=By.id("submitAccount");
	
	public static By element24=By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]");
	
	public static By element25=By.xpath("//label[contains(text(),'I agree to the terms of service and will adhere to them unconditionally.')]");
	
	public static By element26=By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]");
	
	

	
	

}
