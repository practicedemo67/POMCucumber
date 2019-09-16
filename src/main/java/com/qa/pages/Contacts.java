package com.qa.pages;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;
import com.qa.util.TestUtil;

public class Contacts extends TestBase {
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contactsButton;
@FindBy(xpath="//button[text()='New']")
WebElement newButton;
@FindBy(xpath="//div[text()='Contacts']")
WebElement contactText;
@FindBy(xpath="//input[@name='first_name']")
WebElement firstname;
@FindBy(xpath="//input[@name='last_name']")
WebElement lastname;
@FindBy(xpath="//button[text()='Save']")
WebElement saveButton;
@FindBy(xpath="//span[text()='Home']")
WebElement Home;

public Contacts() {
	PageFactory.initElements(driver,this);
}
public void click_contacts() {
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("arguments[0].click();",contactsButton);
	TestUtil.implicitWait(driver);
}
public boolean verifyContactsPage() {
	return contactText.isDisplayed();
}
public void clickOnNew() {
	newButton.click();
	TestUtil.implicitWait(driver);
}
public void enterUserDetails(List<Map<String,String>> input) {
	for (Map<String,String> deal: input) {
		firstname.sendKeys(deal.get("FIRSTNAME"));
		lastname.sendKeys(deal.get("LASTNAME"));
		TestUtil.implicitWait(driver);
		saveButton.click();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].click();",contactsButton);
		TestUtil.implicitWait(driver);
		Home.click();
		TestUtil.implicitWait(driver);
		j.executeScript("arguments[0].click();",contactsButton);
		TestUtil.implicitWait(driver);
		newButton.click();
		TestUtil.implicitWait(driver);
	}
}
}
