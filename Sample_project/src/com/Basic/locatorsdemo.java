package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsdemo {
	

	public static void main(String[] args) {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("http:\\demo.seleniumeasy.com");
		
	
	
		

	}

}
