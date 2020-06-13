package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Baseclass.Library;




public class Facebook_register extends Library {
	
	@FindBy(id="u_0_m")
    WebElement firstname;
	
	@FindBy(id="u_0_o")
	WebElement surname;
	
	@FindBy(id="u_0_r")
	WebElement emailaddress;
	
	@FindBy(name="reg_email_confirmation__")
	WebElement confirmemail;
	
	@FindBy(name="reg_passwd__")
	WebElement password;
	
	@FindBy(xpath="//*[@id='day']")
	WebElement day;
	
	
	
	
public Facebook_register (WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public void name(String fname) {
		
		firstname.sendKeys(fname);
		
	}
	
public void surname(String sname) {
		
		surname.sendKeys(sname);
		
}

public void mail(String email) {
	
	emailaddress.sendKeys(email);
}

public void entermail(String confirmid) {
	
	confirmemail.sendKeys(confirmid);
	
}


public void pwd(String pass) {
	
	password.sendKeys(pass);
	
}



public void dob(String locator, String value) {
	
	 Select drop= new Select(driver.findElement(By.xpath(locator)));
	  drop.selectByValue(value);
}






}

	
	
	
	

	


