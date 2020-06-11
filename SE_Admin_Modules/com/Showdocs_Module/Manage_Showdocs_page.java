package com.Showdocs_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;

public class Manage_Showdocs_page extends Salesessential_base{

	static WebDriverWait wait = new WebDriverWait(driver,100);
	
	public static void CreateNew_Btn_Showdocs() throws InterruptedException {
		Thread.sleep(5000);
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id='se-ct-cust-table-2_filter']/div[1]/label/select"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);
		
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='se-ct-cust-table-2_filter']/div[1]/label/select/option[2]"));
	      dropdown.findElement(By.xpath("//option[. = 'Showdocs I own']")).click();
	      
	      driver.findElement(By.xpath("//*[@id='se-ct-cust-table-2_filter']/div[1]/label/select/option[2]")).click();
		
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".col-lg-1 > #create-new-btn")));
		
		
		driver.findElement(By.cssSelector(".col-lg-1 > #create-new-btn")).click();
	  
		//WebElement element1 = driver.findElement(By.cssSelector(".col-lg-1 > #create-new-btn"));
		//JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		//executor1.executeScript("arguments[0].click();", element1);
		
		
		
		
		
		
	}
}
