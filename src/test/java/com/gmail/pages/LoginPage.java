package com.gmail.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.gmail.utils.BaseClass;

public class LoginPage extends BaseClass
{
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	
	WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	
	WebElement login;
	
	@FindBy(xpath="//p[text()='Forgot Your Password? ']")
	
	WebElement forgotpassword;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getForgotpassword() {
		return forgotpassword;
	}
	
	
}

	
	
	

