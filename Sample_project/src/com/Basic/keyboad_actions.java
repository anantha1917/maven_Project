package com.Basic;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboad_actions {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		//driver.get("https://www.seleniumeasy.com/");
		System.out.println("Webpage opened");
		Thread.sleep(5000);
		WebElement gsearch= driver.findElement(By.name("q"));
		WebElement magni=driver.findElement(By.xpath("//div[@class='CcAdNb']"));
		Actions act=new Actions(driver);
		
		act.keyDown(gsearch,Keys.SHIFT).sendKeys("selenium").keyUp(gsearch,Keys.SHIFT)
		.keyDown(gsearch,Keys.CONTROL).sendKeys("a")
		.keyDown(gsearch,Keys.CONTROL).sendKeys("x")
		.keyUp(gsearch, Keys.CONTROL)
		.build().perform();
		
		Thread.sleep(3000);
		act.doubleClick(magni).perform();
		Thread.sleep(2000);
		
		driver.close();
		

	}

}
