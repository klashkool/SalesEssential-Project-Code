package com.Admin_Dashboard;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;

public class Click_on_OID extends Salesessential_base{
	
	static WebDriverWait wait = new WebDriverWait(driver, 100);
	public static void Click_Opt1_Tool() throws InterruptedException {

		
		
		
		
		driver.get("https://tpydalseuat01.sl.bluecloud.ibm.com/services/seismic/offering/20G3Z");
		Thread.sleep(20000);
		
		
		
		String alret_text = driver
				.findElement(
						By.xpath("//*[@id=\"se-minHeight\"]/app-announcement/div/div/div[2]/div"))
				.getText();

		System.out.println(alret_text);


		

		
		driver.findElement(By.xpath("//a[contains(text(),'Offering and customer codes ↓')]")).click();
		
		String alret_text1 = driver
				.findElement(
						By.xpath("//div[@id='tab-content-code-0']/div[2]/div[2]/app-cust-code-table/div/div/app-cust-code-table-content/table/tbody/tr[2]/td[5]/span"))
				.getText();

		System.out.println(alret_text1);
		
		 

		
		
		driver.get("https://tpydalseuat01.sl.bluecloud.ibm.com/services/seismic/offering/6950-05Y");
		
		String alret_text11 = driver
				.findElement(
						By.xpath("//*[@id='se-minHeight']/app-announcement/div/div/div[2]/div"))
				.getText();

		System.out.println(alret_text11);
		
		Assert.assertEquals(alret_text11,alret_text1 );
		
		 

		
		


}


}
