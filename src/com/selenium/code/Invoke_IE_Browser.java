package com.selenium.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Invoke_IE_Browser {

	public static void main(String[] args) {
		//need to implement methods of web driver
		//create a driver object for firefox browser i.e. Gecko Driver
		System.setProperty("webdriver.gecko.driver", "C:\\Nilesh\\Udemy Learning\\Selenium Learning\\Browser Drivers\\Firefox Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");
		String myTitle = driver.getTitle();
		System.out.println("My Browser Title is :" + myTitle);
		
	}

}
