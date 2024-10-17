package com.assessment_week5_Hybrid;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExcelTestable {
	
	@Test
	public void T1() throws IOException {
		ExcelRepositoryClass.AppOpen("AmazonShopping_InputDataSheet.xlsx", "url");
		ExcelRepositoryClass.AmazonFunctionality("AmazonShopping_InputDataSheet.xlsx", "Amazon_Shopping");
	}

}
