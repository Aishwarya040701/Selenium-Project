package com.assessment_week4_Hybrid;

import java.io.IOException;

import org.testng.annotations.Test;

public class ExcelTestable {
	
	@Test
	public void T1() throws IOException {
		ExcelRepositoryClass.AppOpen("Amazon_InputDataSheet.xlsx", "url");
		ExcelRepositoryClass.AmazonFunctionality("Amazon_InputDataSheet.xlsx", "Amazon_Shopping");
	}

}
