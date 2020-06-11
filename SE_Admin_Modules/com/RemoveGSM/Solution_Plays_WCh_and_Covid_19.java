package com.RemoveGSM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;
import com.utils.ExcelSheetReader;

public class Solution_Plays_WCh_and_Covid_19 extends Salesessential_base {
	static WebDriverWait wait = new WebDriverWait(driver, 200);
	static List<HashMap<String, String>> WCH_Details = ExcelSheetReader.WCH_Details_data();

	public static void Check_Solution_Plays_covid19() throws InterruptedException {
		
		driver.get(prop.getProperty("urlAcoustic"));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("santhr10@in.ibm.com");
		// click on continue button

		driver.findElement(By.xpath("//button[@id='continue-button']")).click();

		// enter ur username and password

		driver.findElement(By.xpath("//*[@id=\"desktop\"]")).sendKeys("santhr10@in.ibm.com");
		driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div[2]/div/div/form/input[4]"))
				.sendKeys("SANTHOshnithya@ibm");

		// click on signin button

		WebElement element5 = driver.findElement(By.xpath("//body[@id='body']/div/div[2]/div/div/form/button"));
		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click();", element5);
		Thread.sleep(2000);

		// Clicking on Content Libraries

//	
		WebElement element6 = driver
				.findElement(By.xpath("//*[@id=\"ribbon-product-feature-item-title-wch-content\"]"));
		JavascriptExecutor executor6 = (JavascriptExecutor) driver;
		executor6.executeScript("arguments[0].click();", element6);
		Thread.sleep(5000);
		WebElement element7 = driver.findElement(By.xpath(("//span[contains(.,'All content')]")));
		JavascriptExecutor executor7 = (JavascriptExecutor) driver;
		executor7.executeScript("arguments[0].click();", element7);

//  Thread.sleep(1000);
		driver.switchTo().frame("wch-iframe");

//driver.findElement(By.xpath("//button[@id='content-filter-btn']")).click();
//driver.findElement(By.cssSelector("#facetList_540 > .facet-item:nth-child(5) .facet-label")).click();

		WebElement element93 = driver.findElement(By.xpath("//li[8]/button"));
		JavascriptExecutor executor93 = (JavascriptExecutor) driver;
		executor93.executeScript("arguments[0].click();", element93);

		WebElement element9 = driver.findElement(By.xpath("//span[contains(.,'se-hierarchy')]"));
		JavascriptExecutor executor9 = (JavascriptExecutor) driver;
		executor9.executeScript("arguments[0].click();", element9);

		driver.findElement(By.id("search-input")).sendKeys("6943-00Q");
		driver.findElement(By.id("search-input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		
		driver.findElement(
				By.cssSelector(".ng-scope:nth-child(1) > .ng-scope > .authoring-item-name-container .ng-binding"))
				.click();
		
		
		

		}
	public static void StrategicinitiativeD_Val() throws InterruptedException {

		String alret_text12 = driver
			.findElement(
					By.xpath("//*[@id=\"content-ui-view\"]/authoring-content-edit/div[1]/div/div[2]/div[1]/div/div/div[2]/div[1]/div/content-element-container/form/category-content-form-element[7]/div/div[2]/div"))
			.getText();

	System.out.println(alret_text12);
	
	String alret_text11 = driver
			.findElement(
					By.xpath("//*[@id=\"content-ui-view\"]/authoring-content-edit/div[1]/div/div[2]/div[1]/div/div/div[2]/div[1]/div/content-element-container/form/text-content-form-element[58]/div/div[2]/text-component/div/span[1]"))
			.getText();

	System.out.println(alret_text11);

	if(alret_text12.equalsIgnoreCase("New WoW")) {
		
		Assert.assertEquals("COVID-19", alret_text11);
	}
	
		
	
	}
	
		
		
		
			

	
}
