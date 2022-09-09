package com.week.two;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Test {

	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	Actions pick = new Actions(driver);
	WebElement checkbox = driver.findElement(By.className("gb_Ue"));
	pick.click(checkbox).build().perform();
	Thread.sleep(1000);
	Robot run = new Robot();
	run.keyPress(KeyEvent.VK_DOWN);
	run.keyRelease(KeyEvent.VK_DOWN);
	
	run.keyPress(KeyEvent.VK_DOWN);
	run.keyRelease(KeyEvent.VK_DOWN);
	
	run.keyPress(KeyEvent.VK_ENTER);
	run.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(1000);
	
	//WebElement find = driver.findElement(By.xpath("(//span[@class='MrEfLc'])[4]"));
	//find.click();
	}

}
