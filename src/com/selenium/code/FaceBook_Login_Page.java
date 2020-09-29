package com.selenium.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Login_Page {

	public static void main(String[] args) throws InterruptedException {
		//need to implement methods of web driver
		//create a driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Nilesh\\Udemy Learning\\Selenium Learning\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		String myTitle = driver.getTitle();
		System.out.println("My Browser Title is :" + myTitle);
		
		//check if user landed on expected url or not. and this statement will fetch the navigated URL on browser
		System.out.println(driver.getCurrentUrl());
		
		//following statement provide the page source and it help user to deal with frames information other css information.
		System.out.println(driver.getPageSource());
		
		driver.navigate().to("http://www.espncricinfo.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.close(); // this command close the current browser opened by selenium webdriver
		driver.quit(); //this command close all the browsers opened by selenium web driver.
	}

}
