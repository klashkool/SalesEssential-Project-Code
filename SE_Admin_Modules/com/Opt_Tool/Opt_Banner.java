package com.Opt_Tool;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;
import com.utils.ExcelSheetReader;

public class Opt_Banner extends Salesessential_base  {
	static WebDriverWait wait = new WebDriverWait(driver, 200);
	static List<HashMap<String, String>> Opt_Banner = ExcelSheetReader.Opt_Banner_data();

	public static void Create_Banner() throws InterruptedException {
		
		
		
		Thread.sleep(5000);
	
	
	//driver.findElement(By.linkText("Banner")).click();
    //driver.findElement(By.cssSelector("small")).click();
    Thread.sleep(5000);
    

	WebElement element1 = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[2]/ul/li[1]/a"));
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", element1);
    
    
	
	
	

}
}
