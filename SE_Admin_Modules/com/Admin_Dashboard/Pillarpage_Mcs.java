package com.Admin_Dashboard;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;

public class Pillarpage_Mcs extends Salesessential_base {

	static WebDriverWait wait = new WebDriverWait(driver, 100);

	public static void Click_MulticloudServices() throws InterruptedException {
		
		
		
		// Clicking on Left nave home link
		
		
       Thread.sleep(5000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='leftNavigation']/ul/li[1]/a")));
		WebElement element = driver.findElement(By.xpath("//*[@id='leftNavigation']/ul/li[1]/a"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	    
		
		
		
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='homeTabs']/div/div[2]/div/div[2]/a")));
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id='homeTabs']/div/div[2]/div/div[2]/a"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element1);
	    

		//WebElement SpClick = driver.findElement(By.linkText("Pillar Management Tool"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SpClick);
		//Thread.sleep(500);
		//driver.findElement(By.linkText("Pillar Management Tool")).click();

		
		Thread.sleep(2000);
		WebElement Mcs_Click = driver.findElement(By.linkText("Multicloud Services"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Mcs_Click);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Multicloud Services")).click();

		

	}
}
