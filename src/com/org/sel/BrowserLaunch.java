package com.org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
//How to navigate browser tabs.
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	driver.navigate().to("https://www.amazon.in/");
	driver.navigate().to("https://www.flipkart.com/");
	driver.navigate().back();
	driver.navigate().to("https://www.facebook.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().to("https://www.youtube.com/");
	Thread.sleep(5000);
	driver.navigate().refresh();
	driver.close();

	}

}
