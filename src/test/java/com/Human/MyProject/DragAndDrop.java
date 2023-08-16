package com.Human.MyProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\asd\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	WebElement e = driver.findElementById("draggable");
	WebElement t = driver.findElementById("droppable");
	Actions a = new Actions(driver);
	a.dragAndDrop(e, t).perform();
	Thread.sleep(3000);
	driver.quit();
	}
}
