package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBase {

	public WebDriver driver;

	public WebDriver WebDriverManager() throws IOException, InterruptedException {

		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//Login.properties");
		Properties prop=new Properties();
	    prop.load(fis);
		String URL=prop.getProperty("confluenceURL");
		if(prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		}
		return driver;
	}

}



