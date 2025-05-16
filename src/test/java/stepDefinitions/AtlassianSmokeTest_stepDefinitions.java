package stepDefinitions;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import pageObjects.AtlassianObjects;
import pageObjects.PageObjectManager;
import pageObjects.SearchFunctionalityClick;
import utils.TestContextSetup;

public class AtlassianSmokeTest_stepDefinitions {

	PageObjectManager pageObjectmanager;
	public TestContextSetup testContextSetup;
	public SearchFunctionalityClick SearchFunctionality;
	public AtlassianObjects AtlassianObject;
	public WebDriver driver;

	public AtlassianSmokeTest_stepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		SearchFunctionality=testContextSetup.pageObjectManager.getSearchClick();
		AtlassianObject=testContextSetup.pageObjectManager.getAtlassianObjects();
	}

	@Then("User Performs Search Functionality with {string} text")
	public void service_deliver_home_page_is_displayed_and_it_should_be_clickable(String searchtext) throws InterruptedException {
		SearchFunctionality.SearchClick();
		SearchFunctionality.SearchTextEnter(searchtext);
		SearchFunctionality.SDHClick();
	}

	@Then("User Checks all Atlassian Related Functionality")
	public void AtlassianSmoke() throws InterruptedException {
		AtlassianObject.Differentiation();
		Thread.sleep(2000);
		AtlassianObject.PlusSign();
		Thread.sleep(10000);
		AtlassianObject.ShowMore();
		Thread.sleep(6000);
		AtlassianObject.BlankPage();
		Thread.sleep(6000);
		AtlassianObject.CreatePage();
		System.out.println("Atlassian Page Created");
	}
	public void newPage() throws InterruptedException {

		AtlassianObject.PlusSign();
		Thread.sleep(3000);
		AtlassianObject.ShowMore();
		Thread.sleep(3000);
		AtlassianObject.BlankPage();
		Thread.sleep(3000);
		AtlassianObject.CreatePage();
		Thread.sleep(3000);
	}
	@Then("User should be able to perform Page Updates")
	public void AtlassianSmoke_AfterPageCreation() throws InterruptedException, AWTException {
		AtlassianObject.PageUpdates();
		Thread.sleep(3000);
		AtlassianObject.ThreeDotsIcon();
		Thread.sleep(3000);
		AtlassianObject.AttachmentCode();
		Thread.sleep(3000);
		AtlassianObject.commentsCode();
		Thread.sleep(3000);
		AtlassianObject.JiraIntegration();
		Thread.sleep(3000);
		AtlassianObject.PageVersionHistory();
		Thread.sleep(3000);
		newPage();
		Thread.sleep(3000);
		AtlassianObject.duplicatepagedescription();
		Thread.sleep(8000);

	}








}
