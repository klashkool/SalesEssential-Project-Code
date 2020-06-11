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

import com.utils.ExcelSheetReader;

import com.base.Salesessential_base;

public class SP_Template extends Salesessential_base {
	
	static WebDriverWait wait = new WebDriverWait(driver, 100);
	static List<HashMap<String, String>> Template = ExcelSheetReader.Templates_data();

	public static void Create_Template() throws InterruptedException {
		
		

		Thread.sleep(5000);
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='cke_3_contents']/iframe")));
		driver.findElement(By.xpath("/html/body")).sendKeys(Template.get(0).get("Banner"));		
		driver.switchTo().defaultContent();
		driver.findElement(By.name("filename")).sendKeys("C:\\Users\\SanthoshNithyaR\\Downloads\\SE\\Test.txt");
		driver.findElement(By.name("title")).sendKeys(Template.get(0).get("Title"));
		driver.findElement(By.name("owner")).sendKeys(Template.get(0).get("owneremail"));
		driver.findElement(By.name("salesPlayDesc")).sendKeys(Template.get(0).get("Description"));
		driver.findElement(By.xpath("//*[@id='mainDiv']//form//div//tag-input//div//tag-input-form//form//input"))
				.sendKeys(Template.get(0).get("Keywords"));
		driver.findElement(By.xpath("//*[@id='mainDiv']//form//div//tag-input//div//tag-input-form//form//input"))
				.sendKeys(Keys.ENTER);

