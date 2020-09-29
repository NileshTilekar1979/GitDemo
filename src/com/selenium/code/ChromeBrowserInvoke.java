package com.selenium.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserInvoke {

	public static void main(String[] args) throws InterruptedException {
		//need to implement methods of web driver
		//create a driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Nilesh\\Udemy Learning\\Selenium Learning\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("nilesh.tilekar@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("dfjhdjfdh");
		driver.findElement(By.linkText("Forgot Password?")).click();
		System.out.println(" test comment for Git Hub");
	}

}
