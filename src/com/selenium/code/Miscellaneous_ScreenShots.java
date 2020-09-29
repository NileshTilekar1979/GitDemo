package com.selenium.code;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Miscellaneous_ScreenShots {

	public static void main(String[] args) throws InterruptedException, IOException {
		  
		   
		System.setProperty("webdriver.chrome.driver", "C:\\Nilesh\\Udemy Learning\\Selenium Learning\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//following step is to maximize the browser before invoking any URL
		driver.manage().window().maximize();
		//following line is to delete all cookies before the browser is invoke.
		driver.manage().deleteAllCookies();

		driver.get("http://www.facebook.com");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\temp\\Screenshot_1.png"));
		
	}

}
