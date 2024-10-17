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
import org.testng.annotations.Test;

public class BrowserFunctionTestng {

	public static WebDriver driver;

	@BeforeClass
	public void browserOpen() {
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public void openUrl() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

	}

	@Test
	public void userInput() {
		WebElement username = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("pass"));
		username.sendKeys("aishu@gmail.com");
		password.sendKeys("aishu@12345");

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
