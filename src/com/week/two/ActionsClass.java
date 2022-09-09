package com.week.two;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		//Actions
		Actions act = new Actions(driver);
		WebElement images = driver.findElement(By.xpath("//a[text()='Images']"));
		//RightClick
		act.contextClick(images).build().perform();
		//DoubleClick
		//act.doubleClick(images).build().perform();
		Thread.sleep(1000);
		//Robot
		Robot run = new Robot();
		run.keyPress(KeyEvent.VK_DOWN);
		run.keyRelease(KeyEvent.VK_DOWN);
		
		//run.keyPress(KeyEvent.VK_DOWN);
		//run.keyRelease(KeyEvent.VK_DOWN);
		
		run.keyPress(KeyEvent.VK_ENTER);
		run.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		TakesScreenshot take = (TakesScreenshot)driver;
		File file = take.getScreenshotAs(OutputType.FILE);
		File save = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\ac.png");
		FileUtils.copyFile(file, save);
		driver.close();
		
		}

	}


