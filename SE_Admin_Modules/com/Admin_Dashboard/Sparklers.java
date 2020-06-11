package com.Admin_Dashboard;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;

public class Sparklers extends Salesessential_base {

	static WebDriverWait wait = new WebDriverWait(driver, 100);

	public static void Click_Sparklers() throws InterruptedException {

		WebElement SpClick = driver.findElement(By.linkText("Sparklers"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SpClick);
		Thread.sleep(500);
		driver.findElement(By.linkText("Sparklers")).click();

		
	}
}
