package test_fbLoging;

import locators.fb_login_loc;

import org.testng.annotations.Test;

import values.fb_login_values;
import base.config;

public class TC2_LoginWithInvalidPassword extends config{
	
	fb_login_loc logIn = new fb_login_loc();
	fb_login_values logInV = new fb_login_values();
	
	@Test
	public void test_fbLoginWithInvalidPassword(){
		
		// enter email or phone number
		typeByXpath (logIn.emailPhone, logInV.emailPhone_value);
		// enter password
		typeByXpath (logIn.password, logInV.password_invalid_value);
		// click on login button
		clickByXpath (logIn.loginButton);
		
		// assertion - verify if user able to see invalid inline validation error message
		
		
	}

}