package com.guruprasad.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject {
	
	public HomePageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;

	public WebElement getLogoutLink() {
		return logoutLink;
	}
}
