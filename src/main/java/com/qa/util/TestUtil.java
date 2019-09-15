package com.qa.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class TestUtil{
	public static void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
public static void pageloadtimeout(WebDriver driver) {
	driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
}
