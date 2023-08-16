package com.Human.MyProject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asd\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		driver.manage().window().maximize();
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/img.png");
		FileHandler.copy(src,dest);
		
		WebElement ele = driver.findElementById("home");
		File src1 = ele.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("./screenshots/img1.png");
		FileHandler.copy(src1,dest1);
		
		WebElement info = driver.findElementByClassName("content");
		File src2 = info.getScreenshotAs(OutputType.FILE);
		File dest2 = new File("./screenshots/img2.png");
		FileHandler.copy(src2,dest2);
		
	    driver.quit();
	}

}
