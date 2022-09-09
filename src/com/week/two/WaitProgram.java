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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitProgram {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		//Implicit Wait:
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		name.sendKeys("Dinesh");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("S");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Chennai-6000028");
		driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("dinesh.nirmala94@gmail.com");
		driver.findElement(By.xpath("//input[contains(@type,'tel')]")).sendKeys("9751426383");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("checkbox1")).click();
		//Thread.sleep(1000);
		WebElement frames =driver.findElement(By.id("msdd"));
		frames.click();
		WebElement lang =driver.findElement(By.xpath("//a[text()='English']"));
		lang.click();
		WebElement lang1 =driver.findElement(By.xpath("//a[text()='Dutch']"));
		lang1.click();
		//Thread.sleep(1000);
		WebElement skills = driver.findElement(By.id("Skills"));
		Select s = new Select(skills);
		s.selectByVisibleText("AutoCAD");
		//Thread.sleep(1000);
		WebElement country = driver.findElement(By.xpath("//span[@role='combobox']"));
		Select sel = new Select(country);
		sel.selectByVisibleText("India");
		WebElement year = driver.findElement(By.id("yearbox"));
		Select s2 = new Select(year);
		s2.selectByIndex(79);
		WebElement month = driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		Select s3 = new Select(month);
		s3.selectByVisibleText("September");
		WebElement date = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
		Select s4 = new Select(date);
		s4.selectByValue("19");		
		//Explicit Wait:
		WebDriverWait wait = new WebDriverWait(driver,2);
		wait.until(ExpectedConditions.visibilityOf(date));
		driver.findElement(By.id("firstpassword")).sendKeys("123456");
		driver.findElement(By.id("secondpassword")).sendKeys("123456");
		TakesScreenshot screen = (TakesScreenshot)driver;
		File data =  screen.getScreenshotAs(OutputType.FILE);
		File save = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\wp.png");
		FileUtils.copyFile(data, save);
		driver.findElement(By.name("signup")).click();
		Thread.sleep(2000);
		driver.close();	
		
	}

}
