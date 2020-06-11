package com.Admin_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;

public class Pillarpage_Tss extends Salesessential_base {
	static WebDriverWait wait = new WebDriverWait(driver, 100);

	public static void Click_Technology_Support_Services() throws InterruptedException {
		
		
		
		// Clicking on Left nave home link
		
		
       Thread.sleep(5000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Pillar Management Tool")));
		WebElement element = driver.findElement(By.linkText("Pillar Management Tool"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	    
		
		// Pillar Management Tool
		
		Thread.sleep(10000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Technology Support Services")));
		
		WebElement element1 = driver.findElement(By.linkText("Technology Support Services"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element1);
	    

		//WebElement SpClick = driver.findElement(By.linkText("Pillar Management Tool"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SpClick);
		//Thread.sleep(500);
		//driver.findElement(By.linkText("Pillar Management Tool")).click();

		// Technology Support Services
//		Thread.sleep(2000);
//		WebElement Tss_Click = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-pillar-home/div/div[3]/div[2]/div/div/a"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Tss_Click);
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-pillar-home/div/div[3]/div[2]/div/div/a")).click();

		

	}


}
