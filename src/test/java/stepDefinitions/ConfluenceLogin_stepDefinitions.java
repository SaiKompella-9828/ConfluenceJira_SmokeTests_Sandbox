package stepDefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import pageObjects.SearchFunctionalityClick;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class ConfluenceLogin_stepDefinitions {

	PageObjectManager pageObjectmanager;
	public TestContextSetup testContextSetup;
	public ConfluenceLogin_stepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}
	@Given("User is on Confluence Login Page")
	public void ConfluenceLoginPage() {
		LoginPage loginFunctionality=testContextSetup.pageObjectManager.getLoginPage();
		loginFunctionality.clickloginurl();
	}
	@When("^User should login through (.+) and (.+)$")
	public void EnterLoginCredentials(String username, String password) throws InterruptedException {
		LoginPage loginFunctionality=testContextSetup.pageObjectManager.getLoginPage();
		loginFunctionality.emailidenter(username);
		loginFunctionality.passwordenter(password);
		loginFunctionality.loginclick();
		Thread.sleep(3000);	
	}
	@Then("User is landed on the Confluence Home page")
	public void user_is_landed_on_the_confluence_home_page() throws InterruptedException {
		LoginPage loginFunctionality=testContextSetup.pageObjectManager.getLoginPage();
		String LoginValidation ="Quality Intelligence";
		String ValidateConfLogin=loginFunctionality.loginvalidation();
		Assert.assertEquals(LoginValidation, ValidateConfLogin);
	}
	

}
