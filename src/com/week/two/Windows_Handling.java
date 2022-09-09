package com.week.two;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.awt.AWTException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Windows_Handling {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//Index 1
		WebElement grocery = driver.findElement(By.xpath("//img[@alt='Grocery']"));
		//Actions
		Actions gro = new Actions(driver);
		//Context click (or) Right click:
		gro.contextClick(grocery).build().perform();
		//Robot
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		//Index 2
		WebElement travel = driver.findElement(By.xpath("//img[@alt='Travel']"));
		gro.contextClick(travel).build().perform();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		//Index 3
		WebElement offer = driver.findElement(By.xpath("//img[@alt='Top Offers']"));
		gro.contextClick(offer).build().perform();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		//getWindowHandles
		Set<String> windowHandles = driver.getWindowHandles();
		//forEach
		for(String id : windowHandles) {
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);
		}
		String off = "Get Best Discounts on Mobiles, Electronics, Fashion & Home etc.";
		for (String id1 : windowHandles) {
		//condition
		Thread.sleep(1000);
		TakesScreenshot shot = (TakesScreenshot)driver;
		File save = shot.getScreenshotAs(OutputType.FILE);
		File store = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\flip.png");
		FileUtils.copyFile(save, store);
		if(driver.switchTo().window(id1).getTitle().equals(off));
		break;
}
		
		}
	
}
