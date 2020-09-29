package com.selenium.code;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Nilesh\\Udemy Learning\\Selenium Learning\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(4000);
		Actions a = new Actions(driver);
 		WebElement move = driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/span[1]/span"));
		a.moveToElement(move).build().perform();
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
	}

}
