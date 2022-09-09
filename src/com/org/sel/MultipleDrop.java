package com.org.sel;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDrop {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(multiple);
		boolean multi = s.isMultiple();
		System.out.println("isMultiple:"+ multi);
		s.selectByIndex(1);
		s.selectByValue("2");
		s.selectByVisibleText("Loadrunner");
		//getOPtions
		System.out.println("**getoptions**");
		List<WebElement> option = s.getOptions();
		//Using for each
	     //   Type   variable    Array
		for (WebElement all : option) {
		String text = all.getText();
		System.out.println(text);
		}
		Thread.sleep(1000);
		//get all selected options
		List<WebElement> selected = s.getAllSelectedOptions();
		for(WebElement picked : selected) {
		String text1 = 	picked.getText();
		System.out.println(text1);
		}
		//get First Selected Options
		WebElement first = s.getFirstSelectedOption();
		String text2 = first.getText();
		System.out.println(text2);
		TakesScreenshot take = (TakesScreenshot)driver;
		File source = take.getScreenshotAs(OutputType.FILE);
		File Destination = new File ("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\md.png1");
		FileUtils.copyFile(source, Destination);
		Thread.sleep(1000);
		driver.close();
		}
	
	}
