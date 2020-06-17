package com.TestCase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Baseclass.Library;
import com.Pages.Facebook_register;
import com.SeleniumReusableFunction.Selenium_Utility_Function;


public class Facebook_register_Testcase extends Library  {

// change
	
	
	Facebook_register register;
	
	Selenium_Utility_Function utility;
	
	@BeforeClass

	public void startapp() {

		launchApplication("chrome","https://www.facebook.com/");
	}


	@Test

	public void register() {
		

	    register = new Facebook_register(driver);
	    
	    utility = new Selenium_Utility_Function(driver);

		register.name("adc");

		register.surname("efg");

		register.mail("adc@gmail.com");

		register.entermail("adc@gmail.com");

		register.pwd("asd");
		
		utility.dropdown("//*[@id='day']", "10");
		
//		register.dob("//*[@id='day']", "10");
//		
//		register.dob("//*[@id='month']", "4");
//		
//		register.dob("//*[@id='year']", "1996");
		
	
		utility.radiobutton("u_0_6");
		
		register.signup();
		

	}

@AfterClass
 public void tearup() throws IOException {
	 utility = new  Selenium_Utility_Function(driver);
	 
	 utility.screenshot("E:\\takescreen\\fb.png");
	 
	quit();
}





}
