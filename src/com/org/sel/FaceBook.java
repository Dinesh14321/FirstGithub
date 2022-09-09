package com.org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
//How to login to the poratl
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//WebElement
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("dineshrpcg@gmail.com");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("Dinesh@94");
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	Thread.sleep(2000);
	driver.close();
   
	}

}
