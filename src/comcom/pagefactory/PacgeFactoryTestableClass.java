package comcom.pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PacgeFactoryTestableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.setProperty("webdriver.chrome.driver", "Browsers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(InputDtaClass.Appurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		PageFactory.initElements(driver, PageFactoryRepository.class);
		
		PageFactoryRepository.FB_Fname.sendKeys(InputDtaClass.FB_Fname);
		PageFactoryRepository.FB_Lname.sendKeys(InputDtaClass.FB_Lname);
		PageFactoryRepository.FB_Mob.sendKeys(InputDtaClass.FB_Mob);
		PageFactoryRepository.FB_Pass.sendKeys(InputDtaClass.FB_Pass);
		new Select(PageFactoryRepository.FB_Day).selectByVisibleText(InputDtaClass.FB_Day);
		new Select(PageFactoryRepository.FB_Mon).selectByVisibleText(InputDtaClass.FB_Mon);
	    new Select(PageFactoryRepository.FB_Year).selectByVisibleText(InputDtaClass.FB_Year);
		PageFactoryRepository.FB_Gender.click();
		
		
		
		

	}

	

}
