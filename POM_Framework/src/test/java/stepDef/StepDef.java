package stepDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import com.guruprasad.baseTest.BaseTest;
import com.guruprasad.pages.ActitimeLoginPage;
import com.guruprasad.pages.HomePage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDef extends BaseTest{
	
	ActitimeLoginPage actitimeLoginPage;
	HomePage homePage;
	public StepDef() {
		actitimeLoginPage = new ActitimeLoginPage(driver, explicitWaitTimeInSec);
		homePage = new HomePage(driver, explicitWaitTimeInSec);
	}
	
	@Given("user should be on {string}")
	public void user_should_be_on(String expTitleOfThePage) {
		if (driver.getTitle().contains(expTitleOfThePage))
			System.out.println("expTitleOfThePage is- "+expTitleOfThePage + "		PASS");
		else 
			System.out.println("expTitleOfThePage is- "+expTitleOfThePage + "		FAIL");
	}
		
	@Then("user enters username and password")
	public void user_enters_username_and_password() {
		actitimeLoginPage.loginIntoApplication(properties.getPropFileValue("userName"), properties.getPropFileValue("password"));
	}
	
	@Then("page title should be display as {string}")
	public void page_title_should_be_display_as(String expTitleOfThePage) {
		if (driver.getTitle().contains(expTitleOfThePage))
			System.out.println("expTitleOfThePage is- "+expTitleOfThePage + "		PASS");
		else 
			System.out.println("expTitleOfThePage is- "+expTitleOfThePage + "		FAIL");
	}
	
	@Then("user clicks on logout")
	public void user_clicks_on_logout() {
		homePage.logoutFromApplication();
	}
}
