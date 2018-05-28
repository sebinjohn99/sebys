package vsts;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_1 {

	 
@Test
	public void sample() {
	
   System.setProperty("webdriver.chrome.driver", "D:/Selenium/chromedriver.exe");
   WebDriver driver =new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://google.co.in");
   System.out.println("Google Loaded");
	  driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("VSTS");
	  driver.findElement(By.xpath("//input[@value='Google Search']")).click();
   	  System.out.println(driver.getTitle());
   }
}
