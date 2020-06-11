package com.ManageAssets;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;

public class Manage_Assets_Page  extends Salesessential_base{

	static WebDriverWait wait = new WebDriverWait(driver,100);
	
	public static void CreateNew_Btn_Assets() throws InterruptedException {
		Thread.sleep(5000);
		
		
		
	
	WebElement element1 = driver.findElement(By.xpath("//div[2]/div/label/select"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);
		
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id='se-ct-cust-table-1_filter']/div[1]/label/select/option[2]"));
	      dropdown.findElement(By.xpath("//div[2]/div/label/select")).click();
	      
	      driver.findElement(By.xpath("//*[@id='se-ct-cust-table-1_filter']/div[1]/label/select/option[2]")).click();
		
		
     
		
		driver.findElement(By.xpath("//div[3]/button")).click();
		
		
		
		
		
		
	}
}



