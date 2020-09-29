package com.selenium.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Miscellaneous_WindowMaximize1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Nilesh\\Udemy Learning\\Selenium Learning\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//following step is to maximize the browser before invoking any URL
		driver.manage().window().maximize();
		//following line is to delete all cookies before the browser is invoke.
		driver.manage().deleteAllCookies();

		driver.get("http://www.facebook.com");
		
	}

}
