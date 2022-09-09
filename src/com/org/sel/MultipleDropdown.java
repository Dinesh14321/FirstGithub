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

public class MultipleDropdown {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement single = driver.findElement(By.xpath("(//select)[1]"));
		single.click();
		Select s1 = new Select(single);
		s1.selectByIndex(1);
		WebElement second = driver.findElement(By.xpath("(//select)[2]"));
		second.click();
		Select s2 = new Select(second);
		s2.selectByIndex(2);
		WebElement third = driver.findElement(By.xpath("(//select)[3]"));
		third.click();
		Select s3 = new Select(third);
		s3.selectByIndex(3);
		TakesScreenshot take = (TakesScreenshot) driver;
		File Sources = take.getScreenshotAs(OutputType.FILE);
		File Dentinations = new File ("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\md.png1");
		FileUtils.copyFile(Sources, Dentinations);
		//Multiple dropdown
		WebElement multiple = driver.findElement(By.xpath("(//select)[6]"));
		Select s = new Select(multiple);
		boolean multi = s.isMultiple();
		System.out.println("is multiple:"+multi);
		s.selectByIndex(1);
		s.selectByValue("2");
		s.selectByVisibleText("Loadrunner");
		s.deselectByIndex(1);
		//getOPtions();		
		System.out.println("****get Options****");
		List<WebElement> options = s.getOptions();
		for (WebElement total : options) {
		String text = total.getText();
	    System.out.println(text);	    
	   }
		//get all Selected options();
		System.out.println("****get all selected options****");
		List<WebElement> allOptions = s.getAllSelectedOptions();
		for(WebElement selected : allOptions) {
		String text1 = selected.getText();
		System.out.println(text1);			
		}
		
		//get first selected option();		
		System.out.println("****get first selected option****");
		WebElement first = s.getFirstSelectedOption();
		String text2 = first.getText();
		System.out.println(text2);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File main = ts.getScreenshotAs(OutputType.FILE);
		File store = new File("C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\md.png");
		FileUtils.copyFile(main, store);
				
		Thread.sleep(1000);
		driver.close();
		
	}

}
