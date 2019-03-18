package com.git.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_02 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJ\\eclipse-workspace\\OrangePage\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.switchTo().frame("a077aa5e");
		WebElement txtUser = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		txtUser.click();
		
	}

}
