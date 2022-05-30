package com.guruprasad.helper;

import java.time.Duration;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	WebDriverWait wait;
	
	public WaitHelper(WebDriver driver, int timeInSec) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
	}
	
	public void waitForEleToBeDisplayed(WebElement ele) {
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void waitForEleToClickable(WebElement ele) {
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public void waitForEleToBePresentIgnoringStaleEleException(WebElement ele) {
		wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOf(ele));
	}
	
	public void pause(int timeInSec) {
		try {
			Thread.sleep(timeInSec*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
