package com.guruprasad.pages;

import org.openqa.selenium.WebDriver;

import com.guruprasad.helper.CommonActionHelper;
import com.guruprasad.helper.WaitHelper;
import com.guruprasad.pageObjects.HomePageObject;

public class HomePage {
	CommonActionHelper commonActionHelper;
	WaitHelper waitHelper;
	HomePageObject homePageObject;
	
	public HomePage(WebDriver driver, int explicitWait) {
		commonActionHelper = new CommonActionHelper(driver);
		waitHelper = new WaitHelper(driver, explicitWait);
		homePageObject = new HomePageObject(driver);
	}
	
	public void logoutFromApplication() {
		commonActionHelper.clickOnElement(homePageObject.getLogoutLink());
	}
}
