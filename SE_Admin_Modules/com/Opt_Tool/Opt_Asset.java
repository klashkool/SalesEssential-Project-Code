package com.Opt_Tool;

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

public class Opt_Asset extends Salesessential_base {

	static WebDriverWait wait = new WebDriverWait(driver, 200);
	static List<HashMap<String, String>> Opt_Asset = ExcelSheetReader.Opt_Asset_data();
	
public static void Create_Opt_Assets() throws InterruptedException {
	
	Date date = new Date();
	String lastDate = (date.toString().trim());
	// display time and date using toString()
	System.out.println(lastDate);
	
	Thread.sleep(5000);
	WebElement AssetClick = driver.findElement(By.linkText("Assets and links"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AssetClick);

	wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Assets and links")));
	driver.findElement(By.linkText("Assets and links")).click();

	// To click on Create New Button under Assets tab
	Thread.sleep(5000);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(.,'Create new')]")));
	driver.findElement(By.xpath("//button[contains(.,'Create new')]")).click();
	
	Thread.sleep(2000);
  // Load File   
	// Click on load file
	
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(.,'Load File')]")));
			//driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[2]/div/button[2]")).click();
			
			WebElement element = driver.findElement(By.xpath("//button[contains(.,'Load File')]"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			
			// Title
			WebElement Title = driver.findElement(By.name("arTitle"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Title);
			Thread.sleep(5000);
			
			driver.findElement(By.name("arTitle")).sendKeys("OPTAsset " + lastDate);
			
			
			driver.findElement(By.name("arAssetFile")).sendKeys("C:\\Users\\SanthoshNithyaR\\Downloads\\SE\\Test.txt");
			driver.findElement(By.name("arDescription")).sendKeys( Opt_Asset.get(0).get("Description LoadFile"));
			Thread.sleep(5000);
			//Keywords
			
			WebElement Keywords = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[4]/tag-input/div/div/tag-input-form/form/input"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Keywords);
			driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[4]/tag-input/div/div/tag-input-form/form/input"))
					.sendKeys(Opt_Asset.get(0).get("Keywords LoadFile"));
			driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[4]/tag-input/div/div/tag-input-form/form/input"))
					.sendKeys(Keys.ENTER);
			
			// OWNER EMAIL
			
			driver.findElement(By.name("arOwnerEMail")).sendKeys(Opt_Asset.get(0).get("Owner Email"));
			
			// Content Category

			wait.until(ExpectedConditions.presenceOfElementLocated(By.name("arContentCategory")));
			Select catgry = new Select(driver.findElement(By.name("arContentCategory")));
			catgry.selectByVisibleText(Opt_Asset.get(0).get("Content Category"));
			
			// Client Facing 
			
			String[] ClientFacing = Opt_Asset.get(0).get("Client Facing LoadFile").split("/", 0);
			List<String> ClientFacingList = Arrays.asList(ClientFacing);
			System.out.println(ClientFacingList);

			WebElement CF = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[8]/select"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CF);
			Thread.sleep(500);

			Select CFBox = new Select(
					driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[8]/select")));
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
			

			
			
//			String[] Content_Flavour = Opt_Asset.get(0).get("Content Flavour").split("/", 0);
//			List<String> Content_FlavourList = Arrays.asList(Content_Flavour);
//			System.out.println(Content_FlavourList);
//
//			WebElement Content_Flavour1 = driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[9]/select"));
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Content_Flavour1);
//			Thread.sleep(500);
//
//			Select Content_FlavourBox = new Select(
//					driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[9]/select")));
//			List<WebElement> selectedContent_Flavour = Content_FlavourBox.getAllSelectedOptions();
//			
//			List<String> SelectedContent_FlavourList = new ArrayList<String>();
//			for (int p = 0; p < selectedContent_Flavour.size(); p++) {
//				String SelectedContent_FlavourTxt = selectedContent_Flavour.get(p).getText().trim();
//				System.out.println(SelectedContent_FlavourTxt);
//				SelectedContent_FlavourList.add(SelectedContent_FlavourTxt);
//				Assert.assertEquals(Content_FlavourList, SelectedContent_FlavourList);
//			}
//			Assert.assertEquals(Content_FlavourList, SelectedContent_FlavourList);
			
			// content Format
			
//			String[] Content_Format = Mcs_Asset.get(0).get("Content Format").split("/", 0);
//			List<String> Content_FormatList = Arrays.asList(Content_Format);
//			System.out.println(Content_FormatList);
	//
//			WebElement Content_Format1 = driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[10]/select"));
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Content_Format1);
//			Thread.sleep(500);
	//
//			Select Content_FormatBox = new Select(
//					driver.findElement(By.xpath("//*[@id='home-pillar-asset-wrapper']/div/div[3]/app-modify-asset/div/form/div[1]/fieldset/div[10]/select")));
//			List<WebElement> selectedContent_Format = Content_FormatBox.getAllSelectedOptions();
//			
//			List<String> SelectedContent_FormatList = new ArrayList<String>();
//			for (int q = 0; q < selectedContent_Format.size(); q++) {
//				String SelectedContent_FormatTxt = selectedContent_Format.get(q).getText().trim();
//				System.out.println(SelectedContent_FormatTxt);
//				SelectedContent_FlavourList.add(SelectedContent_FormatTxt);
//				Assert.assertEquals(Content_FormatList, SelectedContent_FormatList);
//			}
//			Assert.assertEquals(Content_FormatList, SelectedContent_FormatList);


			// Audience

			String[] Audience = Opt_Asset.get(0).get("Audience LoadFile").split("/", 0);
			List<String> AudList = Arrays.asList(Audience);
			System.out.println(AudList);

			WebElement audience = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[12]/select")); 
					
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", audience);
			Thread.sleep(500);

			Select audienceBox = new Select(driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[12]/select")));
			List<WebElement> selectedAudience = audienceBox.getAllSelectedOptions();

			List<String> SelectedAudList = new ArrayList<String>();
			for (int m = 0; m < selectedAudience.size(); m++) {
				String SelectedAudTxt = selectedAudience.get(m).getText().trim();
				System.out.println(SelectedAudTxt);
				SelectedAudList.add(SelectedAudTxt);
				
			}
			Assert.assertEquals(AudList, SelectedAudList);
			
			// Seller Role
			String[] Sellerrole_Asset = Opt_Asset.get(0).get("SellerRole LoadFile").split("/", 0);
			List<String> SellerList_Asset = Arrays.asList(Sellerrole_Asset);
			System.out.println(SellerList_Asset);

			WebElement SellerRole_Asset = driver
					.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[13]/select"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SellerRole_Asset);
			Thread.sleep(500);

			Select SellerRoleBox_Asset = new Select(
					driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[13]/select")));
			List<WebElement> selectedSellerRoles_Asset = SellerRoleBox_Asset.getAllSelectedOptions();

			List<String> SelectedSellerRoleList_Asset = new ArrayList<String>();
			for (int k = 0; k < selectedSellerRoles_Asset.size(); k++) {
				String SelectedSellerRoleTxt_Asset = selectedSellerRoles_Asset.get(k).getText().trim();
				System.out.println(SelectedSellerRoleTxt_Asset);
				SelectedSellerRoleList_Asset.add(SelectedSellerRoleTxt_Asset);
			}
			Assert.assertEquals(SellerList_Asset, SelectedSellerRoleList_Asset);
			
			// SalesStage

			String[] SalesStage1 = Opt_Asset.get(0).get("SalesStage LoadFile").split("/", 0);
			List<String> SalesStageList1 = Arrays.asList(SalesStage1);
			System.out.println(SalesStageList1);

			WebElement SalesStage1_view = driver
					.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[14]/select"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SalesStage1_view);
			Thread.sleep(500);

			Select SalesStage1Box = new Select(
					driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[14]/select")));
			List<WebElement> selectedSalesStage1 = SalesStage1Box.getAllSelectedOptions();

			List<String> SelectedSalesStage1List = new ArrayList<String>();
			for (int l = 0; l < selectedSalesStage1.size(); l++) {
				String SelectedSalesStage1Txt = selectedSalesStage1.get(l).getText().trim();
				System.out.println(SelectedSalesStage1Txt);
				SelectedSalesStage1List.add(SelectedSalesStage1Txt);
			}
			Assert.assertEquals(SalesStageList1, SelectedSalesStage1List);
			
			// Buyers Journey
			String[] BuyJour = Opt_Asset.get(0).get("Buyersjourney LoadFile").split("/", 0);
			List<String> BuyJourList = Arrays.asList(BuyJour);
			System.out.println(BuyJourList);

			WebElement BuyJour_view = driver
					.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[15]/select"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BuyJour_view);
			Thread.sleep(500);

			Select BuyJournBox = new Select(
					driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[15]/select")));
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
			String[] Geo = Opt_Asset.get(0).get("Geography LoadFile").split("/", 0);
			List<String> GeoList = Arrays.asList(Geo);
			System.out.println(GeoList);

			WebElement Geo_view = driver
					.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[17]/select"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Geo_view);
			Thread.sleep(500);

			Select GeoBox = new Select(
					driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[17]/select")));
			List<WebElement> selectedGeo = GeoBox.getAllSelectedOptions();

			List<String> SelectedGeoList = new ArrayList<String>();
			for (int n = 0; n < selectedGeo.size(); n++) {
				String SelectedGeoTxt = selectedGeo.get(n).getText().trim();
				System.out.println(SelectedGeoTxt);
				SelectedGeoList.add(SelectedGeoTxt);
			}
			Assert.assertEquals(GeoList, SelectedGeoList);
			
			// Industry
			String[] Industry = Opt_Asset.get(0).get("Industry LoadFile").split("/", 0);
			List<String> IndustryList = Arrays.asList(Industry);
			System.out.println(IndustryList);

			WebElement Industry_view = driver
					.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[18]/select"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Industry_view);
			Thread.sleep(500);

			Select IndustryBox = new Select(
					driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[18]/select")));
			List<WebElement> selectedIndustry = IndustryBox.getAllSelectedOptions();

			List<String> SelectedIndustryList = new ArrayList<String>();
			for (int p = 0; p < selectedIndustry.size(); p++) {
				String SelectedIndustryTxt = selectedIndustry.get(p).getText().trim();
				System.out.println(SelectedIndustryTxt);
				SelectedIndustryList.add(SelectedIndustryTxt);
			}
			Assert.assertEquals(IndustryList, SelectedIndustryList);
			
			// Service Line


			Select SLBox = new Select(driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[19]/select")));
			SLBox.selectByVisibleText(" Multicloud Services");
			
			
			driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[3]/app-assets-links/div[2]/app-modify-asset/div/form/div[1]/fieldset/div[19]/select")).click();
			
			// IBM confidential
//
//			String[] IBM = Opt_Asset.get(0).get("IBM Confidential").split("/", 0);
//			List<String> IBMList = Arrays.asList(IBM);
//			System.out.println(IBMList);
//
//			WebElement IBM_view = driver.findElement(By.xpath("//select[@name='ibmConfidential']"));
//			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", IBM_view);
//			Thread.sleep(500);
//
//			Select IBMBox = new Select(driver.findElement(By.xpath("//select[@name='ibmConfidential']")));
//			List<WebElement> selectedIBM = IBMBox.getAllSelectedOptions();
//
//			List<String> SelectedIBMList = new ArrayList<String>();
//			for (int i = 0; i < selectedIBM.size(); i++) {
//				String SelectedIBMTxt = selectedIBM.get(i).getText().trim();
//				System.out.println(SelectedIBMTxt);
//				SelectedIBMList.add(SelectedIBMTxt);
//			}
//			Assert.assertEquals(IBMList, SelectedIBMList);

			
			
			
			// Strategic initiative

			String[] SI = Opt_Asset.get(0).get("Strategic Initiatives").split("/", 0);
			List<String> SIList = Arrays.asList(SI);
			System.out.println(SIList);

			WebElement SI_view = driver.findElement(By.xpath("//select[@name='strategicInit']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SI_view);
			Thread.sleep(500);

			Select SIBox = new Select(driver.findElement(By.xpath("//select[@name='strategicInit']")));
			List<WebElement> selectedSI = SIBox.getAllSelectedOptions();

			List<String> SelectedSIList = new ArrayList<String>();
			for (int i = 0; i < selectedSI.size(); i++) {
				String SelectedSITxt = selectedSI.get(i).getText().trim();
				System.out.println(SelectedSITxt);
				SelectedSIList.add(SelectedSITxt);
			}
			Assert.assertEquals(SIList, SelectedSIList);
			
			// Strategic initiative cateogory
			
			String[] SIC = Opt_Asset.get(0).get("Strategic Initiatives Categories").split("/", 0);
			List<String> SICList = Arrays.asList(SIC);
			System.out.println(SICList);

			WebElement SIC_view = driver.findElement(By.xpath("//select[@name='strategicInitCate']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SIC_view);
			Thread.sleep(5000);

			Select SICBox = new Select(driver.findElement(By.xpath("//select[@name='strategicInitCate']")));
			List<WebElement> selectedSIC = SICBox.getAllSelectedOptions();

			List<String> SelectedSICList = new ArrayList<String>();
			for (int i = 0; i < selectedSIC.size(); i++) {
				String SelectedSICTxt = selectedSIC.get(i).getText().trim();
				System.out.println(SelectedSICTxt);
				SelectedSICList.add(SelectedSICTxt);
			}
			Assert.assertEquals(SICList, SelectedSICList);
   // Covid - 19
			
			String[] COV = Opt_Asset.get(0).get("COVID-19").split("/", 0);
			List<String> COVList = Arrays.asList(COV);
			System.out.println(COVList);

			WebElement COV_view = driver.findElement(By.xpath("//select[@name='covid_19']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", COV_view);
			Thread.sleep(5000);

			Select COVBox = new Select(driver.findElement(By.xpath("//select[@name='covid_19']")));
			List<WebElement> selectedCOV = COVBox.getOptions();

			List<String> SelectedSICList1 = new ArrayList<String>();
			for (int i = 0; i < selectedCOV.size(); i++) {
				String SelectedCOVTxt = selectedCOV.get(i).getText().trim();
				System.out.println(SelectedCOVTxt);
				SelectedSICList1.add(SelectedCOVTxt);
			}

			WebElement CO_view = driver.findElement(By.xpath("//select[@name='covid_19']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CO_view);
			Thread.sleep(500);

			Select COBox = new Select(driver.findElement(By.xpath("//select[@name='covid_19']")));
			COBox.selectByVisibleText("Address new cybersecurity risks ");
			System.out.println("Address new cybersecurity risks ");
			
			// Conversations
			
			String[] CON = Opt_Asset.get(0).get("Conversations").split("/", 0);
			List<String> CONList = Arrays.asList(CON);
			System.out.println(CONList);

			WebElement CON_view = driver.findElement(By.xpath("//select[@name='conversations']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CON_view);
			Thread.sleep(5000);

			Select CONBox = new Select(driver.findElement(By.xpath("//select[@name='conversations']")));
			List<WebElement> selectedCON = CONBox.getOptions();

			List<String> SelectedCONList = new ArrayList<String>();
			for (int i = 0; i < selectedCON.size(); i++) {
				String SelectedCONTxt = selectedCON.get(i).getText().trim();
				System.out.println(SelectedCONTxt);
				SelectedCONList.add(SelectedCONTxt);
			}

			WebElement CN_view = driver.findElement(By.xpath("//select[@name='conversations']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CN_view);
			Thread.sleep(500);

			Select CNBox = new Select(driver.findElement(By.xpath("//select[@name='conversations']")));
			CNBox.selectByVisibleText("Build intelligent supply chains (Conversation 7) ");
			System.out.println("Build intelligent supply chains (Conversation 7) ");

        // Third Party
			
			String[] CON1 = Opt_Asset.get(0).get("Third Party Publisher").split("/", 0);
			List<String> CONList1 = Arrays.asList(CON1);
			System.out.println(CONList1);

			WebElement CON_view1 = driver.findElement(By.xpath("//select[@name='thirdPartyPublisher']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CON_view1);
			Thread.sleep(5000);

			Select CONBox1 = new Select(driver.findElement(By.xpath("//select[@name='thirdPartyPublisher']")));
			List<WebElement> selectedCON1 = CONBox1.getOptions();

			List<String> SelectedCONList1 = new ArrayList<String>();
			for (int i = 0; i < selectedCON1.size(); i++) {
				String SelectedCONTxt1 = selectedCON1.get(i).getText().trim();
				System.out.println(SelectedCONTxt1);
				SelectedCONList1.add(SelectedCONTxt1);
			}

			WebElement TP_view = driver.findElement(By.xpath("//select[@name='thirdPartyPublisher']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TP_view);
			Thread.sleep(500);

			Select TPBox = new Select(driver.findElement(By.xpath("//select[@name='thirdPartyPublisher']")));
			TPBox.selectByVisibleText(" Analyst Limited License");
			System.out.println(" Analyst Limited License");
			
			// Events
			String[] CN = Opt_Asset.get(0).get("Alliances").split("/", 0);
			List<String> CNList = Arrays.asList(CON);
			System.out.println(CNList);

			WebElement CN1_view = driver.findElement(By.xpath("//select[@name='alliances']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CN1_view);
			Thread.sleep(5000);

			Select CN1Box = new Select(driver.findElement(By.xpath("//select[@name='alliances']")));
			List<WebElement> selectedCN = CN1Box.getOptions();

			List<String> SelectedCNList = new ArrayList<String>();
			for (int i = 0; i < selectedCN.size(); i++) {
				String SelectedCNTxt = selectedCN.get(i).getText().trim();
				System.out.println(SelectedCNTxt);
				SelectedCNList.add(SelectedCNTxt);
			}




			WebElement TP_view1 = driver.findElement(By.xpath("//select[@name='alliances']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TP_view1);
			Thread.sleep(500);

			Select TPBox1 = new Select(driver.findElement(By.xpath("//select[@name='alliances']")));
			TPBox1.selectByVisibleText("Apple ");
			System.out.println("Apple ");
			
			
			// Event
			
			String[] EV = Opt_Asset.get(0).get("Event").split("/", 0);
			List<String> EVList = Arrays.asList(EV);
			System.out.println(EVList);

			WebElement EV_view = driver.findElement(By.xpath("//select[@name='events']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", EV_view);
			Thread.sleep(5000);

			Select EVBox = new Select(driver.findElement(By.xpath("//select[@name='events']")));
			List<WebElement> selectedEV = EVBox.getOptions();

			List<String> SelectedEVList = new ArrayList<String>();
			for (int i = 0; i < selectedEV.size(); i++) {
				String SelectedEVTxt = selectedEV.get(i).getText().trim();
				System.out.println(SelectedEVTxt);
				SelectedEVList.add(SelectedEVTxt);
			}




			WebElement EV1_view = driver.findElement(By.xpath("//select[@name='events']"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", EV1_view);
			Thread.sleep(500);

			Select EV1Box = new Select(driver.findElement(By.xpath("//select[@name='events']")));
			EV1Box.selectByVisibleText("Fast Start 2020 ");
			System.out.println("Fast Start 2020 ");



			
			
			// Save asset
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[3]/button")).click();
			
			
//			// Create new to create asset by name
		
			Thread.sleep(10000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(.,'Create new')]")));
			driver.findElement(By.xpath("//button[contains(.,'Create new')]")).click();
			
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//div[2]/div/label/input")).click();
		    driver.findElement(By.id("searchText")).click();
		    driver.findElement(By.id("searchText")).sendKeys("NEtwork");
		    driver.findElement(By.id("index-2")).click();
		    
//		    Thread.sleep(5000);
//			WebElement element2 = driver.findElement(By.xpath("//td[4]/div/a/span"));
//			JavascriptExecutor executor2 = (JavascriptExecutor)driver;
//			executor2.executeScript("arguments[0].click();", element2);
//		    
//			



		



}
}
