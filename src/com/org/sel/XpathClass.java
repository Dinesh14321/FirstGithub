package com.org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathClass {
//Using WebElement method to navigate from one page to another page and get access to fill the check boxes. 
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject\\DemoSection\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//1.tagName[@Attributename ='attributevalue']
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("dineshrpcg@gmail.com");
		
		//2.tagName[contains(@attributename,'attributevalue')]
		WebElement password = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
		password.sendKeys("Dinesh@9");
		
		//3.(//tagName[@attributedname='attributedvalue')[index]
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		driver.navigate().refresh();
		//4.//tagName[contains(text(),'half of the text')]
		WebElement forgot = driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]"));
		forgot.click();
		Thread.sleep(1500);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().back();
		//5.//tagName[text()='full text']
		WebElement newacc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		newacc.click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
