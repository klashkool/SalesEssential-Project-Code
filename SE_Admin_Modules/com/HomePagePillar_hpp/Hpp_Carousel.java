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

public class Hpp_Carousel extends Salesessential_base {

	
	static WebDriverWait wait = new WebDriverWait(driver, 200);
	static List<HashMap<String, String>> Hpp_Carousel = ExcelSheetReader.Hpp_Carousel_data();
	
	
	public static void Create_Hpp_Carousel() throws InterruptedException {
		// More Resources
				
				
				Thread.sleep(10000);
				WebElement ResourcesClick = driver.findElement(By.linkText("Carousel"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ResourcesClick);

				wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Carousel")));
				driver.findElement(By.linkText("Carousel")).click();
				
				// To click on edit button of carousel
				
				
				
				Thread.sleep(10000);
				WebElement CarouselClick = driver.findElement(By.xpath("//button[contains(.,'Edit')]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CarouselClick);

				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(.,'Edit')]")));
				driver.findElement(By.xpath("//button[contains(.,'Edit')]")).click();
				
				// To click on Save button
				
				WebElement element1 = driver.findElement(By.xpath("//button[@type='submit']"));
				JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				executor1.executeScript("arguments[0].click();", element1);
	            
				
				
}
}
