package com.selenium.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Invoke_FireFox_Browser {

	public static void main(String[] args) {
		//need to implement methods of web driver
		//create a driver object for firefox browser i.e. Gecko Driver
		System.setProperty("webdriver.ie.driver", "C:\\Nilesh\\Udemy Learning\\Selenium Learning\\Browser Drivers\\IE Driver\\IEDriverServer_64Bit.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		driver.get("http://www.google.com");
		String myTitle = driver.getTitle();
		System.out.println("My Browser Title is :" + myTitle);
		System.out.println(" test comment for Git Hub Brnach");
	}

}
