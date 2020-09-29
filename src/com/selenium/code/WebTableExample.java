package com.selenium.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) throws InterruptedException {
		//need to implement methods of web driver
		//create a driver object for chrome browser
		int sum =0;
		System.setProperty("webdriver.chrome.driver", "C:\\Nilesh\\Udemy Learning\\Selenium Learning\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30360/7th-match-indian-premier-league-2020");
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();

		/*
		for(int i=0;i<count;i++)
		{
		String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		System.out.println(value);
		}
		*/
	
		for(int i=0;i<count-2;i++)
		{
		String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int valueinteger=  Integer.parseInt(value);
		sum=sum+valueinteger;//103
		}
		//System.out.println(sum);

		String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue=Integer.parseInt(Extras);
		int TotalSumValue=sum+extrasValue;
		System.out.println(TotalSumValue);


		String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalVAlue=Integer.parseInt(ActualTotal);
		if(ActualTotalVAlue==TotalSumValue)
		{
		System.out.println("Count Matches");
		}
		else
		{
		System.out.println("count fails");
		}
			}

}
