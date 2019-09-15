package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class Homepage extends TestBase {
	@FindBy(xpath ="//div[@class='header item']")
	WebElement logo;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	public boolean verifyLogo() {
		return logo.isDisplayed();
	}
}
