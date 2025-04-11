package com.tcs.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.tcs.base.Base;
import com.tcs.pages.PractisePage;

public class RadioButton extends Base{
	Base base=new Base();

	@BeforeTest
	@Parameters("Browser")
	public void launcApp() throws IOException {
		base.initialization("edge");
	}
	@Test
	public void radiobtn() throws IOException, InterruptedException {
		PractisePage pp=new PractisePage(driver);
		pp.clickRadibtn();	
		takeSC();
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
