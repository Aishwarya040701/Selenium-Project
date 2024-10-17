package com.modularframework;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ModularTestableClass {
	@Test
	public void t1() throws IOException {
	ModularRepositoryClass.applicationOpen();
	ModularRepositoryClass.FBCreation();
	ModularRepositoryClass.captureScreenShot("Signup_Imag");
	
	}

}
