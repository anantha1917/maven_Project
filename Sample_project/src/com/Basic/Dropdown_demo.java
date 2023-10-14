package com.Basic;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown_demo {
	
	public WebDriver driver;
	
	public void launch() throws InterruptedException
	{
		

		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.seleniumeasy.com/");
		//driver.get("https://www.seleniumeasy.com/");
		System.out.println("Webpage opened");
		Thread.sleep(5000);
	}
	
	public void Dropdowns() throws InterruptedException
	{
			
		driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();		
		List<WebElement> moreoptions= driver.findElements(By.xpath("((//ul[@class='dropdown-menu'])[0])"));
		
		for(WebElement ele : moreoptions)
		{
			String value=ele.getText();
			System.out.println(value);
			
			/*
			 * if(value.equalsIgnoreCase("JMeter Tutorials")) { ele.click(); break; }
			 */
		}
		
		Thread.sleep(5000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		
		Dropdown_demo obj= new Dropdown_demo();
		obj.launch();
		obj.Dropdowns();
				
				
	}

}
