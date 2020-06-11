package com.Opt_Tool;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;
import com.utils.ExcelSheetReader;

public class Opt_Details extends Salesessential_base  {
	static WebDriverWait wait = new WebDriverWait(driver, 200);
	static List<HashMap<String, String>> Opt_Details = ExcelSheetReader.Opt_Details_data();

	public static void Create_Details() throws InterruptedException {
		WebElement element = driver.findElement(By.linkText("Details"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		
		Thread.sleep(5000);
	
	
	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='cke_13_contents']/iframe")));
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='cke_13_contents']/iframe")));
	WebElement Overview = driver.findElement(By.xpath("/html/body"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Overview);

	driver.findElement(By.xpath("/html/body")).sendKeys(Opt_Details.get(0).get("Overview"));		
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	
	//Value Proposition
	
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='cke_15_contents']/iframe")));
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='cke_15_contents']/iframe")));
	WebElement ValProp = driver.findElement(By.xpath("/html/body"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ValProp);

	driver.findElement(By.xpath("/html/body")).sendKeys(Opt_Details.get(0).get("Value Proposition"));		
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	//Client Pain Points
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='cke_17_contents']/iframe")));
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='cke_17_contents']/iframe")));
	WebElement Cpp = driver.findElement(By.xpath("/html/body"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Cpp);

	driver.findElement(By.xpath("/html/body")).sendKeys(Opt_Details.get(0).get("Client Pain Points"));		
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	//Target Audience
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='cke_21_contents']/iframe")));
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='cke_21_contents']/iframe")));
	WebElement TarAud = driver.findElement(By.xpath("/html/body"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TarAud);

	driver.findElement(By.xpath("/html/body")).sendKeys(Opt_Details.get(0).get("Target Audience"));		
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	
	//Market Conditions
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='cke_27_contents']/iframe")));
	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='cke_27_contents']/iframe")));
	WebElement MarCond = driver.findElement(By.xpath("/html/body"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", MarCond);

	driver.findElement(By.xpath("/html/body")).sendKeys(Opt_Details.get(0).get("Target Audience"));		
	driver.switchTo().defaultContent();
	Thread.sleep(1000);
	
	// Save Details
	driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-details/form/div[3]/div/button")).click();

}}
