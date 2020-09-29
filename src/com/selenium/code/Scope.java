package com.selenium.code;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Nilesh\\Udemy Learning\\Selenium Learning\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
// give me the count of links on the page
		//link should have tag name <a>
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
// above concept is to limit the scope to specific part of a window.		
		WebElement columnDriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
	//check if the each link opens in the column
		
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size(); i++) {
			String clickOnLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
			Thread.sleep(5000);
		}
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			while(it.hasNext())
			{
				
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
	
	}
}
