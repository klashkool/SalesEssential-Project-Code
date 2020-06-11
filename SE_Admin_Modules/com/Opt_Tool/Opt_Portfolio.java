package com.Opt_Tool;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;
import com.utils.ExcelSheetReader;

public class Opt_Portfolio extends Salesessential_base  {
	static WebDriverWait wait = new WebDriverWait(driver, 200);
	//static List<HashMap<String, String>> Opt_Portfolio = ExcelSheetReader.Opt_Portfolio_data();

	public static void Create_Portfolio() throws InterruptedException {
		
		
		
		
		Thread.sleep(5000);
		WebElement element12 =driver.findElement(By.linkText("Portfolio position"));
		JavascriptExecutor executor12 = (JavascriptExecutor)driver;
		executor12.executeScript("arguments[0].click();", element12);
		
		
		Thread.sleep(5000);
		WebElement element =driver.findElement(By.linkText("Set order"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
	    Actions builder = new Actions(driver);
	     builder.moveToElement(element).perform();
	    
	    
	      WebElement element1 = driver.findElement(By.tagName("body"));
	      Actions builder1 = new Actions(driver);
	      builder1.moveToElement(element1, 0, 4).perform();
	    
	    
	      WebElement dragged = driver.findElement(By.id("index-0"));
	     
	      WebElement dropped = driver.findElement(By.id("index-4"));
	      Actions builder2 = new Actions(driver);
	      builder2.dragAndDrop(dragged, dropped).perform();
	    
	    driver.findElement(By.cssSelector(".col-md-offset-5")).click();
}
}
