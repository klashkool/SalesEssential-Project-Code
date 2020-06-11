package com.Admin_Dashboard;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;

public class Sales_Play extends Salesessential_base {

	static WebDriverWait wait = new WebDriverWait(driver, 100);

	public static void Click_SalesPlay() throws InterruptedException {

		WebElement SpClick = driver.findElement(By.linkText("SalesPlay"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SpClick);
		Thread.sleep(500);
		driver.findElement(By.linkText("SalesPlay")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='navBar']//div//h2")));
		String Mng_SP_Header_Val = driver.findElement(By.xpath("//*[@id='navBar']//div//h2")).getText();
		Assert.assertEquals("Manage Sales Play", Mng_SP_Header_Val);

	}

}
