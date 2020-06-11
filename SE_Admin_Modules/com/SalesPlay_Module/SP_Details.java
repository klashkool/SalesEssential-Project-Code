package com.SalesPlay_Module;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;
import com.utils.ExcelSheetReader;

public class SP_Details  extends Salesessential_base {
	
	static WebDriverWait wait = new WebDriverWait(driver, 100);
	static List<HashMap<String, String>> Details = ExcelSheetReader.Details_data(); 
		public static void Create_Details() throws InterruptedException  {
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Details")));	
			
			driver.findElement(By.linkText("Details")).click();
			Thread.sleep(3000);
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id ='cke_73_contents']/iframe")));
			driver.switchTo().frame(driver.findElement(By.xpath("//*[@id ='cke_73_contents']/iframe")));
			WebElement Content = driver.findElement(By.xpath("/html/body"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Content);

			driver.findElement(By.xpath("/html/body")).sendKeys(Details.get(0).get("Content"));		
			driver.switchTo().defaultContent();
			Thread.sleep(1000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='pillar-contact-form']/div[2]/button[1]")));
			driver.findElement(By.xpath("//*[@id='pillar-contact-form']/div[2]/button[1]")).click();
		
			
}
	}

