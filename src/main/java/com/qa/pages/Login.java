package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;
import com.qa.util.TestUtil;

public class Login extends TestBase{
	//webelements
@FindBy(xpath="//span[text()='Log In']")
WebElement login_button;
@FindBy(xpath="//input[@name='email']")
WebElement username;
@FindBy(xpath="//input[@name='password']")
WebElement password;
@FindBy(xpath="//div[text()='Login']")
WebElement submit_button;

//initialization
public Login() {
PageFactory.initElements(driver, this);
}
//actions on page elements
public void navigateToLoginPage() {
	login_button.click();
}
public void loginToHomepage() {
	username.sendKeys(p.getProperty("user"));
	password.sendKeys(p.getProperty("pword"));
	TestUtil.implicitWait(driver);
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("arguments[0].click();",submit_button);
}

public String title() {
	return driver.getTitle();
}

}