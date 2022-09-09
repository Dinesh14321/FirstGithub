package com.week.two;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		//All data in Table:
		List<WebElement> data = driver.findElements(By.xpath("//table/tbody/tr/td"));
		//For Each:
		for(WebElement all : data) {
			System.out.println(all.getText());
		}
		//Specific row in table:
		System.out.println("**Row**");
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[7]/td"));
		for(WebElement rowvalue : rowdata) {
			System.out.println(rowvalue.getText());
		}
		//Specific column in table:
		System.out.println("**Column**");
		List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr[7]/td"));
		for(WebElement columnvalue : columndata) {
			System.out.println(columnvalue.getText());
		}
		//Specific data:
		System.out.println("**Specific data**");
		WebElement specificdata = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[3]"));
		System.out.println(specificdata.getText());
		Thread.sleep(2000);
		
		//TestLeaf:
		
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		Thread.sleep(1000);
		
		List<WebElement> tables = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for(WebElement alldata : tables) {
		//String texts = alldata.getText();
		System.out.println(alldata.getText());
		//Specific row in table:
		//ist<WebElement> locator = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		//for(WebElement loco : locator) {
			//System.out.println(loco.getText());
		}
			
		}
	
	}

