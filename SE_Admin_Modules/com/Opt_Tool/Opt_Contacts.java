package com.Opt_Tool;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;
import com.utils.ExcelSheetReader;

public class Opt_Contacts extends Salesessential_base {
	static WebDriverWait wait = new WebDriverWait(driver, 100);
	static List<HashMap<String, String>> Opt_Contacts = ExcelSheetReader.Opt_Contacts_data();
	
	
		public static void Create_OPTContacts() throws InterruptedException  {
			
			WebElement element = driver.findElement(By.linkText("Contacts"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			
			// To click on Create New Button under Contacats tab
			
		
			
			WebElement element1 = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-contacts/div[1]/div[1]/div[3]/button"));
			JavascriptExecutor executor1 = (JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();", element1);
			
			Thread.sleep(5000);
			WebElement element2 = driver.findElement(By.id("intranetId"));
			JavascriptExecutor executor2 = (JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();", element2);
			
			
			
			
		    driver.findElement(By.id("intranetId")).sendKeys("santhosh nithya R");
		    Thread.sleep(5000);
		    
		    driver.findElement(By.cssSelector("#faces-list > li")).click();
		    
		    driver.findElement(By.cssSelector("#override-role small")).click();
		    
		  
		    driver.findElement(By.xpath("//*[@id='opt-contact-form']/div[3]/button[3]")).click();
		    
		
			

			
			
						

						
		}

}


