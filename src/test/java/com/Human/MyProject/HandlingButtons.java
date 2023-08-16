package com.Human.MyProject;

import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asd\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();

		WebElement ele = driver.findElementById("position");
		Point p = ele.getLocation();
		int x = p.getX();
		int y = p.getY();
		System.out.println(" X==>" +x + "Y==>"+y);
		
		WebElement e = driver.findElementById("color");
		String color = e.getCssValue("background-color");
		System.out.println(color);
		
		Rectangle rect = driver.findElementById("property").getRect();
		System.out.println("Height ====>"+rect.getHeight());
		System.out.println("Width======>"+rect.getWidth());
		
		boolean b = driver.findElementById("isDisabled").isEnabled();
		System.out.println(b);
		
		driver.quit();
	}

}
 	