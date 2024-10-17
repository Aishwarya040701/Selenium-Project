package comcom.pagefactory;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PageFactoryRepository {
	
	public static WebDriver driver;
	
	@FindBy(name="firstname")
	public static WebElement FB_Fname;
	
	@FindBy(name="lastname")
	public static WebElement FB_Lname;
	
	@FindBy(xpath="//*[@name='reg_email__']")
	public static WebElement FB_Mob;
	
	@FindBy(xpath="//*[@name='reg_passwd__']")
	public static WebElement FB_Pass;
	
	@FindBy(id="day")
	public static WebElement FB_Day;
	
	@FindBy(id="month")
	public static WebElement FB_Mon;
	
	@FindBy(id="year")
	public static WebElement FB_Year;
	
	@FindBy(css="input[name='sex'][value='1']")
	public static WebElement FB_Gender;
	
	public static void alert() {
		driver.switchTo().alert().accept();
	}
	
	
	public static void captureScreenShot(String image) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screen1"+image+".png"));
	}
	
	
	public static void ImplicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	
	

}
