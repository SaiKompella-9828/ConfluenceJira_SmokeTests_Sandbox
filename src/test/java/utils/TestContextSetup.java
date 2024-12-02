package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
public PageObjectManager pageObjectManager;
public WebDriver driver;
public testBase TestBase;
public TestContextSetup() throws IOException, InterruptedException
{
	TestBase = new testBase();
	pageObjectManager = new PageObjectManager(TestBase.WebDriverManager());
	
	
	
	

}

}
