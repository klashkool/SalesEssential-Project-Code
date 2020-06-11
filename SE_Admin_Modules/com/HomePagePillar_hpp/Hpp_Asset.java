package com.HomePagePillar_hpp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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

public class Hpp_Asset extends Salesessential_base {

	static WebDriverWait wait = new WebDriverWait(driver, 200);
	static List<HashMap<String, String>> Hpp_Asset = ExcelSheetReader.Hpp_Asset_data();
	
public static void Create_Hpp_Assets() throws InterruptedException {
	
	Date date = new Date();
	String lastDate = (date.toString().trim());
	// display time and date using toString()
	System.out.println(lastDate);
	
	

	
		
		
		
		Thread.sleep(10000);
		WebElement AssetClick = driver.findElement(By.xpath("//nav[@id='pillar-nav']/a[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AssetClick);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//nav[@id='pillar-nav']/a[2]")));
		driver.findElement(By.xpath("//*[@id='pillar-nav']/a[2]")).click();

		// To click on Create New Button under Assets tab
		Thread.sleep(10000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(.,'CREATE NEW')]")));
		driver.findElement(By.xpath("//button[contains(.,'CREATE NEW')]")).click();
		
		Thread.sleep(2000);
		
		// Click on load file
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[2]/div/button[2]")));
		//driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[2]/div/button[2]")).click();
		WebElement element = driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[2]/div/button[2]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		//To give the title
		
		
		
//		WebElement element3 = driver.findElement(By.name("arTitle"));
//		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
//		executor3.executeScript("arguments[0].click();", element3);
//		
		WebElement Title = driver.findElement(By.name("arTitle"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Title);
		Thread.sleep(5000);
		
		driver.findElement(By.name("arTitle")).sendKeys("HppAsset " + lastDate);
		
		
		driver.findElement(By.name("arAssetFile")).sendKeys("C:\\Users\\SanthoshNithyaR\\Downloads\\SE\\Test.txt");
		driver.findElement(By.name("arDescription")).sendKeys(Hpp_Asset.get(0).get("Description LoadFile"));
		Thread.sleep(5000);
        
		
		//Keywords
		
		WebElement Keywords = driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[4]/tag-input/div/div/tag-input-form/form/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Keywords);
		driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[4]/tag-input/div/div/tag-input-form/form/input"))
				.sendKeys(Hpp_Asset.get(0).get("Keywords LoadFile"));
		driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[4]/tag-input/div/div/tag-input-form/form/input"))
				.sendKeys(Keys.ENTER);
		
		// OWNER EMAIL
		
		driver.findElement(By.name("arOwnerEMail")).sendKeys(Hpp_Asset.get(0).get("Owner Email"));
		
