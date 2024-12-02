package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchFunctionalityClick {
	public WebDriver driver;
	public SearchFunctionalityClick(WebDriver driver) {
		this.driver=driver;
	}
	
	By SDHomeSearch=By.xpath("//*[@id='rw_search_query']");
	By SDHomeEnter=By.xpath("//*[@id='search-filter-input']");
	By SDHomeClick=By.xpath("//*[@id='search-result-container']/div[2]/a[1]/div[2]/div[1]");
	
	public void SearchClick() {
		driver.findElement(SDHomeSearch).click();
	}
	public void SearchTextEnter(String emailid) {
		driver.findElement(SDHomeEnter).sendKeys(emailid);
	}
	public void SDHClick() {
		driver.findElement(SDHomeClick).click();
	}

}
