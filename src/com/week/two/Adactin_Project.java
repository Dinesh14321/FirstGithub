package com.week.two;

import java.io.File;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Project {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("Dineshcool");
		driver.findElement(By.id("password")).sendKeys("cool@dinesh");
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		//Page 1
		//Implicit Wait:
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Single_DropDown
		WebElement location = driver.findElement(By.id("location"));
		Select s = new Select(location);
		s.selectByIndex(5);
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Sunshine");
		WebElement type = driver.findElement(By.id("room_type"));
		Select s2 = new Select(type);
		s2.selectByVisibleText("Super Deluxe");
		WebElement number = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(number);
		s3.selectByIndex(2);
		Thread.sleep(1000);
		WebElement datein = driver.findElement(By.id("datepick_in"));
		datein.sendKeys("06/08/2022");
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		dateout.sendKeys("08/08/2022");
		WebElement adults = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(adults);
		s4.selectByValue("2");
		WebElement child = driver.findElement(By.id("child_room"));
		Select s5 = new Select(child);
		s5.selectByVisibleText("0 - None");
		//ScreenShot
		TakesScreenshot takes = (TakesScreenshot)driver;
		File place = takes.getScreenshotAs(OutputType.FILE);
		File locate = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\one.png");
		FileUtils.copyFile(place,locate);		
		driver.findElement(By.id("Submit")).click();	
		//Page 2
		driver.findElement(By.id("radiobutton_0")).click();
		TakesScreenshot take = (TakesScreenshot)driver;
		File place1 = take.getScreenshotAs(OutputType.FILE);
		File locate1 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\two.png");
		FileUtils.copyFile(place1,locate1);
		driver.findElement(By.id("continue")).click();
		//Page 3
		driver.findElement(By.id("first_name")).sendKeys("Dinesh");
		driver.findElement(By.id("last_name")).sendKeys("S");
		driver.findElement(By.name("address")).sendKeys("Greens Technology, Chennai");
		driver.findElement(By.xpath("(//input[@type='text'])[13]")).sendKeys("3457891236780015");
		WebElement creditcard = driver.findElement(By.name("cc_type"));
		Select s6 = new Select(creditcard);
		s6.selectByVisibleText("Master Card");
		WebElement expirydate = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s7 = new Select(expirydate);
		s7.selectByValue("6");
		WebElement expiry = driver.findElement(By.xpath("//select[contains(@name,'cc_exp_year')]"));
		Select s8 = new Select(expiry);
		s8.selectByVisibleText("2022");
		driver.findElement(By.id("cc_cvv")).sendKeys("456");
		TakesScreenshot shot = (TakesScreenshot)driver;
		File place2 = shot.getScreenshotAs(OutputType.FILE);
		File locate2 = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\three.png");
		FileUtils.copyFile(place2, locate2);
		driver.findElement(By.id("book_now")).click();	
		Thread.sleep(1000);
		//Page 4
		driver.findElement(By.name("my_itinerary")).click();
		driver.findElement(By.id("logout")).click();
		driver.close();
		
		
	}

}
