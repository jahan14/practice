package com.gmail.main;

import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import com.gmail.pages.LoginPage;
import com.gmail.utils.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orangealogin extends BaseClass
{
	
	public static WebDriver driver;
	
	LoginPage l;
	


	@Given("open the Orange HRM Login Page")
	public void open_the_orange_hrm_login_page() 
	{
		l=new LoginPage();
	
		openurl("https://opensource-demo.orangehrmlive.com/auth/login");
		
		maxi();
		
		iwait(30);
	}

	@When("Enter the valid {string} and {string}")
	public void enter_the_valid_and(String username, String password) 
	{
	
		sendvalue(l.getUsername(), username);
		
		sendvalue(l.getPassword(), password);
	}

	@When("click the login button")
	public void click_the_login_button() 
	{
	
		tap(l.getLogin());
	}

	@Then("I validate the user profile name")
	public void i_validate_the_user_profile_name() 
	{
	
		System.out.println("Validation Completed");
	}
	


	

}
