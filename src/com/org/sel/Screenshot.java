package com.org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

		public static void main(String[] args) throws InterruptedException, IOException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			//WebElement
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("dineshrpcg@gmail.com");
			WebElement password = driver.findElement(By.id("pass"));
			password.sendKeys("Dinesh@9");
			WebElement login = driver.findElement(By.name("login"));
			login.click();
			Thread.sleep(2000);
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File Source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File ("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\png5");
			FileUtils.copyFile(Source, destination);
			
			driver.quit();

	}

}
