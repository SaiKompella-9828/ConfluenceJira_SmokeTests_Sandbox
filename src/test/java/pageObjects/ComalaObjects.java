package pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComalaObjects {
	public WebDriver driver;
	public ComalaObjects(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By InternalArticles=By.xpath("//a[@title='Internal Articles - Service Desk']");
	By JiraAssignmentgroup=By.xpath("//div/a[@title='JIRA ENTERPRISE APPLICATION SERVICE DESK'][1]");
	By JiraConfluence=By.xpath("//a[@title='JiraET CONFLUENCE']");
	By Prod_Testing=By.xpath("//a[@title='QA TESTING']");
	By plusSign=By.xpath("//*[@id='create-page-button']");
	By HowToArticle=By.xpath("//*[text()='How-to article']");
	By Next=By.xpath("//*[text()='Next']");
	By KbArticleTitle=By.xpath("//input[@id='kb-article-title']");
	By CreateButton=By.xpath("//button[text()='Create']");
	By SavingPage=By.xpath("//*[@id='rte-button-publish']");
	By EditPage=By.xpath("//*[@id='editPageLink']/span");
	By PageTitle=By.xpath("//*[@id='content-title']");
	By PageDescription=By.xpath("//*[@id='tinymce']/p/br");
	By VersionComm=By.xpath("//input[@id='versionComment']");
	By Content=By.xpath("//*[@id='tinymce']");
	
	By attachments=By.xpath("//*[@id='view-attachments-link']");
	By Attach=By.xpath("//*[@id='edit']");
	By AttachmentClick=By.xpath("//*[@id='view-attachments']/table/tbody/tr[2]/td[2]/a");
	By AttachmentDownload=By.xpath("//*[@id='cp-container-1']/div[1]/div[2]/span[2]/a");
	By AttachmentPageClose=By.xpath("//*[@id='cp-container-1']/div[1]/div[2]/span[6]/button");
	By ViewPage=By.xpath("//*[@id='viewPageLink']");
	By CommentBox=By.xpath("//div[@class='quick-comment-prompt']");
	By CommentFrame=By.xpath("//*[@title='Rich Text Area']");
	By CommentBody=By.xpath("//*[@id='tinymce']/p");
	By InsertMenu=By.xpath("//li[@id='insert-menu']");
	By JiraIssueFilter=By.xpath("//*[@id='jiralink']");
	By IssueKeyFilter=By.xpath("//*[@class='inline']/div/input");
	By InsertButton=By.xpath("//*[@id='jira-connector']/div/div[2]/button");
	By VersionComment=By.xpath("//input[@id='versionComment']");
	By  PageHistory=By.xpath("//*[@id='action-view-history-link']");
	By  Draft=By.xpath("//*[(text() = 'Draft')]");
	By  WorkFlowFrame=By.xpath("//iframe[@class='cml-iframe']");
	By  submit=By.xpath("//*[text()='Submit']");
	By  Ready=By.xpath("//a[text()='Ready']");
	By  WorkFlowComments=By.xpath("//textarea[@name='comment']");
	By ThreeDotsIcon=By.xpath("//*[@id='action-menu-link']");
	By  Delete=By.xpath("//a[@id='action-remove-content-link']");
	By DeleteButton=By.xpath("//button[@id='delete-dialog-next']");
	By SandBox_Testing=By.xpath("//a[@title='TESTING']");


	public void Differentiation() {
		String URLs=driver.getCurrentUrl();
		if(URLs.contains("sandbox")) {
		internalArticles();
		JiraAssignmentGroup();
		Sandbox_Testing();
		}
		else {
			internalArticles();
			JiraAssignmentGroup();
			Jira_Confluence();
			Prod_Testing();
			
		}
	}
	


	public void ThreeDotsIcon() {
		driver.findElement(ThreeDotsIcon).click();
	}
	public void ComalaPageCreation() throws InterruptedException{
		driver.findElement(plusSign).click();
		Thread.sleep(6000);
		driver.findElement(HowToArticle).click();
		Thread.sleep(3000);
		driver.findElement(Next).click();
		Thread.sleep(3000);
		driver.findElement(KbArticleTitle).sendKeys("Testing Comala Document Manager");
		Thread.sleep(6000);
		driver.findElement(CreateButton).click();
	}
	
	public void ComalaPageEdit() throws InterruptedException, AWTException{
		driver.switchTo().frame("wysiwygTextarea_ifr");
		driver.findElement(Content).clear();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		driver.findElement(SavingPage).click();
		driver.findElement(EditPage).click();
		driver.switchTo().frame("wysiwygTextarea_ifr");
		driver.findElement(PageDescription).sendKeys("Comala Page Edit_001");
		driver.switchTo().parentFrame();
		driver.findElement(SavingPage).click();
		driver.findElement(EditPage).click();
		driver.findElement(PageTitle).clear();
		driver.findElement(PageTitle).sendKeys("Comala Page Edit_001_Updated");
		driver.findElement(VersionComm).sendKeys("Comala Page Edit_002");
		driver.findElement(SavingPage).click();
		driver.findElement(ThreeDotsIcon).click();
	}
	public void internalArticles() {
		driver.findElement(InternalArticles).click();
	}
	public void JiraAssignmentGroup() {
		driver.findElement(JiraAssignmentgroup).click();
	}
	public void Jira_Confluence() {
		driver.findElement(JiraConfluence).click();
	}
	public void Prod_Testing() {
		driver.findElement(Prod_Testing).click();
	}
	
	public void Sandbox_Testing() {
		driver.findElement(SandBox_Testing).click();
	}
	public void AttachmentCode() throws InterruptedException, AWTException {
		driver.findElement(attachments).click();
		Thread.sleep(2000);
		WebElement button=driver.findElement(By.xpath("//*[@id='upload-files']/ol/li[1]/div[1]/label"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",button);
		Thread.sleep(5000);
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(5000);
		StringSelection ss= new StringSelection("C:\\Users\\sai.kompella\\OneDrive - Cotiviti\\Desktop\\All Mine\\PRODUCTION OPERATIONS.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(Attach).click();
		Thread.sleep(5000);
		driver.findElement(AttachmentClick).click();
		Thread.sleep(3000);
		driver.findElement(AttachmentDownload).click();
		Thread.sleep(3000);
		driver.findElement(AttachmentPageClose).click();
		System.out.println("Attachment added & downloaded Successfully");
		System.out.println("***********************************************************************");
		driver.findElement(ViewPage).click();
	}


	public void commentsCode() throws InterruptedException {
		driver.findElement(CommentBox).click();
		Thread.sleep(2000);
		driver.switchTo().frame("wysiwygTextarea_ifr");
		driver.findElement(CommentBody).sendKeys("testing comments");
		driver.switchTo().parentFrame();
		driver.findElement(SavingPage).click();
		Thread.sleep(2000); 
		System.out.println("Comments added Successfully");
		System.out.println("***********************************************************************");
	}

	public void JiraIntegration() throws InterruptedException {
		driver.navigate().refresh();
		driver.findElement(EditPage).click();
		driver.findElement(InsertMenu).click();
		driver.findElement(JiraIssueFilter).click();
		driver.findElement(IssueKeyFilter).sendKeys("IT-1329149",Keys.ENTER);
		Thread.sleep(7000);
		driver.findElement(InsertButton).click();
		Thread.sleep(2000);
		driver.findElement(SavingPage).click();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}

	public void PageVersionHistory() throws InterruptedException {
		driver.navigate().refresh();
		driver.findElement(ThreeDotsIcon).click();
		driver.findElement(PageHistory).click();
		System.out.println("Page Version History");
		List<WebElement> VersionList= this.driver.findElements(By.xpath("//table[@id='page-history-container']/tbody/tr"));
		if( VersionList.size()>=1) {
			for(int i=0; i< VersionList.size();i++)	{		
				System.out.println(VersionList.get(i).getText());
			}
		}
		driver.findElement(ViewPage).click();
		driver.navigate().refresh();
		}
	
	public void DocumentApprovalFlow() throws InterruptedException, AWTException {
		driver.findElement(Draft).click();
		Thread.sleep(4000);
		driver.switchTo().frame("cw-state-byline_dialog_iframe_iframe");
	    driver.findElement(submit).click();
		driver.switchTo().parentFrame();
		String CurrentPageurl = driver.getCurrentUrl();
		if(CurrentPageurl.contains("page")) {
			driver.get(CurrentPageurl+"&admin=true");
		}else {
			driver.get(CurrentPageurl+"?admin=true");
		}
		Thread.sleep(3000);
		driver.findElement(Ready).click();
		driver.switchTo().frame("cw-state-byline_dialog_iframe_iframe");
		Thread.sleep(2000);
		driver.findElement(WorkFlowComments).sendKeys("Reviewed");
		driver.findElement(submit).click();     //reviewed
		Thread.sleep(4000);
		driver.findElement(WorkFlowComments).click();
		Robot rob= new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyPress(KeyEvent.VK_DELETE);
		Thread.sleep(3000); 
		driver.findElement(WorkFlowComments).sendKeys("Published");
		driver.findElement(submit).click();     //publish
		driver.switchTo().parentFrame();
		driver.navigate().refresh();
	}
	
	 public void pageDelete() throws InterruptedException { 
		 driver.findElement(ThreeDotsIcon).click();
			driver.findElement(Delete).click(); 
			Thread.sleep(2000); 
			driver.findElement(DeleteButton).click(); 
			}
}




