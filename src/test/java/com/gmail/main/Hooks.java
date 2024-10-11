package com.gmail.main;

import org.openqa.selenium.WebDriver;

import com.gmail.utils.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass
{

	public static WebDriver driver;
	
	@Before
	public void launch()
	{
		driver=Webbrowser("Chrome");
	}
	@After
	public void clo()
	{
		driver.close();
	}
}
