package com.Human.MyProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asd\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://letcode.in/table");
	    WebElement table = driver.findElementById("simpletable");
	    List<WebElement> web = table.findElements(By.tagName("th"));
	    for (WebElement header : web) {
	    String str =header.getText();
	    System.out.println(str);
	    }
	    List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
	    int s = allrows.size();
	    System.out.println(s);
	    if(s==3) {
	    	System.out.println("test case pass");
	    	System.out.println("------------------");
	    }else 
	    	System.out.println("Test case failed");
	    
	        
	        //find the value inside the table column
	        for (WebElement row : allrows) {
	    	List<WebElement> columns = row.findElements(By.tagName("td"));
	    	WebElement fc = columns.get(0);
	    	System.out.println(fc.getText());
	    	}
	        System.out.println("------------------");
	        for (int i = 0; i <s; i++) {
	        List<WebElement> rows = allrows.get(i).findElements(By.tagName("td"));
	        WebElement  ln = rows.get(1);
	        String text = ln.getText();
	        System.out.println(text);
	        if(text.equals("Chatterjee"))
	        {
	        	WebElement input = rows.get(3).findElement(By.tagName("input"));
	            input.click();
	            break;
			}
	        
	        
		}
		}
	
	}