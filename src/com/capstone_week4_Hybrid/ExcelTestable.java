package com.capstone_week4_Hybrid;

import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

public class ExcelTestable {
	
	//@Test(priority = 1)
	public void T1() throws IOException, FindFailed, InterruptedException {
		ExcelRepositoryClass.AppOpen("RedBus.xlsx", "url","AppOpen1.html");
	    ExcelRepositoryClass.RedBusFunctionality("RedBus.xlsx", "RedBus","Homepagefunctionalities.html");
	   
	}
	
	@Test(priority = 2)
	public void T2() throws IOException, FindFailed, InterruptedException {
		
	    ExcelRepositoryClass.AppOpen("RedBus.xlsx", "url","AppOpen2.html");
		ExcelRepositoryClass.RedBusFunctionality("RedBus.xlsx", "booking","booking private bus.html");
	}

}
