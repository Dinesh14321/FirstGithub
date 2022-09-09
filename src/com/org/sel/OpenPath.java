package com.org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenPath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("q")).sendKeys("Vellore"+Keys.ENTER);
   

	}

}