
package com.assessment;

import java.awt.Dimension;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;



public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(70));
				
				WebElement Electronics=driver.findElement(By.xpath("//a[contains(text(),' Electronics ')]"));
				Electronics.click();
				
			
				WebElement Mobile_and_Acessories=driver.findElement(By.xpath("//span[contains(text(),'Mobiles & Accessories')]"));
				Actions Aobj=new Actions(driver);
				Aobj.moveToElement(Mobile_and_Acessories).build().perform();
				
				driver.findElement(By.linkText("Samsung")).click();
				
				List<WebElement> Tag=driver.findElements(By.tagName("img"));
				int num=Tag.size();
				String attribute;
			
				for(WebElement T :Tag) {
				attribute=T.getAttribute("alt");
			    if(attribute.equals("Electronics")) {
			    	continue;
			    }
			    	
			    else{
				System.out.println(attribute);
				}	
		}
				
				driver.findElement(By.xpath("//img[@alt='Samsung Galaxy M13 (Aqua Green, 4GB, 64GB Storage) | 6000mAh Battery | Upto 8GB RAM with RAM Plus']")).click();
				Set<String> windows=driver.getWindowHandles();
				Iterator<String> itr=windows.iterator();
				String win1=itr.next();
				String win2=itr.next();
				
				driver.switchTo().window(win2);
				
				
				
				
				driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
				driver.findElement(By.cssSelector("input[aria-labelledby='attach-sidesheet-view-cart-button-announce']")).click();
				driver.findElement(By.cssSelector("input[value='Proceed to checkout']")).click();
				driver.findElement(By.name("email")).sendKeys("9972142501");
				driver.findElement(By.id("continue")).click();
				driver.findElement(By.name("password")).sendKeys("aishu123");
				driver.findElement(By.id("signInSubmit")).click();
				
				driver.findElement(By.cssSelector("a[class='a-declarative a-button-text ']")).click();
				
				//driver.findElement(By.xpath("//label[@for='pp-cAbzbj-94']")).click();
			    driver.findElement(By.xpath("//span[@class='a-dropdown-prompt'][contains(text(),'Choose an Option')]")).click();
			    driver.findElement(By.xpath("//a[contains(text(),'ICICI Bank')]")).click();
			    driver.findElement(By.xpath("//input[@name='ppw-widgetEvent:SetPaymentPlanSelectContinueEvent']")).click();
			    driver.findElement(By.xpath("//input[@title='Place Your Order and Pay']")).click();
				

   	}



}
