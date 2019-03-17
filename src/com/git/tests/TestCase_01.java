package com.git.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_01 {

	public static void main(String[] args) throws IOException {
		// Created by Mano
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prasanth\\Downloads\\eclipse-jee-2018-12-R-win32-x86_64\\eclipse\\ManojGIT\\TestCase1\\GIT10AM_WEEKEND\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    TakesScreenshot tk = (TakesScreenshot)driver;
	    File src = tk.getScreenshotAs(OutputType.FILE);
	    File det = new File("C:\\Users\\prasanth\\Downloads\\eclipse-jee-2018-12-R-win32-x86_64\\eclipse\\ManojGIT\\TestCase1\\GIT10AM_WEEKEND\\Screenshot\\File1.png");
	    FileUtils.copyFile(src, det);
	    

	}

}
