package com.qa.util;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	public static Properties p;
	public static WebDriver driver;
	public TestBase() {
		p=new Properties();
		try {
			FileInputStream fis = new FileInputStream(".\\src\\main\\java\\com\\qa\\config\\config.properties");
			p.load(fis);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
public static void setup() {
	String browser=p.getProperty("browser");
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", ".\\src\\main\\java\\com\\qa\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
	} else if(browser.equalsIgnoreCase("IE")){
		System.setProperty("webdriver.ie.driver", ".\\src\\main\\java\\com\\qa\\resources\\IEDriver.exe");
		driver=new InternetExplorerDriver();
	}else if(browser.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver", ".\\src\\main\\java\\com\\qa\\resources\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	TestUtil.pageloadtimeout(driver);
	TestUtil.implicitWait(driver);
	driver.get(p.getProperty("URL"));
	TestUtil.implicitWait(driver);
}
public static void logout() {
	driver.quit();
}
}
