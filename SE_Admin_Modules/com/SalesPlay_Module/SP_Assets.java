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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;
import com.utils.ExcelSheetReader;

public class SP_Assets extends Salesessential_base {

	static WebDriverWait wait = new WebDriverWait(driver, 200);
	static List<HashMap<String, String>> Assets = ExcelSheetReader.Assets_data();

	public static void Create_Assets() throws InterruptedException {
		
		
		
		Thread.sleep(5000);
		WebElement AssetClick = driver.findElement(By.linkText("Assets"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AssetClick);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Assets")));
		driver.findElement(By.linkText("Assets")).click();

		// To click on Create New Button under Assets tab
		Thread.sleep(10000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("create-assets-btn")));
		driver.findElement(By.id("create-assets-btn")).click();
		
		Thread.sleep(5000);
		
		 
//		WebElement element = driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[2]/div/button[2]"));
//		Actions builder = new Actions(driver);
//	    builder.moveToElement(element).perform();
//		
		//WebElement LoadFile driver).executeScript("arguments[0].scrollIntoView(true);", LoadFile);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[2]/div/button[2]")));
		//driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[2]/div/button[2]")).click();
		WebElement element = driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[2]/div/button[2]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		//To give the title
		
		WebElement Title = driver.findElement(By.name("arTitle"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Title);
		Thread.sleep(5000);
		
		driver.findElement(By.name("arTitle")).sendKeys(Assets.get(0).get("Title Url"));
		driver.findElement(By.name("arAssetFile")).sendKeys("C:\\Users\\SanthoshNithyaR\\Downloads\\SE\\Test.txt");
		driver.findElement(By.name("arDescription")).sendKeys(Assets.get(0).get("Description URL"));
		Thread.sleep(500);
		
		WebElement Keywords = driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[4]/tag-input/div/div/tag-input-form/form/input"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Keywords);
		driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[4]/tag-input/div/div/tag-input-form/form/input"))
				.sendKeys(Assets.get(0).get("Keywords Url"));
		driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[4]/tag-input/div/div/tag-input-form/form/input"))
				.sendKeys(Keys.ENTER);
		
		// OWNER EMAIL
		
		driver.findElement(By.name("arOwnerEMail")).sendKeys(Assets.get(0).get("Owner email URL"));
		
		// content category
		
		// Content Category

				wait.until(ExpectedConditions.presenceOfElementLocated(By.name("arContentCategory")));
				Select catgry = new Select(driver.findElement(By.name("arContentCategory")));
				catgry.selectByVisibleText(Assets.get(0).get("Content Category Url"));
				
				// Client Facing 
				
				
				
				String[] ClientFacing = Assets.get(0).get("Client facing Url").split("/", 0);
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


		// Audience

				String[] Audience = Assets.get(0).get("Audience Url").split("/", 0);
				List<String> AudList = Arrays.asList(Audience);
				System.out.println(AudList);

				WebElement audience = driver
						.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']//form/div[1]//div[12]//select"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", audience);
				Thread.sleep(500);

				Select audienceBox = new Select(
						driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']//form/div[1]//div[12]//select")));
				List<WebElement> selectedAudience = audienceBox.getAllSelectedOptions();
				
				List<String> SelectedAudList = new ArrayList<String>();
				for (int i = 0; i < selectedAudience.size(); i++) {
					String SelectedAudTxt = selectedAudience.get(i).getText().trim();
					System.out.println(SelectedAudTxt);
					SelectedAudList.add(SelectedAudTxt);
					Assert.assertEquals(AudList, SelectedAudList);
				}
				Assert.assertEquals(AudList, SelectedAudList);

				// Seller Role
				String[] Sellerrole_Asset = Assets.get(0).get("Seller role Url").split("/", 0);
				List<String> SellerList_Asset = Arrays.asList(Sellerrole_Asset);
				System.out.println(SellerList_Asset);

				WebElement SellerRole_Asset = driver
						.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']//form/div[1]//div[13]//select"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SellerRole_Asset);
				Thread.sleep(500);

				Select SellerRoleBox_Asset = new Select(
						driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']//form/div[1]//div[13]//select")));
				List<WebElement> selectedSellerRoles_Asset = SellerRoleBox_Asset.getAllSelectedOptions();

				List<String> SelectedSellerRoleList_Asset = new ArrayList<String>();
				for (int k = 0; k < selectedSellerRoles_Asset.size(); k++) {
					String SelectedSellerRoleTxt_Asset = selectedSellerRoles_Asset.get(k).getText().trim();
					System.out.println(SelectedSellerRoleTxt_Asset);
					SelectedSellerRoleList_Asset.add(SelectedSellerRoleTxt_Asset);
				}
				Assert.assertEquals(SellerList_Asset, SelectedSellerRoleList_Asset);
				
				// SalesStage

				String[] SalesStage1 = Assets.get(0).get("Sales stage Url").split("/", 0);
				List<String> SalesStageList1 = Arrays.asList(SalesStage1);
				System.out.println(SalesStageList1);

				WebElement SalesStage1_view = driver
						.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']//form/div[1]//div[14]//select"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SalesStage1_view);
				Thread.sleep(500);

				Select SalesStage1Box = new Select(
						driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']//form/div[1]//div[14]//select")));
				List<WebElement> selectedSalesStage1 = SalesStage1Box.getAllSelectedOptions();

				List<String> SelectedSalesStage1List = new ArrayList<String>();
				for (int l = 0; l < selectedSalesStage1.size(); l++) {
					String SelectedSalesStage1Txt = selectedSalesStage1.get(l).getText().trim();
					System.out.println(SelectedSalesStage1Txt);
					SelectedSalesStage1List.add(SelectedSalesStage1Txt);
				}
				Assert.assertEquals(SalesStageList1, SelectedSalesStage1List);
				
				// Buyers Journey
				String[] BuyJour = Assets.get(0).get("Buyers journey Url").split("/", 0);
				List<String> BuyJourList = Arrays.asList(BuyJour);
				System.out.println(BuyJourList);

				WebElement BuyJour_view = driver
						.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']//form/div[1]//div[15]//select"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BuyJour_view);
				Thread.sleep(500);

				Select BuyJournBox = new Select(
						driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']//form/div[1]//div[15]//select")));
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
				String[] Geo = Assets.get(0).get(" Geography Url").split("/", 0);
				List<String> GeoList = Arrays.asList(Geo);
				System.out.println(GeoList);

				WebElement Geo_view = driver
						.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']//form/div[1]//div[17]//select"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Geo_view);
				Thread.sleep(500);

				Select GeoBox = new Select(
						driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']//form/div[1]//div[17]//select")));
				List<WebElement> selectedGeo = GeoBox.getAllSelectedOptions();

				List<String> SelectedGeoList = new ArrayList<String>();
				for (int n = 0; n < selectedGeo.size(); n++) {
					String SelectedGeoTxt = selectedGeo.get(n).getText().trim();
					System.out.println(SelectedGeoTxt);
					SelectedGeoList.add(SelectedGeoTxt);
				}
				Assert.assertEquals(GeoList, SelectedGeoList);
				
				// Industry
				String[] Industry = Assets.get(0).get("Industry Name").split("/", 0);
				List<String> IndustryList = Arrays.asList(Industry);
				System.out.println(IndustryList);

				WebElement Industry_view = driver
						.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']//form/div[1]//div[18]//select"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Industry_view);
				Thread.sleep(500);

				Select IndustryBox = new Select(
						driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']//form/div[1]//div[18]//select")));
				List<WebElement> selectedIndustry = IndustryBox.getAllSelectedOptions();

				List<String> SelectedIndustryList = new ArrayList<String>();
				for (int p = 0; p < selectedIndustry.size(); p++) {
					String SelectedIndustryTxt = selectedIndustry.get(p).getText().trim();
					System.out.println(SelectedIndustryTxt);
					SelectedIndustryList.add(SelectedIndustryTxt);
				}
				Assert.assertEquals(IndustryList, SelectedIndustryList);
				
				// Service lines

		/*
		 * String[] SL = Assets.get(0).get("Service Lines Url").split("/", 0);
		 * List<String> SLList = Arrays.asList(SL); System.out.println(SLList);
		 * 
		 * WebElement SL_view = driver .findElement(By.xpath(
		 * "//*[@id='home-pillar-asset-wrapper']//form/div[1]//div[19]//select"));
		 * ((JavascriptExecutor)
		 * driver).executeScript("arguments[0].scrollIntoView(true);", SL_view);
		 * Thread.sleep(500);
		 * 
		 * Select SLBox = new Select( driver.findElement(By.xpath(
		 * "//*[@id='home-pillar-asset-wrapper']//form/div[1]//div[19]//select")));
		 * List<WebElement> selectedSL = SLBox.getAllSelectedOptions();
		 * 
		 * List<String> SelectedSLList = new ArrayList<String>(); for (int i = 0; i <
		 * selectedSL.size(); i++) { String SelectedSLTxt =
		 * selectedSL.get(i).getText().trim(); System.out.println(SelectedSLTxt);
		 * SelectedSLList.add(SelectedSLTxt); } //Assert.assertEquals(SLList,
		 * SelectedSLList);
		 */		
				
				Select SLBox = new Select(driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']//form/div[1]//div[19]//select")));
				SLBox.selectByVisibleText("Not specified");
				
				
				driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[3]/button[1]")).click();

		
		// to publish
				 // To publish

			    WebElement element6 = driver.findElement(By.xpath("//a[3]/span"));
			    JavascriptExecutor executor6 = (JavascriptExecutor)driver;
			    executor6.executeScript("arguments[0].click();", element6);
			    Thread.sleep(5000);

			    driver.findElement(By.xpath("//button[contains(.,'Yes')]")).click();

		
	    
	  }



		}

