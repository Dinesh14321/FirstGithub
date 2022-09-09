package com.org.sel;

import java.io.File;

import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/frame.html");
	driver.switchTo().frame(0);
	WebElement frame1 = driver.findElement(By.id("Click"));
	frame1.click();
	//Using String for getText();
	String text = frame1.getText();
	System.out.println("Frame 1:"+text); //---Concordinate
	driver.switchTo().defaultContent();
	Thread.sleep(1500);
	//Method Overloading
	driver.switchTo().frame(1);
	driver.switchTo().frame("frame2");
	WebElement frame2 = driver.findElement(By.id("Click1"));
	frame2.click();
	String text1 = frame2.getText();
	System.out.println("frame2:"+text1);
	driver.switchTo().defaultContent();
	
	List<WebElement>framecount = driver.findElements(By.tagName("iframe"));
	int size = framecount.size();
	System.out.println("iFrame Size:"+size);
	TakesScreenshot take = (TakesScreenshot) driver;
	File start = take.getScreenshotAs(OutputType.FILE);
	File close = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\fr.png");
	FileUtils.copyFile(start,close);
	Thread.sleep(1000);
	driver.close();
	
	}

}