		WebElement Language = driver.findElement(By.name("language"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Language);
		Thread.sleep(500);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("language")));
		Select Lang = new Select(driver.findElement(By.name("language")));
		Lang.selectByIndex(2);// (Template.get(0).get("Language"));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("salesPlayContentCategory")));
		Select catgry = new Select(driver.findElement(By.name("salesPlayContentCategory")));
		catgry.selectByVisibleText(Template.get(0).get("Content Category"));

	}

	public static void AudienceDD_Val() throws InterruptedException {

		String[] Audience = Template.get(0).get("Audience").split("/", 0);
		List<String> AudList = Arrays.asList(Audience);
		System.out.println(AudList);

		WebElement audience = driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[14]//select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", audience);
		Thread.sleep(500);

		Select audienceBox = new Select(
				driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[14]//select")));
		List<WebElement> selectedAudience = audienceBox.getAllSelectedOptions();

		List<String> SelectedAudList = new ArrayList<String>();
		for (int i = 0; i < selectedAudience.size(); i++) {
			String SelectedAudTxt = selectedAudience.get(i).getText().trim();
			System.out.println(SelectedAudTxt);
			SelectedAudList.add(SelectedAudTxt);
			Assert.assertEquals(AudList, SelectedAudList);
		}
		Assert.assertEquals(AudList, SelectedAudList);
	}

	public static void SellerRoleDD_Val() throws InterruptedException {

		String[] Sellerrole = Template.get(0).get("Seller role").split("/", 0);
		List<String> SellerList = Arrays.asList(Sellerrole);
		System.out.println(SellerList);

		WebElement SellerRole = driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[15]//select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SellerRole);
		Thread.sleep(500);

		Select SellerRoleBox = new Select(
				driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[15]//select")));
		List<WebElement> selectedSellerRoles = SellerRoleBox.getAllSelectedOptions();

		List<String> SelectedSellerRoleList = new ArrayList<String>();
		for (int i = 0; i < selectedSellerRoles.size(); i++) {
			String SelectedSellerRoleTxt = selectedSellerRoles.get(i).getText().trim();
			System.out.println(SelectedSellerRoleTxt);
			SelectedSellerRoleList.add(SelectedSellerRoleTxt);
		}
		Assert.assertEquals(SellerList, SelectedSellerRoleList);
	}
	
	public static void SalesStageDD_Val() throws InterruptedException {

		String[] SalesStage = Template.get(0).get("Sales stage").split("/", 0);
		List<String> SalesStageList = Arrays.asList(SalesStage);
		System.out.println(SalesStageList);

		WebElement SalesStage_view= driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[16]//select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SalesStage_view);
		Thread.sleep(500);

		Select SalesStageBox = new Select(
				driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[16]//select")));
		List<WebElement> selectedSalesStage = SalesStageBox.getAllSelectedOptions();

		List<String> SelectedSalesStageList = new ArrayList<String>();
		for (int i = 0; i < selectedSalesStage.size(); i++) {
			String SelectedSalesStageTxt = selectedSalesStage.get(i).getText().trim();
			System.out.println(SelectedSalesStageTxt);
			SelectedSalesStageList.add(SelectedSalesStageTxt);
		}
		Assert.assertEquals(SalesStageList, SelectedSalesStageList);
	}

	
	public static void BuyJourDD_Val() throws InterruptedException {

		String[] BuyJour = Template.get(0).get("Buyers journey").split("/", 0);
		List<String> BuyJourList = Arrays.asList(BuyJour);
		System.out.println(BuyJourList);

		WebElement BuyJour_view= driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[17]//select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BuyJour_view);
		Thread.sleep(500);

		Select BuyJournBox = new Select(
				driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[17]//select")));
		List<WebElement> selectedBuyJour = BuyJournBox.getAllSelectedOptions();

		List<String> SelectedBuyJourList = new ArrayList<String>();
		for (int i = 0; i < selectedBuyJour.size(); i++) {
			String SelectedBuyJourTxt = selectedBuyJour.get(i).getText().trim();
			System.out.println(SelectedBuyJourTxt);
			SelectedBuyJourList.add(SelectedBuyJourTxt);
		}
		Assert.assertEquals(BuyJourList, SelectedBuyJourList);
	}
	
	
	public static void GeoDD_Val() throws InterruptedException {

		String[] Geo = Template.get(0).get("Geography").split("/", 0);
		List<String> GeoList = Arrays.asList(Geo);
		System.out.println(GeoList);

		WebElement Geo_view= driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[18]//select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Geo_view);
		Thread.sleep(500);

		Select GeoBox = new Select(
				driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[18]//select")));
		List<WebElement> selectedGeo = GeoBox.getAllSelectedOptions();

		List<String> SelectedGeoList = new ArrayList<String>();
		for (int i = 0; i < selectedGeo.size(); i++) {
			String SelectedGeoTxt = selectedGeo.get(i).getText().trim();
			System.out.println(SelectedGeoTxt);
			SelectedGeoList.add(SelectedGeoTxt);
		}
		Assert.assertEquals(GeoList, SelectedGeoList);
	}
	
	public static void IndustryDD_Val() throws InterruptedException {

		String[] Industry = Template.get(0).get("Industry").split("/", 0);
		List<String> IndustryList = Arrays.asList(Industry);
		System.out.println(IndustryList);

		WebElement Industry_view= driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[19]//select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Industry_view);
		Thread.sleep(500);

		Select IndustryBox = new Select(
				driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[19]//select")));
		List<WebElement> selectedIndustry = IndustryBox.getAllSelectedOptions();

		List<String> SelectedIndustryList = new ArrayList<String>();
		for (int i = 0; i < selectedIndustry.size(); i++) {
			String SelectedIndustryTxt = selectedIndustry.get(i).getText().trim();
			System.out.println(SelectedIndustryTxt);
			SelectedIndustryList.add(SelectedIndustryTxt);
		}
		Assert.assertEquals(IndustryList, SelectedIndustryList);
	}
	
	public static void ServiceLinesDD_Val() throws InterruptedException {

		String[] SL = Template.get(0).get("Service Lines").split("/", 0);
		List<String> SLList = Arrays.asList(SL);
		System.out.println(SLList);

		WebElement SL_view= driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[20]//select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SL_view);
		Thread.sleep(500);

		Select SLBox = new Select(
				driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[20]//select")));
		List<WebElement> selectedSL = SLBox.getAllSelectedOptions();

		List<String> SelectedSLList = new ArrayList<String>();
		for (int i = 0; i < selectedSL.size(); i++) {
			String SelectedSLTxt = selectedSL.get(i).getText().trim();
			System.out.println(SelectedSLTxt);
			SelectedSLList.add(SelectedSLTxt);
		}
		Assert.assertEquals(SLList, SelectedSLList);
	}
	
	public static void SecurityDD_Val() throws InterruptedException {

		String[] Security = Template.get(0).get("Security").split("/", 0);
		List<String> SecurityList = Arrays.asList(Security);
		System.out.println(SecurityList);

		WebElement Security_view= driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[21]//select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Security_view);
		Thread.sleep(500);

		Select SecurityBox = new Select(
				driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[21]//select")));
		List<WebElement> selectedSecurity = SecurityBox.getAllSelectedOptions();

		List<String> SelectedSecurityList = new ArrayList<String>();
		for (int i = 0; i < selectedSecurity.size(); i++) {
			String SelectedSecurityTxt = selectedSecurity.get(i).getText().trim();
			System.out.println(SelectedSecurityTxt);
			SelectedSecurityList.add(SelectedSecurityTxt);
		}
		Assert.assertEquals(SecurityList, SelectedSecurityList);
	}
	public static void QAStatusDD_Val() throws InterruptedException {

		String[] QAStatus = Template.get(0).get("QA Status").split("/", 0);
		List<String> QAStatusList = Arrays.asList(QAStatus);
		System.out.println(QAStatusList);

		WebElement QAStatus_view= driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[22]//select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", QAStatus_view);
		Thread.sleep(500);

		Select QAStatusBox = new Select(
				driver.findElement(By.xpath("//*[@id='mainDiv']//form//div[1]//div[22]//select")));
		List<WebElement> selectedQAStatus = QAStatusBox.getAllSelectedOptions();

		List<String> SelectedQAStatusList = new ArrayList<String>();
		for (int i = 0; i < selectedQAStatus.size(); i++) {
			String SelectedQAStatusTxt = selectedQAStatus.get(i).getText().trim();
			System.out.println(SelectedQAStatusTxt);
			SelectedQAStatusList.add(SelectedQAStatusTxt);
		}
		Assert.assertEquals(QAStatusList, SelectedQAStatusList);
	}

	
	
	public static void QACommDD_Val() throws InterruptedException {
		
		
		
		
		driver.findElement(By.name("qacomment")).sendKeys(Template.get(0).get("QA Comments"));
		driver.findElement(By.xpath("//*[@id=\"mainDiv\"]/form/div[2]/button[1]")).click();

	}
}
