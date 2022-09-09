package com.org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathInstagram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("dinesh.nirmala94@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[contains(@type,'pass')]"));
		password.sendKeys("Dinesh@94");
		
		WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		login.click();
		driver.navigate().back();
		driver.navigate().refresh();
		
		//Thread.sleep(1500);
		//driver.navigate

	}

}
