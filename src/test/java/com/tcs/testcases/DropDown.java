package com.tcs.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.tcs.base.Base;
import com.tcs.pages.PractisePage;

public class DropDown extends Base{
Base base=new Base();
	
	@BeforeTest
	@Parameters("Browser")
	public void launcApp() throws IOException {
		base.initialization("edge");
	}
	@Test
	public void radiobtn() throws IOException {	
		PractisePage pp=new PractisePage(driver);
		pp.drpdwn();	
		takeSC();
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
}