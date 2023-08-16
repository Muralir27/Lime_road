package com.Human.MyProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlinInputs {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asd\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		
		driver.findElementById("fullName").sendKeys("Murali Latha");
		Thread.sleep(3000);
		
		driver.findElementById("join").sendKeys(" person", Keys.TAB);
		Thread.sleep(3000);
		
		String value=driver.findElementById("getMe").getAttribute("value");
		System.out.println(value);
		Thread.sleep(3000);
		
		driver.findElementById("clearMe").clear();
		Thread.sleep(3000);
		
		boolean edit = driver.findElementById("noEdit").isEnabled();
		System.out.println(edit);
		Thread.sleep(3000);
		
		String read = driver.findElementById("dontwrite").getAttribute("readonly");
		System.out.println(read);
		Thread.sleep(3000);
		
		driver.quit();
	}

}
