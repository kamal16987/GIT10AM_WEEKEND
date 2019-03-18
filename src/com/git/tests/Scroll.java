package com.git.tests;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

		public static void main(String[] args) throws IOException {
		/* Created by RAJ */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Sanatorium\\Desktop\\Raj_91\\GIT10AM_WEEKEND\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement src = driver.findElement(By.xpath("//a[text()='தமிழ்']"));
		JavascriptExecutor jk=(JavascriptExecutor)driver;
		jk.executeScript("arguments[0].scrollIntoView(true)", src);
		src.click();
		
		
	}

}
