package com.selenium.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce_Login_Page {

	public static void main(String[] args) throws InterruptedException {
		//need to implement methods of web driver
		//create a driver object for chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Nilesh\\Udemy Learning\\Selenium Learning\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		// for xlpath double quote inside double quote doesnt work. just replace double quote with single quote
		//driver.findElement(By.id("email")).sendKeys("nilesh.tilekar@gmail.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tes1.test2@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("dfjhdjfdh");
		//driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("dfjhdjfdh");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("dsfkjdsjhf");
		//driver.findElement(By.linkText("Forgot Password?")).click();
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'Logi')]")).click();
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.cssSelector("[id='error']")).getText());

	
	}

}
