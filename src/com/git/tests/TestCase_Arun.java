package com.git.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_Arun {

	public static void main(String[] args) {
		 //set the driver info here
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUN\\eclipse-workspace\\SeleniumSample\\driver\\chromedriver.exe");
		//launch chrome browser
		   WebDriver driver=new ChromeDriver();
		//get url
			driver.get("https://www.google.com/");
			WebElement search=driver.findElement(By.name("q"));
			search.sendKeys("Tamil news");
	}

}
