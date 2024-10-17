package com.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SauceTest {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void SetUp() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
		Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
		System.out.println("Browser launched successfully and navigated to saucedemo website ");
	}
	
	
	
	@Test(priority = 1)
	public void LoginTest(){
		LoginPage login=new LoginPage(driver);
		login.Login("standard_user", "secret_sauce");
		String PageHeading = driver.findElement(By.xpath("//span[text()='Products']")).getText();
		Assert.assertEquals(PageHeading,"Products");
		System.out.println("Login successfull!!!");	
	}
	
	
	@Test(priority = 2)
	public void addingProductToCart() throws InterruptedException {
		
		
		ProductsPage product=new ProductsPage(driver);
		
		product.ListOfitems();
		Thread.sleep(2000);
		product.Sort("za");
		Thread.sleep(2000);
		product.Sort("az");
		Thread.sleep(2000);
		product.AddToCart();
		Thread.sleep(2000);
		product.RemoveFromCart();
		Thread.sleep(2000);
		product.VerifyCartValue("2");
		product.cartButton();
	
	}

	
	@Test(priority = 3)
	public void YourCart() {
		
		YourCartPage cart=new YourCartPage(driver);
		cart.VerifyProduct();
		cart.Checkout();
		
	}
	
	@Test(priority = 4)
	public void YourInformation() {
		
		YourInformationPage information=new YourInformationPage(driver);
		information.EnterDetails("Arya", "Raj", "573201");
		information.ContinueButton();
	}
	
	@Test(priority = 5)
	public void Overview() {
		OverviewPage overview =new OverviewPage(driver);
		overview.FinishButton();
		overview.VerifyCheckoutCompleted();
		overview.Logout("https://www.saucedemo.com/");
		
	}
	
	@AfterClass
	public void BrowserClose() {
		driver.close();
	}

}
