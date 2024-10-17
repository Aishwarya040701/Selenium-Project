package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ReadFromXml {
	public static WebDriver driver;
	
	@BeforeClass
	public void browserOpen() {
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Parameters({"browser"})
	@BeforeMethod
	public void openUrl(String appurl) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}
	@Parameters({"username_id","password_id","username","password"})
	@Test
	public void userInput(String userid,String passid,String uname,String upass) {
		WebElement username = driver.findElement(By.name(userid));
		WebElement password = driver.findElement(By.name(passid));
		username.sendKeys(uname);
		password.sendKeys(upass);

	}

	@AfterMethod()
	public void Login() {
		WebElement login_button = driver.findElement(By.name("login"));
		login_button.click();

	}

	@AfterClass
	public void browserClose() {
		
		driver.close();
	}

}
