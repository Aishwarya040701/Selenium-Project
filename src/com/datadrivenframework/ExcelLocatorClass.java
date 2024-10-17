package com.datadrivenframework;

import org.openqa.selenium.By;

public class ExcelLocatorClass {
	
	public static By ExcelLocator(String proName, String proValue) {
		By obj=null;
		switch (proName) {
		case "id":
			obj=By.id(proValue);
			break;
			
		case "name":
			obj=By.name(proValue);
			break;
			
		case "className":
			obj=By.id(proValue);
			break;
			
		case "xpath":
			obj=By.id(proValue);
			break;
			
		case "css":
			obj=By.cssSelector(proValue);
			break;
			
		case "link":
			obj=By.id(proValue);
			break;
			
		case "partiallink":
			obj=By.id(proValue);
			break;
			

		default:
			break;
		}
		return obj;
		
	}

}
