package com.Sparklers_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;

public class Manage_Sparklers_Page extends Salesessential_base {
static WebDriverWait wait = new WebDriverWait(driver,100);
	
	public static void CreateNew_Btn() throws InterruptedException {
		
		
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("create-new-btn")));
		
		//driver.findElement(By.id("create-new-btn")).click();
		//driver.manage().window().setSize(new Dimension(1280, 680));
	    //driver.findElement(By.id("create-new-btn")).click();
		
		WebElement element1 = driver.findElement(By.id("create-new-btn"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);
		
		
		
		
		
	}

}
