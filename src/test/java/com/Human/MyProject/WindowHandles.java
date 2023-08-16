package com.Human.MyProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asd\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://letcode.in/windows");
	    String win =   driver.getWindowHandle();
	    System.out.println("First Window  :"+win);
	    
	   	driver.findElement(By.id("home")).click();
	   	
	    Set<String> str =	driver.getWindowHandles();
	    System.out.println(str);
	    
	    List<String> list = new ArrayList<String>(str); 
	    driver.switchTo().window(list.get(1));
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.switchTo().window(list.get(0));
	    driver.close();
	    // Get current window
	    Set<String> str1 =	driver.getWindowHandles();
	    
	    //list irukum value-i clear pannanum
	    list.clear();
	    
	    //window`s details-i store pannanum
	    list.addAll(str1);
	    
	    //current window page based on array index
	    driver.switchTo().window(list.get(0));
	    
	    //current URL value 
	    System.out.println(driver.getCurrentUrl());
	    
	    
	   }

}
