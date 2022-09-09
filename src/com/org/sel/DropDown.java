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
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//tagName[text()='full text']
		WebElement start = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		start.click();
		Thread.sleep(1000);
		//tagName[@attributename='attributevalue']
		WebElement first = driver.findElement(By.xpath("//input[@name='firstname']"));
		first.sendKeys("Dinesh");
		//tagName[conatins(@attributename,'attributevalue')]
		WebElement surname = driver.findElement(By.xpath("//input[contains(@name,'lastname')]"));
		surname.sendKeys("S");
		//(//tagName[@attributename='attributevalue'])[index]
		WebElement mail = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		mail.sendKeys("dinesh.nirmala94@gmail.com");
		WebElement resend = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		resend.sendKeys("dinesh.nirmala94@gmail.com");
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("123456");
		WebElement day = driver.findElement(By.id("day"));
		Select s = new Select(day);
		s.selectByIndex(18);
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByValue("9");
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1994");
		//tagName[text()='full text']
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
		WebElement sign = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		sign.click();
		Thread.sleep(1000);
		TakesScreenshot shot = (TakesScreenshot)driver;
		File main = shot.getScreenshotAs(OutputType.FILE);
		File second = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\dp.png");
		FileUtils.copyFile(main, second);
		Thread.sleep(1000);
		//driver.close();	
				

	}

}
