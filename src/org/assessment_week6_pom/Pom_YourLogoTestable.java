package org.assessment_week6_pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class Pom_YourLogoTestable {
	public static WebDriver driver;
	
	
	
	@Test
	public void test1() throws IOException {
		
		ExtentReports logger = new ExtentReports();
		logger.init("ExtentReports//YourLogoWebsite.html", true);
		
		logger.startTest("Browser launching and navigating to url");
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		driver=new ChromeDriver();
		logger.log(LogStatus.INFO, "Launching chrome browser");
		String appurl=Pom_YourLogoInputDataClass.Appurl;
		System.out.println(appurl);
		driver.get(appurl);
		logger.log(LogStatus.INFO, "naviagting to URL"); 
		
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Maximizing the browser"); 
		Pom_YourLogoRepositoryClass.ImplicitWait(driver);
		Pom_YourLogoRepositoryClass.captureScreenShot(driver, "YourLogoHomePage");
		logger.log(LogStatus.INFO, "capturing firstpage screenshot"); 
		logger.endTest();
	}
	
	@Test
	public void test2() throws IOException{
		
	   ExtentReports logger2=ExtentReports.get(ExtentReports.class);
	   logger2.init("ExtentReports//YourLogoWebsite2.html", true);
	   logger2.startTest("YoursLogo Website Functionality check ");
	   JavascriptExecutor js=(JavascriptExecutor) driver;
	
		
		WebElement Element1=Pom_YourLogoRepositoryClass.Clickele1(driver);
		js.executeScript("arguments[0].style.color='blue'",Element1);
		Actions obj1 = new Actions(driver);
		obj1.moveToElement(Element1).build().perform();
		logger2.log(LogStatus.INFO, "mouseover1 on Element1");
		
		WebElement Element2=Pom_YourLogoRepositoryClass.Clickele2(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element2);
		Element2.click();
		logger2.log(LogStatus.INFO, "click operation of Element2");
		
		
		WebElement Element3=Pom_YourLogoRepositoryClass.Clickele3(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element3);
		Actions obj2 = new Actions(driver);
		obj2.moveToElement(Element3).build().perform();
		logger2.log(LogStatus.INFO, "mouseover2 on Element2");
		
		
		
		WebElement Element4=Pom_YourLogoRepositoryClass.Clickele4(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element4);
		Element4.click();
		logger2.log(LogStatus.INFO, "click operation of Element4");
		
		
		WebElement Element5=Pom_YourLogoRepositoryClass.Clickele5(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element5);
		Element5.click();
		logger2.log(LogStatus.INFO, "click operation of Element5");
		
		
		WebElement Element6=Pom_YourLogoRepositoryClass.Clickele6(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element6);
		Element6.click();
		logger2.log(LogStatus.INFO, "click operation of Element6");
		
		
		WebElement Element7=Pom_YourLogoRepositoryClass.Clickele7(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element7);
		Element7.sendKeys(Pom_YourLogoInputDataClass.email);
		logger2.log(LogStatus.INFO, "sending inputData to Element7");
		
		
		
		WebElement Element8=Pom_YourLogoRepositoryClass.Clickele8(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element8);
		Element8.click();
		logger2.log(LogStatus.INFO, "click operation of Element8");
		
		
		WebElement Element9=Pom_YourLogoRepositoryClass.Clickele9(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element9);
		Element9.click();
		logger2.log(LogStatus.INFO, "click operation of Element9");
		
		
		WebElement Element10=Pom_YourLogoRepositoryClass.Clickele10(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element10);
		Element10.sendKeys(Pom_YourLogoInputDataClass.fname);
		logger2.log(LogStatus.INFO, "sending inputData to Element10");
		
		
		WebElement Element11=Pom_YourLogoRepositoryClass.Clickele11(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element11);
		Element11.sendKeys(Pom_YourLogoInputDataClass.lname);
		logger2.log(LogStatus.INFO, "sending inputData to Element11");
		
		
		WebElement Element12=Pom_YourLogoRepositoryClass.Clickele12(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element12);
		Element12.sendKeys(Pom_YourLogoInputDataClass.pass);
		logger2.log(LogStatus.INFO, "sending inputData to Element12");
		
		
		Select Element13=new Select(Pom_YourLogoRepositoryClass.Clickele13(driver));
		js.executeScript("arguments[0].style.border='4px solid blue'",Element13);
		Element13.selectByValue(Pom_YourLogoInputDataClass.day);
		logger2.log(LogStatus.INFO, "sending inputData to Element13");
		
		
		Select Element14=new Select(Pom_YourLogoRepositoryClass.Clickele14(driver));
		js.executeScript("arguments[0].style.border='4px solid blue'",Element14);
		Element14.selectByVisibleText(Pom_YourLogoInputDataClass.month);
		logger2.log(LogStatus.INFO, "sending inputData to Element14");
		
		
		Select Element15=new Select(Pom_YourLogoRepositoryClass.Clickele15(driver));
		js.executeScript("arguments[0].style.border='4px solid blue'",Element15);
		Element15.selectByValue(Pom_YourLogoInputDataClass.year);
		logger2.log(LogStatus.INFO, "sending inputData to Element15");
		
		WebElement Element16=Pom_YourLogoRepositoryClass.Clickele16(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element16);
		Element16.sendKeys(Pom_YourLogoInputDataClass.Area);
		logger2.log(LogStatus.INFO, "sending inputData to Element16");
		
		WebElement Element17=Pom_YourLogoRepositoryClass.Clickele17(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element17);
		Element17.sendKeys(Pom_YourLogoInputDataClass.city);
		logger2.log(LogStatus.INFO, "sending inputData to Element17");
		
		WebElement Element18=Pom_YourLogoRepositoryClass.Clickele18(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element18);
		Element18.sendKeys(Pom_YourLogoInputDataClass.Address);
		logger2.log(LogStatus.INFO, "sending inputData to Element18");
		
		Select Element19=new Select(Pom_YourLogoRepositoryClass.Clickele19(driver));
		js.executeScript("arguments[0].style.border='4px solid blue'",Element19);
		Element19.selectByVisibleText(Pom_YourLogoInputDataClass.state);
		logger2.log(LogStatus.INFO, "sending inputData to Element19");
		
		WebElement Element20=Pom_YourLogoRepositoryClass.Clickele20(driver);
		js.executeScript("arguments[0].style.color='blue'",Element20);
		Element20.sendKeys(Pom_YourLogoInputDataClass.postcode);
		logger2.log(LogStatus.INFO, "sending inputData to Element20");
		
		Select Element21=new Select(Pom_YourLogoRepositoryClass.Clickele21(driver));
		js.executeScript("arguments[0].style.border='4px solid blue'",Element21);
		Element21.selectByVisibleText(Pom_YourLogoInputDataClass.country);
		logger2.log(LogStatus.INFO, "sending inputData to Element21");
		
		WebElement Element22=Pom_YourLogoRepositoryClass.Clickele22(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element22);
		Element22.sendKeys(Pom_YourLogoInputDataClass.mob);
		logger2.log(LogStatus.INFO, "sending inputData to Element22");
		
		WebElement Element23=Pom_YourLogoRepositoryClass.Clickele23(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element23);
		Element23.click();
		logger2.log(LogStatus.INFO, "click operation of Element23");
		
		WebElement Element24=Pom_YourLogoRepositoryClass.Clickele24(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element24);
		Element24.click();
		logger2.log(LogStatus.INFO, "click operation of Element24");
		
		WebElement Element25=Pom_YourLogoRepositoryClass.Clickele25(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element25);
		Element25.click();
		logger2.log(LogStatus.INFO, "click operation of Element25");
		
		WebElement Element26=Pom_YourLogoRepositoryClass.Clickele26(driver);
		js.executeScript("arguments[0].style.border='4px solid blue'",Element26);
		Element26.click();
		logger2.log(LogStatus.INFO, "click operation of Element26");
		
		Pom_YourLogoRepositoryClass.captureScreenShot(driver, "YourLogoLastPage");
		
		logger2.log(LogStatus.INFO, "capturing last page screenshot");
		logger2.endTest();
		
		

		
		
	}

	

}
