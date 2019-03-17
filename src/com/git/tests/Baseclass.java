package com.git.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static void main(String[] args) {
		System.out.println("Created a BASECLASS");
		System.out.println("DAY 1 class");
		/*
		 * Created By Mano
		 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasanth\\Downloads\\eclipse-jee-2018-12-R-win32-x86_64\\eclipse\\ManojGIT\\TestCase1\\GIT10AM_WEEKEND\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement usernm = driver.findElement(By.id("email"));
		usernm.sendKeys("mano@gmail.com");
		WebElement ps = driver.findElement(By.id("pass"));
		ps.sendKeys("1234578");
	}
	
	public void sendKeys(WebDriver driver) {
		
				
	}
	
	public void enterAValueInTextBox() {

	}

}
