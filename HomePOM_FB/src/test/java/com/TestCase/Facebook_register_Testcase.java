package com.TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Baseclass.Library;
import com.Pages.Facebook_register;


public class Facebook_register_Testcase extends Library  {

// change
	
	@BeforeClass

	public void startapp() {

		launchApplication("chrome","https://www.facebook.com/");
	}


	@Test

	public void register() {
		

		Facebook_register register = new Facebook_register(driver);

		register.name("adc");

		register.surname("efg");

		register.mail("adc@gmail.com");

		register.entermail("adc@gmail.com");

		register.pwd("asd");
		
		register.dob("//*[@id='day']", "10");
		
		register.dob("//*[@id='month']", "4");
		
		register.dob("//*[@id='year']", "1996");
		
		register.sex("u_0_6");
		
		register.signup();
		

	}

@AfterClass
 public void tearup() {
	
	quit();
}





}
