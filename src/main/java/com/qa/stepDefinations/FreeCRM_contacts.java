package com.qa.stepDefinations;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.qa.pages.Contacts;
import com.qa.util.TestBase;
import com.qa.util.TestUtil;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FreeCRM_contacts extends TestBase{
	Contacts contact=new Contacts();
	@When("^Customer click contacts option$")
	public void customer_click_contacts_option() {
	  TestUtil.implicitWait(driver);  
	  contact.click_contacts();
	  TestUtil.implicitWait(driver);
	}

	@Then("^customer navigate to contact page$")
	public void customer_navigate_to_contact_page() {
	    Boolean result=contact.verifyContactsPage();
	   Assert.assertTrue(result);
	}

	@Then("^customer clicks on New button$")
	public void customer_clicks_on_New_button() {
	    contact.clickOnNew();   
	}

	@Then("^customer enters firstname and lastname and save changes$")
	public void customer_enters_firstname_and_lastname(DataTable data) {
	    List<Map<String,String>> input=data.asMaps(String.class,String.class);
	    contact.enterUserDetails(input);
	   
	}

}
