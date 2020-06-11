package com.Sparklers_Page;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;
import com.utils.ExcelSheetReader;

public class Publishing_Sparklers_Page extends Salesessential_base{
	
	static WebDriverWait wait = new WebDriverWait(driver, 200);
	static List<HashMap<String, String>> Sparklers = ExcelSheetReader.Sparklers_data();
	
	
	public static void Create_Sparklers() throws InterruptedException {

		//Title
		driver.findElement(By.id("sparklers-title")).sendKeys(Sparklers.get(0).get("Title"));

		//Tagline

		driver.findElement(By.id("sparklers-tagline")).sendKeys(Sparklers.get(0).get("Tagline"));

		// Overview

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='cke_3_contents']/iframe")));
					driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='cke_3_contents']/iframe")));
					driver.findElement(By.xpath("/html/body")).sendKeys(Sparklers.get(0).get("Overview"));		
					driver.switchTo().defaultContent();
   
					
					
		// Service Lines
		Select SLBox = new Select(driver.findElement(By.xpath("//*[@id='sparklers-serviceCategory']")));
						SLBox.selectByVisibleText("Not specified");
						
						// order
						driver.findElement(By.xpath("//div/input[@type='number']")).sendKeys("1");
						

       Thread.sleep(1000);

		// Saving Sparklers

		driver.findElement(By.xpath("//*[@id='form-element']/div/div/div/form/div[7]/button[1]")).click();
	}


		
	
	// Clicking on Industry Sparklers
		
	public static void Create_IndustrySparklers() throws InterruptedException {
		
		Thread.sleep(5000);
		WebElement ClickInd_Spark = driver.findElement(By.xpath("//button[@id='industrySparklers']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClickInd_Spark);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='industrySparklers']")));
			driver.findElement(By.xpath("//button[@id='industrySparklers']")).click();
			






}
	
	//submit sparklers
	
	
	public static void Submit_IndustrySparklers() throws InterruptedException {
		Thread.sleep(6000);
		WebElement SubmitSparklers = driver.findElement(By.xpath("//button[contains(.,'Save')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SubmitSparklers);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(.,'Save')]")));
			driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
			
		
	}
	
	// Publish sparklers
	
	
	public static void Publish_IndustrySparklers() throws InterruptedException {
		Thread.sleep(15000);
		
		WebElement element1 = driver.findElement(By.xpath("//a[3]/span"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);
		
		
//		WebElement PublishIndSparklers = driver.findElement(By.xpath("//a[3]/span"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PublishIndSparklers);
//
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[3]/span")));
//			driver.findElement(By.xpath("//a[3]/span")).click();
			
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[contains(.,'Yes')]")).click();
		
		Thread.sleep(10000);
		driver.get("http://tpydalseuat01.sl.bluecloud.ibm.com/services/sparkler/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@id=\'pri-tab-0\']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.id("pri-tab-1")).click();
	    driver.findElement(By.id("pri-tab-2")).click();
	    driver.findElement(By.id("pri-tab-3")).click();
	    driver.findElement(By.id("pri-tab-4")).click();
	    driver.findElement(By.id("pri-tab-1")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.id("pri-tab-2")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.id("pri-tab-3")).click();
	    Thread.sleep(10000);
	    driver.findElement(By.id("pri-tab-4")).click();
	    Thread.sleep(10000);
		
		
	}
	
		
	
	
}