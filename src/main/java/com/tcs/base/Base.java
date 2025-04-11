package com.tcs.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	
	public void initialization(String browser) throws IOException {

		Properties prop = new Properties();

		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\tcs\\files\\config.properties");
		prop.load(file);
		if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions copt = new ChromeOptions();
			copt.addArguments("start-maximized");
			copt.addArguments("incognito");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(copt);
			driver.get(prop.getProperty("URL"));
		}
	      if (browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions fopt = new FirefoxOptions();
			fopt.addArguments("--start-maximized");
			fopt.addArguments("incognito");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(fopt);
			driver.get(prop.getProperty("URL"));
		}
		if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("URL"));
		}		
		driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	}
	public static void takeSC() throws IOException {
		//TakesScreenshot tc=(TakesScreenshot)driver;
		//File file=tc.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"\\Screenshots\\harish.png"));
		//((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir")+"\\Screenshots\\harish.png"));
	}
	
}
