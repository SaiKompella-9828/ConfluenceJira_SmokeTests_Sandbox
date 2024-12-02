package stepDefinitions;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pageObjects.ComalaObjects;
import pageObjects.PageObjectManager;
import pageObjects.SearchFunctionalityClick;
import utils.TestContextSetup;

public class ComalaSmokeTest_stepDefinitions {
	PageObjectManager pageObjectmanager;
	public TestContextSetup testContextSetup;
	public SearchFunctionalityClick SearchFunctionality;
	public ComalaObjects ComalaObject;
	public WebDriver driver;
	public ComalaSmokeTest_stepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		SearchFunctionality=testContextSetup.pageObjectManager.getSearchClick();
		ComalaObject=testContextSetup.pageObjectManager.getComalaObjects();
	}
	
	
	@Then("User Checks all Comala Related Functionality")
	public void user_checks_all_comala_related_functionality() throws InterruptedException, AWTException {
		ComalaObject.internalArticles();
		ComalaObject.JiraAssignmentGroup();
		//ComalaObject.Jira_Confluence();
		Thread.sleep(2000);
		ComalaObject.Sandbox_Testing();
		ComalaObject.ComalaPageCreation();
		ComalaObject.ComalaPageEdit();
		ComalaObject.AttachmentCode();
		ComalaObject.commentsCode();
		ComalaObject.JiraIntegration();
		ComalaObject.PageVersionHistory();
		ComalaObject.DocumentApprovalFlow();
		ComalaObject.pageDelete();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
