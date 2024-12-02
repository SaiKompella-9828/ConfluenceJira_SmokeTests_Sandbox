package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public WebDriver driver;
	public LoginPage loginFunctionality;
	public SearchFunctionalityClick SClick;
	public AtlassianObjects AObj;
	public ComalaObjects ComalaObj;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage getLoginPage() {
		loginFunctionality=new LoginPage(driver);
		return loginFunctionality;
	}
	public SearchFunctionalityClick getSearchClick() {
		SClick=new SearchFunctionalityClick(driver);
		return SClick;
	}
	public AtlassianObjects getAtlassianObjects() {
		AObj=new AtlassianObjects(driver);
		return AObj;
	}
	
	public ComalaObjects getComalaObjects() {
		ComalaObj=new ComalaObjects(driver);
		return ComalaObj;
	}
}
