package com.Human.MyProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class HnadleDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asd\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.close();		
	}

}
