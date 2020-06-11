package com.SalesPlay_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;

public class Manage_SalesPlay_page extends Salesessential_base {
	
	static WebDriverWait wait = new WebDriverWait(driver,100);
	
	public static void CreateNew_Btn() {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("create-new-btn")));
		driver.findElement(By.id("create-new-btn")).click();
		
		
	}
	

}
