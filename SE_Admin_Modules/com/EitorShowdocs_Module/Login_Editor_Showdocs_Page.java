package com.EitorShowdocs_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;

public class Login_Editor_Showdocs_Page extends Salesessential_base {
	
static WebDriverWait wait = new WebDriverWait(driver,100);
	
	public static void login_Showdocs_Editor() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='Intranet_ID']")).sendKeys("arpithhr@in.ibm.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("WorkHardArpi@15");
		driver.findElement(By.xpath("//*[@id='loginform']/input[3]")).click();

}
}
