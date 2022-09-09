package com.week.two;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.automationtesting.in/Alerts.html");
		
	//Simple Alert:
	driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
	WebElement simple = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	simple.click();	
	Alert first = driver.switchTo().alert();
	Thread.sleep(1000);
	first.accept();
	
	//Confirm Alert:
	driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
	WebElement confirm = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	confirm.click();	
	Alert second = driver.switchTo().alert();
	Thread.sleep(1000);
	second.dismiss();
	
	//Prompt Alert:
	driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
	WebElement prompt = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	prompt.click();
	Alert third = driver.switchTo().alert();
	third.sendKeys("Dinesh");
	Thread.sleep(1000);
	third.accept();
	//TakesScreenshot
	TakesScreenshot take = (TakesScreenshot)driver;
	File source = take.getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\al.png");
	FileUtils.copyFile(source, destination);
	driver.close();
	

	}

}
