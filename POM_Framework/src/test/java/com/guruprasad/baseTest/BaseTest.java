package com.guruprasad.baseTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.guruprasad.helper.CommonActionHelper;
import com.guruprasad.helper.PropertiesFileHelper;
import com.guruprasad.pages.ActitimeLoginPage;
import com.guruprasad.pages.HomePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseTest {

	public WebDriver driver;
	public PropertiesFileHelper properties;
	public int explicitWaitTimeInSec;
	public CommonActionHelper commonActionHelper;
	public BaseTest() {
		properties = new PropertiesFileHelper(System.getProperty("user.dir") + "\\src\\test\\java\\com\\guruprasad\\config\\config.properties");
		initialization();
		explicitWaitTimeInSec = Integer.parseInt(properties.getPropFileValue("explicitWait"));
		commonActionHelper = new CommonActionHelper(driver);
	}
	
	@SuppressWarnings("deprecation")
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(properties.getPropFileValue("url"));
	}
}
