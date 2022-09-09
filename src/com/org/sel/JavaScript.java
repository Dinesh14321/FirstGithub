package com.org.sel;

import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", facebook);
		Thread.sleep(1000);
		TakesScreenshot ss = (TakesScreenshot)driver;
		File take = ss.getScreenshotAs(OutputType.FILE);
		File save = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\java.png");
		FileUtils.copyFile(take, save);
		Thread.sleep(1000);
		//driver.navigate().refresh();
		js.executeScript("window.scrollBy(0,-4000);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,4000);");
		Thread.sleep(1000);
		driver.close();
		
		
		

	}

}
