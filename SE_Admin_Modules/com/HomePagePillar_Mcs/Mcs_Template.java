package com.HomePagePillar_Mcs;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;
import com.utils.ExcelSheetReader;

public class Mcs_Template extends Salesessential_base {
	
	static WebDriverWait wait = new WebDriverWait(driver, 100);
	static List<HashMap<String, String>> Mcs_Template = ExcelSheetReader.Mcs_Template_data();

	public static void Create_McsTemplate() throws InterruptedException {
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("pillar-title")).sendKeys(Mcs_Template.get(0).get("Pillar"));
		
		Thread.sleep(2000);
		
		// Save pillar Template
		//driver.findElement(By.xpath("//*[@id='home-pillar-template-wrapper']/app-dynamic-form/div/div/div/form/div[9]/button[1]")).click();
	}
	

}
