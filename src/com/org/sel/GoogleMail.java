package com.org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.snapchat.com/accounts/login?client_id=geo");
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("gomathimd");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("srimathi1712");
		WebElement login = driver.findElement(By.id("loginTrigger"));
		login.click();
		Thread.sleep(2500);
		//driver.close();			

	}

}