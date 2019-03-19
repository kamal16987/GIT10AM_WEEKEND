package com.git.tests;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase_04 {

	public static void main(String[] args) {
		//* created by prasanth*\\
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasanth\\Desktop\\psyan\\GIT10AM_WEEKEND\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement desc = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(src, desc).perform();
		
	}

}
