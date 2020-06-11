package com.HomePagePillar_Ts;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;
import com.utils.ExcelSheetReader;

public class Ts_Contacts extends Salesessential_base {
	static WebDriverWait wait = new WebDriverWait(driver, 100);
	static List<HashMap<String, String>> Contacts = ExcelSheetReader.Ts_Contacts_data();
	
	
		public static void Create_Ts_Contacts() throws InterruptedException  {
			
		
			
			WebElement element = driver.findElement(By.linkText("Contacts"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			
			// To click on Create New Button under Contacats tab
			
			
			
						WebElement element1 = driver.findElement(By.id("create-new-btn"));
						JavascriptExecutor executor1 = (JavascriptExecutor)driver;
						executor1.executeScript("arguments[0].click();", element1);
						
						Thread.sleep(5000);
						WebElement element2 = driver.findElement(By.id("intranetId"));
						JavascriptExecutor executor2 = (JavascriptExecutor)driver;
						executor2.executeScript("arguments[0].click();", element2);
						
						
						
						
					    driver.findElement(By.id("intranetId")).sendKeys("santhosh nithya R");
					    Thread.sleep(10000);
					    driver.findElement(By.cssSelector("#faces-list > li")).click();
					    Thread.sleep(10000);
					    driver.findElement(By.cssSelector("#override-role small")).click();
					    
					  
					    driver.findElement(By.xpath("//*[@id='pillar-contact-form']/div[3]/button[1]")).click();
					    
					 // To publish

					    WebElement element6 = driver.findElement(By.xpath("//a[3]/span"));
					    JavascriptExecutor executor6 = (JavascriptExecutor)driver;
					    executor6.executeScript("arguments[0].click();", element6);
					    Thread.sleep(5000);

					    driver.findElement(By.xpath("//button[contains(.,'Yes')]")).click();
					    
					    
						
		}

}
