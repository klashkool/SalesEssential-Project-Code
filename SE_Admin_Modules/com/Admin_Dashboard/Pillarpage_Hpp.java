package com.Admin_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;

public class Pillarpage_Hpp extends Salesessential_base  {
	
	static WebDriverWait wait = new WebDriverWait(driver, 100);

	public static void Click_Homepage_Pillar() throws InterruptedException {
		
		
		
		// Clicking on Left nave home link
		
		
       Thread.sleep(5000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Pillar Management Tool")));
		WebElement element = driver.findElement(By.linkText("Pillar Management Tool"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	    
		
		
		
		Thread.sleep(5000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Homepage Pillar")));
		
		WebElement element1 = driver.findElement(By.linkText("Homepage Pillar"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element1);
	    

		//WebElement SpClick = driver.findElement(By.linkText("Pillar Management Tool"));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SpClick);
		//Thread.sleep(500);
		//driver.findElement(By.linkText("Pillar Management Tool")).click();

		
//		Thread.sleep(2000);
//		WebElement Hpp_Click = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-pillar-home/div/div[1]/div[1]/div/div/a"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Hpp_Click);
//		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-pillar-home/div/div[1]/div[1]/div/div/a")).click();

		

	}


}
