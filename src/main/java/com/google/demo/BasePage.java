package com.google.demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
	public WebDriver driver;
	
	// set up method to initialize driver object
		public WebDriver setUp(String browsertype) throws Exception {

			if (browsertype.contains("chrome")) {
				System.setProperty("webdriver.chrome.driver", "/Users/Priti/Downloads/chromedriver_win32");
				driver = new ChromeDriver();
			} else if (browsertype.contains("firefox")) {
				System.setProperty("webdriver.gecko.driver", "/Users/Priti/Downloads/geckodriver-v0.32.0-win32");
				driver = new FirefoxDriver();
			}
			String baseUrl = "https://www.google.co.in";
			driver.get(baseUrl);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			return driver;
		}

}
