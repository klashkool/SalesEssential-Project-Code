package com.Admin_Dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;

public class Manage_Assets  extends Salesessential_base {
	static WebDriverWait wait = new WebDriverWait(driver, 100);

	public static void Click_ManageAssets() throws InterruptedException {
		
		// Click on Home
		
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"leftNavigation\"]/ul/li[1]/a"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", element1);
		
		// click on Assets
		// //*[@id="homeTabs"]/div/div[8]/div/div[2]/a

		WebElement AssetsClick = driver.findElement(By.linkText("Assets"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AssetsClick);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Assets")).click();

}
}
