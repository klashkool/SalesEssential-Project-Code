package com.SalesPlay_Module;

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

public class SP_Contacts extends Salesessential_base{
	
	static WebDriverWait wait = new WebDriverWait(driver, 100);
	static List<HashMap<String, String>> SP_Contacts = ExcelSheetReader.SP_Contacts_data();
		public static void Create_Contacts() throws InterruptedException  {
			
			WebElement element = driver.findElement(By.linkText("Contacts"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			
			
			
			
			// To click on Create New Button under Contacats tab
			
		
			
			WebElement element1 = driver.findElement(By.id("create-contact-btn"));
			JavascriptExecutor executor1 = (JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();", element1);
			
			Thread.sleep(5000);
			WebElement element2 = driver.findElement(By.id("intranetId"));
			JavascriptExecutor executor2 = (JavascriptExecutor)driver;
			executor2.executeScript("arguments[0].click();", element2);
			
			
			
			
		    driver.findElement(By.id("intranetId")).sendKeys("santhosh nithya R");
		    Thread.sleep(5000);
		    driver.findElement(By.cssSelector("#faces-list > li")).click();
		    
		    driver.findElement(By.cssSelector("#override-role small")).click();
		    
		    
		    
			
			String ContactType = driver.findElement(By.name("contactType")).getText();
			System.out.println(ContactType);
	
			driver.findElement(By.xpath("//*[@id='priority']/span/small")).click();
			
			driver.findElement(By.xpath("//*[@id='order']")).sendKeys("1");
			
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		 // Geography
			
			String[] Geo = SP_Contacts.get(0).get("Geography").split("/", 0);
			List<String> GeoList = Arrays.asList(Geo);
			System.out.println(GeoList);

			WebElement Geo_view= driver.findElement((By.id("geo")));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Geo_view);
			Thread.sleep(500);

			Select GeoBox = new Select(
					driver.findElement(By.id("geo")));
			List<WebElement> selectedGeo = GeoBox.getAllSelectedOptions();

			List<String> SelectedGeoList = new ArrayList<String>();
			for (int i = 0; i < selectedGeo.size(); i++) {
				String SelectedGeoTxt = selectedGeo.get(i).getText().trim();
				System.out.println(SelectedGeoTxt);
				SelectedGeoList.add(SelectedGeoTxt);
			}
			Assert.assertEquals(GeoList, SelectedGeoList);

		    
		  // To save
		    driver.findElement(By.xpath("//*[@id='pillar-contact-form']/div[3]/button[1]")).click();
		    
		 // To publish

		    WebElement element6 = driver.findElement(By.xpath("//a[3]/span"));
		    JavascriptExecutor executor6 = (JavascriptExecutor)driver;
		    executor6.executeScript("arguments[0].click();", element6);
		    Thread.sleep(5000);

		    driver.findElement(By.xpath("//button[contains(.,'Yes')]")).click();
		    
			

			
			
			
			
			
			
			
					
					
										

				
			}
			
			
}

