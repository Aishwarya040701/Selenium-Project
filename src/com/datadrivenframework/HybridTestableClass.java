package com.datadrivenframework;

import java.io.IOException;

import org.testng.annotations.Test;

public class HybridTestableClass {
	
	@Test
	public void FB_creation() throws IOException {
		ExcelRepositoryClass.ExcelHelperClass("InputdataSheet2.xlsx","url" );
		ExcelRepositoryClass.ExcelHelperClass1("InputdataSheet2.xlsx","Facebook_Creation" );
	}

}
