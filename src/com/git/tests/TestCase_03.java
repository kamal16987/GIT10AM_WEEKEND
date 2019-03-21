package com.git.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_03 {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Madhav\\eclipse-workspace\\GIT10AM_WEEKEND\\driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 WebElement txtuser = driver.findElement(By.id("email"));
		 txtuser.sendKeys("rekha");
		 WebElement txtpass =driver.findElement(By.id("pass"));
		 txtpass.sendKeys("raeu2o2");

	}

}
