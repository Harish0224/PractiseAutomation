package com.tcs.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.tcs.base.*;
import com.tcs.utils.utils;
public class PractisePage extends Base {
//	utils tu=new utils();
	
	@FindBy(xpath="(//input[@name='radioButton'])[2]")
	WebElement radiobtn1;
	
	@FindBy(css="select#dropdown-class-example")
	WebElement dropdnbtn;
	
	public PractisePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickRadibtn() throws InterruptedException {
		utils.click(radiobtn1);
	  boolean s=radiobtn1.isSelected();
	  Assert.assertEquals(true, s,"Radio button selected"); 
	}
	
	public void drpdwn() {
		Select sl=new Select(dropdnbtn);
		sl.selectByIndex(2);
		
	}

}
