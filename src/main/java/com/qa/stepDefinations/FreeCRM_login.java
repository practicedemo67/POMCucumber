package com.qa.stepDefinations;

import org.junit.Assert;

import com.qa.pages.Homepage;
import com.qa.pages.Login;
import com.qa.util.TestBase;
import com.qa.util.TestUtil;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class FreeCRM_login extends TestBase{
static Login login;
static Homepage homepage;

@Given("^initialize the browser and navigate to login page$")
public void initialize_the_browser_and_navigate_to_login_page(){
	TestBase.setup();
	login=new Login();
	String actualTitle=login.title();
	Assert.assertEquals("Free CRM #1 cloud software for any business large or small", actualTitle);
	TestUtil.implicitWait(driver); 
	login.navigateToLoginPage();
	String loginTitle=login.title();
	Assert.assertEquals("CRM", loginTitle);
	
}

@When("^user is using valid username and password$")
public void user_is_using_valid_username_and_password(){
	
	login.loginToHomepage();
	TestUtil.implicitWait(driver); 
   
}

@Then("^user is logged in to application successfully$")
public void user_is_logged_in_to_application_successfully(){
	homepage=new Homepage();
	TestUtil.implicitWait(driver);
   Boolean actual= homepage.verifyLogo();
   Assert.assertTrue(actual);
}

@Then("^user close the browser instance$")
public void user_close_the_browser_instance(){
  TestBase.logout();
   
}
}
