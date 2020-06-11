package com.Opt_Tool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;
import com.utils.ExcelSheetReader;

public class Opt_Overview extends Salesessential_base  {
	static WebDriverWait wait = new WebDriverWait(driver, 200);
	static List<HashMap<String, String>> Opt_Overview = ExcelSheetReader.Opt_Overview_data();

	public static void Create_Overview() throws InterruptedException {
		
		
		
		
		WebElement element2 = driver.findElement(By.linkText("Overview"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", element2);
	Thread.sleep(5000);
	
	// To get QA status 
	
	
	WebElement element1 = driver.findElement(By.xpath("//*[@id='hmt-overview-form']/fieldset/div[2]/select"));
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", element1);

	String[] QAStatus = Opt_Overview.get(0).get("QA Status").split("/", 0);
	List<String> QAStatusList = Arrays.asList(QAStatus);
	System.out.println(QAStatusList);

WebElement QAStatus_view= driver.findElement(By.xpath("//*[@id='hmt-overview-form']/fieldset/div[2]/select"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", QAStatus_view);
Thread.sleep(5000);

	Select QAStatusBox = new Select(
			driver.findElement(By.xpath("//*[@id='hmt-overview-form']/fieldset/div[2]/select")));
	List<WebElement> selectedQAStatus = QAStatusBox.getAllSelectedOptions();

	List<String> SelectedQAStatusList = new ArrayList<String>();
	for (int i = 0; i < selectedQAStatus.size(); i++) {
		String SelectedQAStatusTxt = selectedQAStatus.get(i).getText().trim();
		System.out.println(SelectedQAStatusTxt);
		SelectedQAStatusList.add(SelectedQAStatusTxt);
	}			Assert.assertEquals(QAStatusList, SelectedQAStatusList);


	//QA Comment
	
	Thread.sleep(5000);
	
	WebElement element15 = driver.findElement(By.id("qa-comment"));
	JavascriptExecutor executor15 = (JavascriptExecutor)driver;
	executor15.executeScript("arguments[0].click();", element15);	
	
	 WebElement text1 = driver.findElement(By.id("qa-comment"));
	    String textagain1 = text1.getAttribute("value");
	System.out.println(textagain1);
	
		WebElement element5= driver.findElement(By.xpath("//div[9]/ui-switch/span/small"));
		JavascriptExecutor executor5 = (JavascriptExecutor)driver;
		executor5.executeScript("arguments[0].click();", element5);
		Thread.sleep(2000);
		// To get copy from text
//		System.out.print(driver.findElement(By.xpath("//input[@id='copyfrom']")).getText());
//		Thread.sleep(2000);
//		System.out.print(driver.findElement(By.xpath("//select[@name='qatype']")).getText());
//		Thread.sleep(2000);
//		System.out.print(driver.findElement(By.cssSelector(".form-group:nth-child(5) > .form-control")).getText());
//		Thread.sleep(2000);
		// GET QA STATus of Selected options
//		Select select = new Select(driver. findElement(By. xpath("//select[@name='qatype']")));
//		WebElement option = select. getFirstSelectedOption();
//		String defaultItem = option. getText();
//		System. out.println(select);
//		To get Admin QA status
		
		
//		String[] AdminQAStatus = Opt_Overview.get(0).get("Admin QA Status").split("/", 0);
//		List<String> AdminQAStatusList = Arrays.asList(AdminQAStatus);
//		WebElement AdminQAStatus_view= driver.findElement(By.xpath("//select[@id='adminqastatus']"));
//
//		System.out.println(QAStatusList);
//
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AdminQAStatus_view);
//	Thread.sleep(5000);
//
//		Select AdminQAStatusBox = new Select(
//				driver.findElement(By.xpath("//select[@id='adminqastatus']")));
//		List<WebElement> selectedAdminQAStatus = AdminQAStatusBox.getAllSelectedOptions();
//
//		List<String> SelectedAdminQAStatusList = new ArrayList<String>();
//		for (int i = 0; i < selectedAdminQAStatus.size(); i++) {
//			String SelectedAdminQAStatusTxt = selectedAdminQAStatus.get(i).getText().trim();
//			System.out.println(SelectedAdminQAStatusTxt);
//			SelectedAdminQAStatusList.add(SelectedAdminQAStatusTxt);
//		}			Assert.assertEquals(AdminQAStatusList, SelectedAdminQAStatusList);



		
		
		
    
	
	Thread.sleep(2000);
	
	WebElement element3 = driver.findElement((By.xpath("//div[10]/ui-switch/span/small")));
	JavascriptExecutor executor3 = (JavascriptExecutor)driver;
	executor3.executeScript("arguments[0].click();", element3);
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-overview/form/div[3]/button")).click();
    

}
}