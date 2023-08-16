package com.Human.MyProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\asd\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://letcode.in/edit");
	    driver.manage().window().maximize();
	    List<WebElement> list = driver.findElementsByTagName("label");
	    for (WebElement myList  : list) {
	    	String text=myList.getText();
	    	System.out.println(text);
			
		}

	}

}
