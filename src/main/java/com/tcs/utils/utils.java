package com.tcs.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tcs.base.Base;

public class utils extends Base {
	
	public static void click(WebElement ele) {
		WebDriverWait wait=new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOf(ele)).click();;
	}

}
