package com.Admin_Dashboard;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;

public class Opt_page  extends Salesessential_base{
	
	static WebDriverWait wait = new WebDriverWait(driver, 100);

	public static void Click_Opt_Tool() throws InterruptedException {

		WebElement OptClick = driver.findElement(By.linkText("Offering Portfolio Tool"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", OptClick);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Offering Portfolio Tool")).click();
		
		Thread.sleep(5000);
		
		WebElement element1 = driver.findElement(By.xpath("//input[@id='search-term']"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);

		// Opt search to pick offering id 6955-03C
		
		
	    driver.findElement(By.id("search-term")).sendKeys("20G7C");
	    driver.findElement(By.id("search-term")).sendKeys(Keys.ENTER);
	    driver.findElement(By.xpath("//*[@id='optGrid']/div[5]/div/div/div[6]/a")).click();
	    
	   
         String Status_Draft = driver.findElement(By.xpath("//div[3]/div/p")).getText();    
         System.out.println(Status_Draft);
	    String Status_Published = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[1]/div[3]/div[1]/p")).getText();    
         System.out.println(Status_Published);

	    if(Status_Draft.contains("Draft")) {
	    	System.out.println("Test If else successfully");
	    	
	    	Thread.sleep(5000);
	    	String btn = driver.findElement(By.xpath("(//button[@type='button'])[4]")).getText();
	    	if(btn.contains("Submit for Publish")) {
	    		Thread.sleep(1000);
	    	driver.findElement(By.linkText("Banner")).click();
	    	}
	    	else if(btn.contains("Cancel Publish")) {
	    		
	    		driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[1]/div[4]/div/button[4]")).click();
	    		Thread.sleep(4000);
	    		driver.findElement(By.linkText("Banner")).click();
	    	
	    }else if(Status_Published.contains("Status: Published")){
	    	Thread.sleep(5000);
	    	System.out.println("Test If else successfully");
	    	// clicking on Create Draft button
	    	driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
	    	Thread.sleep(2000);
	    	// Clicking on Banner
	    	driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[2]/ul/li[1]/a")).click();
	    }
	    	Thread.sleep(5000);
	    	// Clicking on Preview Link
	    	driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[1]/div[3]/div[2]/span")).click();


	    	 driver.findElement(By.cssSelector(".col-sm-12:nth-child(3) > .prewLink")).click();
            //driver.findElement(By.linkText("https://tpydalseuat01.sl.bluecloud.ibm.com/services/seismic/offering/6955-03C")).click();
            Set <String> generatePreview = driver.getWindowHandles();

            Iterator<String> generatePreview1 = generatePreview.iterator();

            String MainWindowID1 = generatePreview1.next();

            String SubWindowID1 = generatePreview1.next();         
           
            driver.switchTo().window(SubWindowID1);
            Thread.sleep(5000);
            driver.findElement(By.xpath("//*[@id='tab-content-code-0']/div[1]/div/ul/li[2]/a")).click();
            Thread.sleep(10000);
            String OfferingCustomCodes1 = driver.findElement(By.xpath("//*[@id=\"tab-content-code-0\"]/div[2]/div[2]/div/table/thead/tr/th[1]")).getText();
            Assert.assertEquals("Offering name (hot link to sales kit if available)", OfferingCustomCodes1);
            System.out.println(OfferingCustomCodes1);
            String OfferingCustomCodes = driver.findElement(By.xpath("//*[@id=\"tab-content-code-0\"]/div[2]/div[2]/div/table/thead/tr/th[4]")).getText();
            Assert.assertEquals("Solutioning / Delivery Assets", OfferingCustomCodes);
            System.out.println(OfferingCustomCodes);
            driver.close();
	   driver.switchTo().window(MainWindowID1);
	   driver.findElement(By.xpath("//div[2]/div/span")).click();
	   
	   
	    	    
	}


}
}