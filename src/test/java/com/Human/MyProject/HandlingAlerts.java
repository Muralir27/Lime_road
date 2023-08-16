package com.Human.MyProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asd\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		driver.manage().window().maximize();
		
		driver.findElementById("accept").click();
		Alert a=driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		Thread.sleep(3000);
		a.accept();
		
		driver.findElementById("confirm").click();
		Alert b = driver.switchTo().alert();
		String texts = b.getText();
		System.out.println(texts);
		b.dismiss();
		Thread.sleep(3000);
		
		driver.findElementById("prompt").click();
		Alert c =driver.switchTo().alert();
		c.sendKeys("Ivan Oru Tharkuri");
		Thread.sleep(2000);
		System.out.println(c.getText());
		c.accept();
		String n = driver.findElementById("myName").getText();
		System.out.println(n);
		
		
		
		
		
	}

}
