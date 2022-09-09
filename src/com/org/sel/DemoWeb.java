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

public class DemoWeb {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
		//(//tagName[@attributename='attributevalue'])[index]
		WebElement register = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
		register.click();
		//(//tagName[@attributename='attributevalue'])[index]
		WebElement gender = driver.findElement(By.xpath("(//label[@class='forcheckbox'])[1]"));
		gender.click();
		//tagName[@attributename='attributevalue']
		WebElement first = driver.findElement(By.xpath("//input[@name='FirstName']"));
		first.sendKeys("Dinesh");
		//tagName[contains(@attributename,'attributevalue')]
		WebElement last = driver.findElement(By.xpath("//input[contains(@name,'LastName')]"));
		last.sendKeys("S");
		TakesScreenshot tst = (TakesScreenshot) driver;
		File source = tst.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\png");
		FileUtils.copyFile(source, destination);		
		//tagName[contains(@attributename,'attributevalue')]
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'Email')]"));
		email.sendKeys("dinesh.nirmala94@gmail.com");
		//tagName[@attributename='attributevalue']
		WebElement pass = driver.findElement(By.xpath("//input[@name='Password']"));
		pass.sendKeys("1234567");
		//tagName[@attributename='attributevalue']
		WebElement confirm = driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
		confirm.sendKeys("1234567");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File store = ts.getScreenshotAs(OutputType.FILE);
		File space = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\demo.png");
		FileUtils.copyFile(store, space);
		//(//tagName[@attributename='attributevalue'])[index]
		WebElement enter = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
		enter.click();
		Thread.sleep(1000);
		driver.close();
	
	}

}
