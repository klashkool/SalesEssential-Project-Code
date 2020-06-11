package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Salesessential_base {

	public static Properties prop;
	public static WebDriver driver;

	// constructor to initiate the property file
	public Salesessential_base() {
		try {
			prop = new Properties();

			FileInputStream ip = new FileInputStream("C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\config.properties");
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void initialization() {

		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (browserName.equals("Firefox")) {
			System.setProperty("","");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}

}
