package com.assessment_week4_Hybrid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsClass {

	public static By Locators(String proName, String proValue) {
		By obj = null;
		switch (proName) {
		
		case "id":
			obj = By.id(proValue);
			break;

		case "name":
			obj = By.name(proValue);
			break;

		case "className":
			obj = By.className(proValue);
			break;

		case "xpath":
			obj = By.xpath(proValue);
			break;

		case "css":
			obj = By.cssSelector(proValue);
			break;

		case "linkText":
			obj = By.linkText(proValue);
			break;

		case "partiallink":
			obj = By.partialLinkText(proValue);
			break;

		case "tagName":
			obj = By.tagName(proValue);
			break;

		default:
			break;
		}

		return obj;
	}

}
