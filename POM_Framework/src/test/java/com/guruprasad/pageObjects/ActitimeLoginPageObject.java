package com.guruprasad.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPageObject {
	
	public ActitimeLoginPageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement userName;
	
	@FindBy(name="pwd")
	private WebElement pwd;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;

	
	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
}
	
	
