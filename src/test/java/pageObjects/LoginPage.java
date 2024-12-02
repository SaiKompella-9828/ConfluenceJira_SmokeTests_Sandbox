package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public WebDriver driver;
	public LoginPage(WebDriver driver) {

		this.driver=driver;

	}
	By LoginURL=By.xpath("//*[@id='react-container']/div/div[2]/a/span/span");
	By emailids=By.xpath("//*[@id='os_username']");
	By passwords=By.xpath("//*[@id='os_password']");
	By Login=By.xpath("//*[@id='loginButton']");
	By QualityIntelligence=By.xpath("//*[@id='rw_category_key_qi']/a/span[1]");

	public void clickloginurl() {
		driver.findElement(LoginURL).click();
	}
	public void emailidenter(String emailid) {
		driver.findElement(emailids).sendKeys(emailid);
	}
	public void passwordenter(String password) {
		driver.findElement(passwords).sendKeys(password);
	}
	public void loginclick() {
		driver.findElement(Login).click();
	}
	public String loginvalidation() {
		String ConfLoginValidation=driver.findElement(QualityIntelligence).getText();
		return ConfLoginValidation;
	}



}
