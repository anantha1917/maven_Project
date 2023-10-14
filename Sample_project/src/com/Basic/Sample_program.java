package com.Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_program {

	public static void main(String[] args) throws InterruptedException   {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.seleniumeasy.com/");
		
		System.out.println("Webpage opened");
		
		Thread.sleep(5000);
		
	
		
		driver.findElement(By.xpath("//a[normalize-space()='Maven']")).click();
		Thread.sleep(3000);
		
		System.out.println("Demo home clicked");
		//driver.findElement(By.linkText(" Start Practising")).click();
		
		
		driver.close();
		
		System.out.println("restarting the topics");
		
	}

}
