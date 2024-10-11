package com.gmail.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{

	public static WebDriver driver;
	
	public static WebDriver Webbrowser(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			
			driver=new EdgeDriver();
		}
		return driver;
	}
	public void openurl(String url)
	{
		driver.get(url);
	}
	public void maxi()
	{
		driver.manage().window().maximize();
	}
	public void iwait(int duration)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}
	public void sendvalue(WebElement element,String value)
	{
		element.sendKeys(value);
	}
	public void tap(WebElement element)
	{
		element.click();
	}
}
