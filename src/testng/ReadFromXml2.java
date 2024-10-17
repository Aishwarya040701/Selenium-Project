package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ReadFromXml2 {
	
	public static WebDriver driver;
	
	
	@Parameters({"browser"})
	@Test
	public static void appOpen(String appurl) {
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(appurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
	}
	
	@Parameters({"fname_locator","lname_locator","mob_locator","pass_locator","name","lastname","mob","pass"})
	@Test
	public static void fb_creation(String fname_,String lname_,String mob_,String pass_,String fname,String lname,String mob,String pass1) {
		driver.findElement(By.name(fname_)).sendKeys(fname);
	    driver.findElement(By.name(lname_)).sendKeys(lname);
	    driver.findElement(By.name(mob_)).sendKeys(mob);
	    driver.findElement(By.name(pass_)).sendKeys(pass1);
		
	}
	

}
