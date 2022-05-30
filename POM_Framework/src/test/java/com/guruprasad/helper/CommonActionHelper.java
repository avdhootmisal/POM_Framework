package com.guruprasad.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonActionHelper {
	
	WebDriver driver;
	WaitHelper waitHelper;
	public CommonActionHelper(WebDriver driver) {
		this.driver = driver;
		waitHelper = new WaitHelper(driver, 30);
	}
	
	public void clickOnElement(WebElement ele) {
		waitHelper.waitForEleToBeDisplayed(ele);
		ele.click();
	}
	
	public void enterText(WebElement ele, String value) {
		waitHelper.waitForEleToBeDisplayed(ele);
		ele.sendKeys(value);
	}
	public void enterTextByClearingExisting(WebElement ele, String value) {
		waitHelper.waitForEleToBeDisplayed(ele);
		ele.clear();
		ele.sendKeys(value);
	}

	public String getTitleOfThePage() {
		return driver.getTitle();
	}
}
