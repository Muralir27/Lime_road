package com.Human.MyProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asd\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
 
		WebElement m = driver.findElementByXPath("//iframe[@src='frameUI']");
		driver.switchTo().frame(m);
		driver.findElementByName("fname").sendKeys("Murali");
		Thread.sleep(1500);
		driver.findElementByName("lname").sendKeys("Latha");
		Thread.sleep(1500);
		
		WebElement n =driver.findElementByXPath("//iframe[@src='innerFrame']");
		driver.switchTo().frame(n);
		driver.findElementByName("email").sendKeys("123@gmail.com");
		Thread.sleep(1500);
		
		driver.switchTo().parentFrame();
		driver.findElementByName("lname").sendKeys(" R");
		Thread.sleep(1500);
		
		driver.switchTo().defaultContent();
		driver.findElementByXPath("//a[@class='card-footer-item']").click();
		Thread.sleep(1500);
		
		driver.close();
		
		
		

	}

}
