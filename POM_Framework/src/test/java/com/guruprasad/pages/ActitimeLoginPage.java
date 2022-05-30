package com.guruprasad.pages;

import org.openqa.selenium.WebDriver;

import com.guruprasad.helper.CommonActionHelper;
import com.guruprasad.helper.WaitHelper;
import com.guruprasad.pageObjects.ActitimeLoginPageObject;
import com.guruprasad.pageObjects.HomePageObject;

public class ActitimeLoginPage {
	CommonActionHelper commonActionHelper;
	WaitHelper waitHelper;
	ActitimeLoginPageObject actitimeLoginPageObject;
	public ActitimeLoginPage(WebDriver driver, int explicitWaitTimeInSec) {
		commonActionHelper = new CommonActionHelper(driver);
		waitHelper = new WaitHelper(driver, explicitWaitTimeInSec);
		actitimeLoginPageObject = new ActitimeLoginPageObject(driver);
	}
	
	public void loginIntoApplication(String userName, String pwd) {
		commonActionHelper.enterText(actitimeLoginPageObject.getUserName(),userName);
		commonActionHelper.enterText(actitimeLoginPageObject.getPwd(), pwd);
		commonActionHelper.clickOnElement(actitimeLoginPageObject.getLoginBtn());
	}

}
