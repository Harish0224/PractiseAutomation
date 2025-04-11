package com.tcs.testcases;


import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.tcs.base.Base;

public class LaunchApp {
	Base base=new Base();
	
	@Test
	public void openURL() throws IOException {
		
		base.initialization("chrome");
	  
	}

}
