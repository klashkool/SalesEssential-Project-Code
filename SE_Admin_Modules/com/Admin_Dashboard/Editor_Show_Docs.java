package com.Admin_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;

public class Editor_Show_Docs  extends Salesessential_base   {
	static WebDriverWait wait = new WebDriverWait(driver, 100);
	
	
	public static void Click_Showdocs_Editor() throws InterruptedException {

		WebElement ShowdocsClick = driver.findElement(By.linkText("Showdocs"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ShowdocsClick);
		Thread.sleep(500);
		driver.findElement(By.linkText("Showdocs")).click();

		

	}


}
