package com.EitorShowdocs_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;

public class Manage_EditorShowdocs_page extends Salesessential_base {
static WebDriverWait wait = new WebDriverWait(driver,100);
	
	public static void CreateNew_Btn_Showdocs_Editor() throws InterruptedException {
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".col-lg-1 > #create-new-btn")));
		
		
		driver.findElement(By.cssSelector(".col-lg-1 > #create-new-btn")).click();
	  
		//WebElement element1 = driver.findElement(By.cssSelector(".col-lg-1 > #create-new-btn"));
		//JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		//executor1.executeScript("arguments[0].click();", element1);
		
		
		
		
		
		
	}

}
