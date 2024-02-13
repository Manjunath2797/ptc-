package com.tyss.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyTest {
	public WebDriver driver;
	@Test
	public void myTest()
	{
		String BROWSER = System.getProperty("browser");
		String URL = System.getProperty("url");
		
		if(BROWSER.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}else {
			driver=new ChromeDriver();
		}
		
		driver.get(URL);
	}
}