		// Content Category

		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("arContentCategory")));
		Select catgry = new Select(driver.findElement(By.name("arContentCategory")));
		catgry.selectByVisibleText(Hpp_Asset.get(0).get("Content Category"));
		
		// Client Facing 
		
		String[] ClientFacing = Hpp_Asset.get(0).get("Client Facing LoadFile").split("/", 0);
		List<String> ClientFacingList = Arrays.asList(ClientFacing);
		System.out.println(ClientFacingList);

		WebElement CF = driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[8]/select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CF);
		Thread.sleep(500);

		Select CFBox = new Select(
				driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[8]/select")));
		List<WebElement> selectedCF = CFBox.getAllSelectedOptions();
		
		List<String> SelectedCFList = new ArrayList<String>();
		for (int h = 0; h < selectedCF.size(); h++) {
			String SelectedCFTxt = selectedCF.get(h).getText().trim();
			System.out.println(SelectedCFTxt);
			SelectedCFList.add(SelectedCFTxt);
			Assert.assertEquals(ClientFacingList, SelectedCFList);
		}
		Assert.assertEquals(ClientFacingList, SelectedCFList);
		
		// Content Flavour
		

		
		
		String[] Content_Flavour = Hpp_Asset.get(0).get("Content Flavour").split("/", 0);
		List<String> Content_FlavourList = Arrays.asList(Content_Flavour);
		System.out.println(Content_FlavourList);

		WebElement Content_Flavour1 = driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[9]/select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Content_Flavour1);
		Thread.sleep(500);

		Select Content_FlavourBox = new Select(
				driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[9]/select")));
		List<WebElement> selectedContent_Flavour = Content_FlavourBox.getAllSelectedOptions();
		
		List<String> SelectedContent_FlavourList = new ArrayList<String>();
		for (int p = 0; p < selectedContent_Flavour.size(); p++) {
			String SelectedContent_FlavourTxt = selectedContent_Flavour.get(p).getText().trim();
			System.out.println(SelectedContent_FlavourTxt);
			SelectedContent_FlavourList.add(SelectedContent_FlavourTxt);
			Assert.assertEquals(Content_FlavourList, SelectedContent_FlavourList);
		}
		Assert.assertEquals(Content_FlavourList, SelectedContent_FlavourList);
		
		// content Format
		
//		String[] Content_Format = Mcs_Asset.get(0).get("Content Format").split("/", 0);
//		List<String> Content_FormatList = Arrays.asList(Content_Format);
//		System.out.println(Content_FormatList);
//
//		WebElement Content_Format1 = driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[10]/select"));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Content_Format1);
//		Thread.sleep(500);
//
//		Select Content_FormatBox = new Select(
//				driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[10]/select")));
//		List<WebElement> selectedContent_Format = Content_FormatBox.getAllSelectedOptions();
//		
//		List<String> SelectedContent_FormatList = new ArrayList<String>();
//		for (int q = 0; q < selectedContent_Format.size(); q++) {
//			String SelectedContent_FormatTxt = selectedContent_Format.get(q).getText().trim();
//			System.out.println(SelectedContent_FormatTxt);
//			SelectedContent_FlavourList.add(SelectedContent_FormatTxt);
//			Assert.assertEquals(Content_FormatList, SelectedContent_FormatList);
//		}
//		Assert.assertEquals(Content_FormatList, SelectedContent_FormatList);


		// Audience

		String[] Audience = Hpp_Asset.get(0).get("Audience LoadFile").split("/", 0);
		List<String> AudList = Arrays.asList(Audience);
		System.out.println(AudList);

		WebElement audience = driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[12]/select")); 
				
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", audience);
		Thread.sleep(500);

		Select audienceBox = new Select(driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[12]/select")));
		List<WebElement> selectedAudience = audienceBox.getAllSelectedOptions();

		List<String> SelectedAudList = new ArrayList<String>();
		for (int m = 0; m < selectedAudience.size(); m++) {
			String SelectedAudTxt = selectedAudience.get(m).getText().trim();
			System.out.println(SelectedAudTxt);
			SelectedAudList.add(SelectedAudTxt);
			
		}
		Assert.assertEquals(AudList, SelectedAudList);
		
		// Seller Role
		String[] Sellerrole_Asset = Hpp_Asset.get(0).get("SellerRole LoadFile").split("/", 0);
		List<String> SellerList_Asset = Arrays.asList(Sellerrole_Asset);
		System.out.println(SellerList_Asset);

		WebElement SellerRole_Asset = driver
				.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[13]/select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SellerRole_Asset);
		Thread.sleep(500);

		Select SellerRoleBox_Asset = new Select(
				driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[13]/select")));
		List<WebElement> selectedSellerRoles_Asset = SellerRoleBox_Asset.getAllSelectedOptions();

		List<String> SelectedSellerRoleList_Asset = new ArrayList<String>();
		for (int k = 0; k < selectedSellerRoles_Asset.size(); k++) {
			String SelectedSellerRoleTxt_Asset = selectedSellerRoles_Asset.get(k).getText().trim();
			System.out.println(SelectedSellerRoleTxt_Asset);
			SelectedSellerRoleList_Asset.add(SelectedSellerRoleTxt_Asset);
		}
		Assert.assertEquals(SellerList_Asset, SelectedSellerRoleList_Asset);
		
		// SalesStage

		String[] SalesStage1 = Hpp_Asset.get(0).get("SalesStage LoadFile").split("/", 0);
		List<String> SalesStageList1 = Arrays.asList(SalesStage1);
		System.out.println(SalesStageList1);

		WebElement SalesStage1_view = driver
				.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[14]/select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SalesStage1_view);
		Thread.sleep(500);

		Select SalesStage1Box = new Select(
				driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[14]/select")));
		List<WebElement> selectedSalesStage1 = SalesStage1Box.getAllSelectedOptions();

		List<String> SelectedSalesStage1List = new ArrayList<String>();
		for (int l = 0; l < selectedSalesStage1.size(); l++) {
			String SelectedSalesStage1Txt = selectedSalesStage1.get(l).getText().trim();
			System.out.println(SelectedSalesStage1Txt);
			SelectedSalesStage1List.add(SelectedSalesStage1Txt);
		}
		Assert.assertEquals(SalesStageList1, SelectedSalesStage1List);
		
		// Buyers Journey
		String[] BuyJour = Hpp_Asset.get(0).get("Buyersjourney LoadFile").split("/", 0);
		List<String> BuyJourList = Arrays.asList(BuyJour);
		System.out.println(BuyJourList);

		WebElement BuyJour_view = driver
				.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[15]/select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BuyJour_view);
		Thread.sleep(500);

		Select BuyJournBox = new Select(
				driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[15]/select")));
		List<WebElement> selectedBuyJour = BuyJournBox.getAllSelectedOptions();

		List<String> SelectedBuyJourList = new ArrayList<String>();
		for (int m = 0; m < selectedBuyJour.size(); m++) {
			String SelectedBuyJourTxt = selectedBuyJour.get(m).getText().trim();
			System.out.println(SelectedBuyJourTxt);
			SelectedBuyJourList.add(SelectedBuyJourTxt);
		}
		Assert.assertEquals(BuyJourList, SelectedBuyJourList);
		
		// Language
		WebElement Language = driver.findElement(By.name("arLanguage"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Language);
		Thread.sleep(500);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("arLanguage")));
		Select Lang = new Select(driver.findElement(By.name("arLanguage")));
		Lang.selectByIndex(2);// (Template.get(0).get("Language"));

		// Geography
		String[] Geo = Hpp_Asset.get(0).get("Geography LoadFile").split("/", 0);
		List<String> GeoList = Arrays.asList(Geo);
		System.out.println(GeoList);

		WebElement Geo_view = driver
				.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[17]/select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Geo_view);
		Thread.sleep(500);

		Select GeoBox = new Select(
				driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[17]/select")));
		List<WebElement> selectedGeo = GeoBox.getAllSelectedOptions();

		List<String> SelectedGeoList = new ArrayList<String>();
		for (int n = 0; n < selectedGeo.size(); n++) {
			String SelectedGeoTxt = selectedGeo.get(n).getText().trim();
			System.out.println(SelectedGeoTxt);
			SelectedGeoList.add(SelectedGeoTxt);
		}
		Assert.assertEquals(GeoList, SelectedGeoList);
		
		// Industry
		String[] Industry = Hpp_Asset.get(0).get("Industry LoadFile").split("/", 0);
		List<String> IndustryList = Arrays.asList(Industry);
		System.out.println(IndustryList);

		WebElement Industry_view = driver
				.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[18]/select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Industry_view);
		Thread.sleep(500);

		Select IndustryBox = new Select(
				driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[18]/select")));
		List<WebElement> selectedIndustry = IndustryBox.getAllSelectedOptions();

		List<String> SelectedIndustryList = new ArrayList<String>();
		for (int p = 0; p < selectedIndustry.size(); p++) {
			String SelectedIndustryTxt = selectedIndustry.get(p).getText().trim();
			System.out.println(SelectedIndustryTxt);
			SelectedIndustryList.add(SelectedIndustryTxt);
		}
		Assert.assertEquals(IndustryList, SelectedIndustryList);
		
		// Service Line


		Select SLBox = new Select(driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[19]/select")));
		SLBox.selectByVisibleText("Not specified");
		
		
		driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[19]/select")).click();
		driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[3]/button[1]")).click();



		
		// To publish
		
		WebElement element6 = driver.findElement(By.xpath("//a[3]/span"));
		JavascriptExecutor executor6 = (JavascriptExecutor)driver;
		executor6.executeScript("arguments[0].click();", element6);
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//button[contains(.,'Yes')]")).click();



}
}
