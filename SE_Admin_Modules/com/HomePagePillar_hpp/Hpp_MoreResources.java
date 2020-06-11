package com.HomePagePillar_hpp;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;
import com.utils.ExcelSheetReader;

public class Hpp_MoreResources extends Salesessential_base {
	
	static WebDriverWait wait = new WebDriverWait(driver, 200);
	static List<HashMap<String, String>> Hpp_MoreResources = ExcelSheetReader.Hpp_MoreResources_data();
	
	public static void Create_Hpp_MoreResources() throws InterruptedException {
// More Resources
		
		
		Thread.sleep(15000);
		WebElement ResourcesClick = driver.findElement(By.linkText("More Resources"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ResourcesClick);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("More Resources")));
		driver.findElement(By.linkText("More Resources")).click();
		
		
		
		// Edit icon
		
		WebElement element1 = driver.findElement(By.xpath("//td[4]/div/a/span"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);
		
//		
//		driver.findElement(By.xpath("//td[4]/div/a/span")).click();
//		Thread.sleep(2000);
		
     // To save the editted resource
		
		WebElement element11 = driver.findElement(By.cssSelector(".mr-2"));
		JavascriptExecutor executor11 = (JavascriptExecutor)driver;
		executor11.executeScript("arguments[0].click();", element11);
		
		
		// To edit the created Resource
		Thread.sleep(5000);
		
		WebElement element2 = driver.findElement(By.xpath("//a[2]/span"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", element2);
		
		
		driver.findElement(By.xpath("//button[contains(.,'Yes')]")).click();
	
	
}
}