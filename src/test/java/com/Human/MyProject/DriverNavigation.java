package com.Human.MyProject;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigation {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asd\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		
		String url = driver.getCurrentUrl();
		System.out.println("Button URL : "+url);
		Thread.sleep(3000);
	
		driver.findElementByLinkText("Sign up").click();
		String url1 = driver.getCurrentUrl();
		System.out.println("Homepage URL : "+url1);
		Thread.sleep(2500);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2300);
		
		driver.navigate().to("https://letcode.in/signin");
		Thread.sleep(3000);
		
		driver.quit();
		
		//Navigation nv =driver.navigate();
	}

}
