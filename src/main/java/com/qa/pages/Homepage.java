package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;
import com.qa.util.TestUtil;

public class Homepage extends TestBase {
	@FindBy(xpath ="//div[@class='header item']")
	WebElement logo;
	@FindBy(className="user-display")
	WebElement login_user;
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contacts;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	public boolean verifyLogo() {
		return logo.isDisplayed();
	}
	public String verify_user() {
		return login_user.getText();
	}
	public void navigateToContacts() {
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].click();",contacts);
		TestUtil.implicitWait(driver);
	}
}
