package com.Human.MyProject;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launch {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\asd\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.nopcommerce.com/register");
		driver.manage().window().maximize();
		System.out.println("Title of the WEBPAGE :"+driver.getTitle());
		System.out.println("CurrentURL of the WEBPAGE :"+driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
	}

}
