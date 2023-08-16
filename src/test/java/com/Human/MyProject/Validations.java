package com.Human.MyProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asd\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement e = driver.findElementByLinkText("Log in");
		boolean v = e.isDisplayed();
		System.out.println(v);
	}

}
