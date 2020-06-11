package com.ManageAssets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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

public class Publish_Assets extends Salesessential_base {

	static WebDriverWait wait = new WebDriverWait(driver, 200);
	static List<HashMap<String, String>> ManageAssets = ExcelSheetReader.ManageAssets_data();
	public static String Asset_title;

	public static void Create_Assets() throws InterruptedException {

		Thread.sleep(2000);

		Date date = new Date();
		String lastDate = (date.toString().trim());
		// display time and date using toString()
		System.out.println(lastDate);

		driver.findElement(By.name("asttitle")).sendKeys(
				"Ran Walker is the author of the forthcoming 50-word story collection THE STRANGE MUSEUM. He credits this site with  "
						+ lastDate);
		driver.findElement(By.xpath("//small")).click();
		driver.findElement(By.xpath("//input[@name='url']")).sendKeys(ManageAssets.get(0).get("URL"));

		driver.findElement(By.name("accGuidence")).sendKeys(ManageAssets.get(0).get("Instructions:"));

		driver.findElement(By.name("astdesc")).sendKeys(ManageAssets.get(0).get("Description"));
		driver.findElement(By.xpath("//form/input")).sendKeys(ManageAssets.get(0).get("Keywords"));
		driver.findElement(By.xpath("//form/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.name("owner")).sendKeys(ManageAssets.get(0).get("OwnerEmail"));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("astContentCategory")));
		Select catgry = new Select(driver.findElement(By.name("astContentCategory")));
		catgry.selectByVisibleText(ManageAssets.get(0).get("Content Category"));

	}
	// Audience

	public static void AudienceDD_Val() throws InterruptedException {

		String[] Audience = ManageAssets.get(0).get("Audience").split("/", 0);
		List<String> AudList = Arrays.asList(Audience);
		System.out.println(AudList);

		WebElement audience = driver.findElement(By.xpath("//select[@name='audiences']"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", audience);
		Thread.sleep(500);

		Select audienceBox = new Select(driver.findElement(By.xpath("//select[@name='audiences']")));
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

	// Seller Role

	public static void SellerRoleDD_Val() throws InterruptedException {

		String[] Sellerrole = ManageAssets.get(0).get("Seller role").split("/", 0);
		List<String> SellerList = Arrays.asList(Sellerrole);
		System.out.println(SellerList);

		WebElement SellerRole = driver.findElement(By.xpath("//select[@name='sellerRoles']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SellerRole);
		Thread.sleep(500);

		Select SellerRoleBox = new Select(driver.findElement(By.xpath("//select[@name='sellerRoles']")));
		List<WebElement> selectedSellerRoles = SellerRoleBox.getAllSelectedOptions();

		List<String> SelectedSellerRoleList = new ArrayList<String>();
		for (int i = 0; i < selectedSellerRoles.size(); i++) {
			String SelectedSellerRoleTxt = selectedSellerRoles.get(i).getText().trim();
			System.out.println(SelectedSellerRoleTxt);
			SelectedSellerRoleList.add(SelectedSellerRoleTxt);
		}
		Assert.assertEquals(SellerList, SelectedSellerRoleList);
	}

	// SSales Stage

	public static void SalesStageDD_Val() throws InterruptedException {

		String[] SalesStage = ManageAssets.get(0).get("Sales stage").split("/", 0);
		List<String> SalesStageList = Arrays.asList(SalesStage);
		System.out.println(SalesStageList);

		WebElement SalesStage_view = driver.findElement(By.xpath("//select[@name='salesStages']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SalesStage_view);
		Thread.sleep(500);

		Select SalesStageBox = new Select(driver.findElement(By.xpath("//select[@name='salesStages']")));
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

		String[] BuyJour = ManageAssets.get(0).get("Buyers journey").split("/", 0);
		List<String> BuyJourList = Arrays.asList(BuyJour);
		System.out.println(BuyJourList);

		WebElement BuyJour_view = driver.findElement(By.xpath("//select[@name='buyerJournies']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BuyJour_view);
		Thread.sleep(500);

		Select BuyJournBox = new Select(driver.findElement(By.xpath("//select[@name='buyerJournies']")));
		List<WebElement> selectedBuyJour = BuyJournBox.getAllSelectedOptions();

		List<String> SelectedBuyJourList = new ArrayList<String>();
		for (int m = 0; m < selectedBuyJour.size(); m++) {
			String SelectedBuyJourTxt = selectedBuyJour.get(m).getText().trim();
			System.out.println(SelectedBuyJourTxt);
			SelectedBuyJourList.add(SelectedBuyJourTxt);
		}
		Assert.assertEquals(BuyJourList, SelectedBuyJourList);
	}

	public static void Language_Val() throws InterruptedException {

		WebElement Language = driver.findElement(By.name("language"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Language);
		Thread.sleep(500);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("language")));
		Select Lang = new Select(driver.findElement(By.name("language")));
		Lang.selectByIndex(2);
	}

	public static void GeoDD_Val() throws InterruptedException {

		String[] Geo = ManageAssets.get(0).get("Geography").split("/", 0);
		List<String> GeoList = Arrays.asList(Geo);
		System.out.println(GeoList);

		WebElement Geo_view = driver.findElement(By.xpath("//select[@name='geography']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Geo_view);
		Thread.sleep(500);

		Select GeoBox = new Select(driver.findElement(By.xpath("//select[@name='geography']")));
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

		String[] Industry = ManageAssets.get(0).get("Industry").split("/", 0);
		List<String> IndustryList = Arrays.asList(Industry);
		System.out.println(IndustryList);

		WebElement Industry_view = driver.findElement(By.xpath("//select[@name='industry']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Industry_view);
		Thread.sleep(500);

		Select IndustryBox = new Select(driver.findElement(By.xpath("//select[@name='industry']")));
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

		String[] SL = ManageAssets.get(0).get("Service Lines").split("/", 0);
		List<String> SLList = Arrays.asList(SL);
		System.out.println(SLList);

		WebElement SL_view = driver.findElement(By.xpath("//select[@name='servicelines']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SL_view);
		Thread.sleep(500);

		Select SLBox = new Select(driver.findElement(By.xpath("//select[@name='servicelines']")));
		List<WebElement> selectedSL = SLBox.getAllSelectedOptions();

		List<String> SelectedSLList = new ArrayList<String>();
		for (int i = 0; i < selectedSL.size(); i++) {
			String SelectedSLTxt = selectedSL.get(i).getText().trim();
			System.out.println(SelectedSLTxt);
			SelectedSLList.add(SelectedSLTxt);
		}
		Assert.assertEquals(SLList, SelectedSLList);
	}

	public static void StrategicInitiatives_Val() throws InterruptedException {

		String[] SI = ManageAssets.get(0).get("Strategic Initiatives").split("/", 0);
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
	}

	public static void StrategicInitiativesCategories_Val() throws InterruptedException {

		String[] SIC = ManageAssets.get(0).get("Strategic Initiatives Categories").split("/", 0);
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
	}
	// Covid-19

	public static void Covid19_Val() throws InterruptedException {
		String[] COV = ManageAssets.get(0).get("COVID-19:").split("/", 0);
		List<String> COVList = Arrays.asList(COV);
		System.out.println(COVList);

		WebElement COV_view = driver.findElement(By.xpath("//select[@name='covid_19']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", COV_view);
		Thread.sleep(5000);

		Select COVBox = new Select(driver.findElement(By.xpath("//select[@name='covid_19']")));
		List<WebElement> selectedCOV = COVBox.getOptions();

		List<String> SelectedSICList = new ArrayList<String>();
		for (int i = 0; i < selectedCOV.size(); i++) {
			String SelectedCOVTxt = selectedCOV.get(i).getText().trim();
			System.out.println(SelectedCOVTxt);
			SelectedSICList.add(SelectedCOVTxt);
		}

		WebElement CO_view = driver.findElement(By.xpath("//select[@name='covid_19']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CO_view);
		Thread.sleep(500);

		Select COBox = new Select(driver.findElement(By.xpath("//select[@name='covid_19']")));
		COBox.selectByVisibleText("Address new cybersecurity risks ");
		System.out.println("Address new cybersecurity risks ");
	}

	// Conversations

	public static void Conversations_Val() throws InterruptedException {
		String[] CON = ManageAssets.get(0).get("Conversations:").split("/", 0);
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
		CNBox.selectByVisibleText(" Build intelligent supply chains (Conversation 7) ");
		System.out.println(" Build intelligent supply chains (Conversation 7) ");
	}
	// Third Party

	public static void ThirdParty_Val() throws InterruptedException {
		String[] CON = ManageAssets.get(0).get("Third Party Publisher:").split("/", 0);
		List<String> CONList = Arrays.asList(CON);
		System.out.println(CONList);

		WebElement CON_view = driver.findElement(By.xpath("//select[@name='thirdPartyPublisher']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CON_view);
		Thread.sleep(5000);

		Select CONBox = new Select(driver.findElement(By.xpath("//select[@name='thirdPartyPublisher']")));
		List<WebElement> selectedCON = CONBox.getOptions();

		List<String> SelectedCONList = new ArrayList<String>();
		for (int i = 0; i < selectedCON.size(); i++) {
			String SelectedCONTxt = selectedCON.get(i).getText().trim();
			System.out.println(SelectedCONTxt);
			SelectedCONList.add(SelectedCONTxt);
		}

		WebElement TP_view = driver.findElement(By.xpath("//select[@name='thirdPartyPublisher']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TP_view);
		Thread.sleep(500);

		Select TPBox = new Select(driver.findElement(By.xpath("//select[@name='thirdPartyPublisher']")));
		TPBox.selectByVisibleText(" Analyst Limited License");
		System.out.println(" Analyst Limited License");
	}
	
public static void Alliances_Val() throws InterruptedException {
		
		String[] CON = ManageAssets.get(0).get("Alliances:").split("/", 0);
		List<String> CONList = Arrays.asList(CON);
		System.out.println(CONList);

		WebElement CON_view = driver.findElement(By.xpath("//select[@name='alliances']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CON_view);
		Thread.sleep(5000);

		Select CONBox = new Select(driver.findElement(By.xpath("//select[@name='alliances']")));
		List<WebElement> selectedCON = CONBox.getOptions();

		List<String> SelectedCONList = new ArrayList<String>();
		for (int i = 0; i < selectedCON.size(); i++) {
			String SelectedCONTxt = selectedCON.get(i).getText().trim();
			System.out.println(SelectedCONTxt);
			SelectedCONList.add(SelectedCONTxt);
		}




		WebElement TP_view = driver.findElement(By.xpath("//select[@name='alliances']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TP_view);
		Thread.sleep(500);

		Select TPBox = new Select(driver.findElement(By.xpath("//select[@name='alliances']")));
		TPBox.selectByVisibleText("Apple ");
		System.out.println("Apple ");
			}



public static void Event_Val() throws InterruptedException {
	
	String[] CON = ManageAssets.get(0).get("Event:").split("/", 0);
	List<String> CONList = Arrays.asList(CON);
	System.out.println(CONList);

	WebElement CON_view = driver.findElement(By.xpath("//select[@name='events']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CON_view);
	Thread.sleep(5000);

	Select CONBox = new Select(driver.findElement(By.xpath("//select[@name='events']")));
	List<WebElement> selectedCON = CONBox.getOptions();
	int j = selectedCON.size();
	System.out.println(j);

	List<String> SelectedCONList = new ArrayList<String>();
	for (int i = 0; i < selectedCON.size(); i++) {
		String SelectedCONTxt = selectedCON.get(i).getText().trim();
		System.out.println(SelectedCONTxt);
		SelectedCONList.add(SelectedCONTxt);
	}




	WebElement TP_view = driver.findElement(By.xpath("//select[@name='events']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TP_view);
	Thread.sleep(500);

	Select TPBox = new Select(driver.findElement(By.xpath("//select[@name='events']")));
	TPBox.selectByVisibleText("Fast Start 2020 ");
	System.out.println("Fast Start 2020 ");
		}


public static void Competitor_Val() throws InterruptedException {
	
	String[] COM = ManageAssets.get(0).get("Competitor:").split("/", 0);
	List<String> COMList = Arrays.asList(COM);
	System.out.println(COMList);

	WebElement COM_view = driver.findElement(By.xpath("//select[@name='competitor']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", COM_view);
	Thread.sleep(5000);

	Select COMBox = new Select(driver.findElement(By.xpath("//select[@name='competitor']")));
	List<WebElement> selectedCOM = COMBox.getOptions();
	int j = selectedCOM.size();
	System.out.println(j);

	List<String> SelectedCOMList = new ArrayList<String>();
	for (int i = 0; i < selectedCOM.size(); i++) {
		String SelectedCOMTxt = selectedCOM.get(i).getText().trim();
		System.out.println(SelectedCOMTxt);
		SelectedCOMList.add(SelectedCOMTxt);
	}




	WebElement TP_view = driver.findElement(By.xpath("//select[@name='alliances']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TP_view);
	Thread.sleep(500);

	Select TPBox = new Select(driver.findElement(By.xpath("//select[@name='competitor']")));
	TPBox.selectByVisibleText("ABeam Consulting ");
	System.out.println("ABeam Consulting ");
		}

public static void Industry_sector_Val() throws InterruptedException {
	
	String[] CON = ManageAssets.get(0).get("Industry sector:").split("/", 0);
	List<String> CONList = Arrays.asList(CON);
	System.out.println(CONList);

	WebElement CON_view = driver.findElement(By.xpath("//select[@name='industrySector']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CON_view);
	Thread.sleep(5000);

	Select CONBox = new Select(driver.findElement(By.xpath("//select[@name='industrySector']")));
	List<WebElement> selectedCON = CONBox.getOptions();
	int m = selectedCON.size();
	System.out.println(m);

	List<String> SelectedCONList = new ArrayList<String>();
	for (int i = 0; i < selectedCON.size(); i++) {
		String SelectedCONTxt = selectedCON.get(i).getText().trim();
		System.out.println(SelectedCONTxt);
		SelectedCONList.add(SelectedCONTxt);
	}




	WebElement TP_view = driver.findElement(By.xpath("//select[@name='alliances']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TP_view);
	Thread.sleep(500);

	Select TPBox = new Select(driver.findElement(By.xpath("//select[@name='industrySector']")));
	TPBox.selectByVisibleText(" Computer Services Industry ");
	System.out.println(" Computer Services Industry ");
		}

public static void Seismic_profile_distribution_Val() throws InterruptedException {
	
	String[] CON = ManageAssets.get(0).get("Seismic profile distribution:").split("/", 0);
	List<String> CONList = Arrays.asList(CON);
	System.out.println(CONList);

	WebElement CON_view = driver.findElement(By.xpath("//select[@name='seismicProfileDistribution']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CON_view);
	Thread.sleep(5000);

	Select CONBox = new Select(driver.findElement(By.xpath("//select[@name='seismicProfileDistribution']")));
	List<WebElement> selectedCON = CONBox.getOptions();
	int l = selectedCON.size();
	System.out.println(l);

	List<String> SelectedCONList = new ArrayList<String>();
	for (int i = 0; i < selectedCON.size(); i++) {
		String SelectedCONTxt = selectedCON.get(i).getText().trim();
		System.out.println(SelectedCONTxt);
		SelectedCONList.add(SelectedCONTxt);
	}




	WebElement TP_view = driver.findElement(By.xpath("//select[@name='seismicProfileDistribution']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TP_view);
	Thread.sleep(500);

	Select TPBox = new Select(driver.findElement(By.xpath("//select[@name='seismicProfileDistribution']")));
	TPBox.selectByVisibleText(" GBS ");
	System.out.println(" GBS ");
		}

public static void Target_buyer_Val() throws InterruptedException {
	
	String[] CON = ManageAssets.get(0).get("Target buyer:").split("/", 0);
	List<String> CONList = Arrays.asList(CON);
	System.out.println(CONList);

	WebElement CON_view = driver.findElement(By.xpath("//select[@name='targetBuyer']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CON_view);
	Thread.sleep(5000);

	Select CONBox = new Select(driver.findElement(By.xpath("//select[@name='targetBuyer']")));
	List<WebElement> selectedCON = CONBox.getOptions();
	int g = selectedCON.size();
	System.out.println(g);

	List<String> SelectedCONList = new ArrayList<String>();
	for (int i = 0; i < selectedCON.size(); i++) {
		String SelectedCONTxt = selectedCON.get(i).getText().trim();
		System.out.println(SelectedCONTxt);
		SelectedCONList.add(SelectedCONTxt);
	}




	WebElement TP_view = driver.findElement(By.xpath("//select[@name='targetBuyer']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TP_view);
	Thread.sleep(500);

	Select TPBox = new Select(driver.findElement(By.xpath("//select[@name='targetBuyer']")));
	TPBox.selectByVisibleText("Agriculture or Natural Resources ");
	System.out.println("Agriculture or Natural Resources ");
		}

public static void Market_Val() throws InterruptedException {
	
	String[] CON = ManageAssets.get(0).get("Market:").split("/", 0);
	List<String> CONList = Arrays.asList(CON);
	System.out.println(CONList);

	WebElement CON_view = driver.findElement(By.xpath("//select[@name='market']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CON_view);
	Thread.sleep(5000);

	Select CONBox = new Select(driver.findElement(By.xpath("//select[@name='market']")));
	List<WebElement> selectedCON = CONBox.getOptions();
	int n = selectedCON.size();
	System.out.println(n);

	List<String> SelectedCONList = new ArrayList<String>();
	for (int i = 0; i < selectedCON.size(); i++) {
		String SelectedCONTxt = selectedCON.get(i).getText().trim();
		System.out.println(SelectedCONTxt);
		SelectedCONList.add(SelectedCONTxt);
	}




	WebElement TP_view = driver.findElement(By.xpath("//select[@name='alliances']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TP_view);
	Thread.sleep(500);

	Select TPBox = new Select(driver.findElement(By.xpath("//select[@name='market']")));
	TPBox.selectByVisibleText("ASEAN ");
	System.out.println("ASEAN ");
		}









	public static void Save_showdoc() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/app-root/notifier-container/ul/li/notifier-notification/p")));
		boolean SaveMessageVal = driver
				.findElement(By.xpath("/html/body/app-root/notifier-container/ul/li/notifier-notification/p"))
				.isDisplayed();
		Assert.assertTrue(SaveMessageVal);
		System.out.println("Asset Created Successfully");
		Thread.sleep(5000);

	}

	public static void QAStatusDD_Val() throws InterruptedException {

		WebElement element1 = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-asset-form/div/form/div[2]/fieldset/div[2]/select"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", element1);

		String[] QAStatus = ManageAssets.get(0).get("QA Status").split("/", 0);
		List<String> QAStatusList = Arrays.asList(QAStatus);
		System.out.println(QAStatusList);

		WebElement QAStatus_view = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-asset-form/div/form/div[2]/fieldset/div[2]/select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", QAStatus_view);
		Thread.sleep(500);

		Select QAStatusBox = new Select(driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-asset-form/div/form/div[2]/fieldset/div[2]/select")));
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

		Thread.sleep(5000);

		WebElement element1 = driver.findElement(By.id("qa-comment"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", element1);

		WebElement text1 = driver.findElement(By.id("qa-comment"));
		String textagain1 = text1.getAttribute("value");
		System.out.println(textagain1);

//				driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[2]/button[1]")).click();
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/notifier-container/ul/li/notifier-notification/p")));
//				boolean  SaveMessageVal = driver.findElement(By.xpath("/html/body/app-root/notifier-container/ul/li/notifier-notification/p")).isDisplayed();
//				Assert.assertTrue(SaveMessageVal);
//				System.out.println("Showdoc Created Successfully");
//				Thread.sleep(5000);

	}

	public static void Review_Val() throws InterruptedException {
		Thread.sleep(5000);
//					WebElement element1 = driver.findElement(By.xpath("//button[contains(.,'Submit for Review')]"));
//					JavascriptExecutor executor1 = (JavascriptExecutor)driver;
//					executor1.executeScript("arguments[0].click();", element1);	

		WebElement Review = driver.findElement(By.xpath("//button[contains(.,'Submit for Review')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Review);

		driver.findElement(By.xpath("//button[contains(.,'Submit for Review')]")).click();
//					
//				String AssetSubmit = driver.findElement(By.xpath("/html/body/app-root/notifier-container/ul/li/notifier-notification/p")).getText();
//				Assert.assertEquals("Asset submitted for review!", AssetSubmit);

	}

	public static void title_Val() throws InterruptedException {
		String Assets_Header = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-asset-form/div[2]/form/div[1]/div[1]/input"))
				.getText();

		System.out.println(Assets_Header);
		Asset_title = Assets_Header;

	}

	public static void Publish_Val() throws InterruptedException {

		// publishing the showdoc

		Thread.sleep(5000);

		WebElement element1 = driver.findElement(By.xpath("//button[contains(.,'Publish')]"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", element1);

		driver.findElement(By.xpath("//td[6]/a/span")).click();

		// Date validation
		Thread.sleep(5000);

		WebElement element3 = driver.findElement(By.xpath("//input[@name='validationDate']"));
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click();", element3);

		WebElement text2 = driver.findElement(By.xpath("//input[@name='validationDate']"));
		String textagain2 = text2.getAttribute("value");
		System.out.println(textagain2);

		// Expiration Date
		Thread.sleep(5000);

		WebElement element31 = driver.findElement(By.xpath("//input[@name='expirationDate']"));
		JavascriptExecutor executor31 = (JavascriptExecutor) driver;
		executor31.executeScript("arguments[0].click();", element31);

		WebElement text21 = driver.findElement(By.xpath("//input[@name='expirationDate']"));
		String textagain21 = text21.getAttribute("value");
		System.out.println(textagain21);
		
		
		// Now click on Archive
		
		    driver.findElement(By.xpath("//button[contains(.,'Archive')]")).click();
		    driver.findElement(By.xpath("//div[2]/textarea")).sendKeys("archived by nithya");
		    driver.findElement(By.xpath("//button[contains(.,'Yes')]")).click();
		  
		   
		    WebElement dropdown = driver.findElement(By.xpath("//div[@id='se-ct-cust-table-1_filter']/div[3]/label/select"));
		      dropdown.findElement(By.xpath("//option[. = 'Archived']")).click();
		      Thread.sleep(1000);
		    
		    driver.findElement(By.xpath("//td[6]/a/span")).click();
		    
		    // to get the archived comments
		    
		    WebElement element9 = driver.findElement(By.xpath("//textarea[@name='archiveComment']"));
			JavascriptExecutor executor9 = (JavascriptExecutor) driver;
			executor9.executeScript("arguments[0].click();", element9);

			WebElement text9 = driver.findElement(By.xpath("//textarea[@name='archiveComment']"));
			String textagain9 = text9.getAttribute("value");
			System.out.println(textagain9);

		    driver.findElement(By.xpath("//button[contains(.,'Restore')]")).click();
		    driver.findElement(By.xpath("//button[contains(.,'Ok')]")).click();
		    // submit for review
		    WebElement Review = driver.findElement(By.xpath("//button[contains(.,'Submit for Review')]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Review);

			driver.findElement(By.xpath("//button[contains(.,'Submit for Review')]")).click();
			
			// publishing
			WebElement element191 = driver.findElement(By.xpath("//button[contains(.,'Publish')]"));
			JavascriptExecutor executor191 = (JavascriptExecutor) driver;
			executor191.executeScript("arguments[0].click();", element191);
	}

		    

		    


	public static void AcousticLogin_Val() throws InterruptedException {

		driver.get(prop.getProperty("urlAcoustic"));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("santhr10@in.ibm.com");
		// click on continue button

		driver.findElement(By.xpath("//button[@id='continue-button']")).click();

		// enter ur username and password

		driver.findElement(By.xpath("//*[@id=\"desktop\"]")).sendKeys("santhr10@in.ibm.com");
		driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div[2]/div/div/form/input[4]"))
				.sendKeys("SANTHOshnithya@ibm");

		// click on signin button

		WebElement element5 = driver.findElement(By.xpath("//body[@id='body']/div/div[2]/div/div/form/button"));
		JavascriptExecutor executor5 = (JavascriptExecutor) driver;
		executor5.executeScript("arguments[0].click();", element5);
		Thread.sleep(2000);

		// Clicking on Content Libraries

//					
		WebElement element6 = driver
				.findElement(By.xpath("//*[@id=\"ribbon-product-feature-item-title-wch-content\"]"));
		JavascriptExecutor executor6 = (JavascriptExecutor) driver;
		executor6.executeScript("arguments[0].click();", element6);
		Thread.sleep(5000);
		WebElement element7 = driver.findElement(By.xpath(("//span[contains(.,'All content')]")));
		JavascriptExecutor executor7 = (JavascriptExecutor) driver;
		executor7.executeScript("arguments[0].click();", element7);

		// Thread.sleep(1000);
		driver.switchTo().frame("wch-iframe");

//			   driver.findElement(By.xpath("//button[@id='content-filter-btn']")).click();
//			   driver.findElement(By.cssSelector("#facetList_540 > .facet-item:nth-child(5) .facet-label")).click();

//					
		WebElement element8 = driver.findElement(By.xpath("//button[@id='content-filter-btn']"));
		JavascriptExecutor executor8 = (JavascriptExecutor) driver;
		executor8.executeScript("arguments[0].click();", element8);

		WebElement element9 = driver.findElement(By.xpath("//*[@id=\"facetList_540\"]/li[2]/button/span[1]"));
		JavascriptExecutor executor9 = (JavascriptExecutor) driver;
		executor9.executeScript("arguments[0].click();", element9);

		driver.findElement(By.id("search-input")).sendKeys(Asset_title);
		driver.findElement(By.id("search-input")).sendKeys(Keys.ENTER);
		Thread.sleep(10000);

		driver.findElement(
				By.cssSelector(".ng-scope:nth-child(1) > .ng-scope > .authoring-item-name-container .ng-binding"))
				.click();
		Thread.sleep(10000);

		driver.findElement(By.xpath("//button[contains(.,'Create draft')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='lastValidDate-singleLine-value']")).clear();
		driver.findElement(By.xpath("//input[@id='lastValidDate-singleLine-value']")).sendKeys("2019-04-14");

		driver.findElement(By.xpath("//input[@id='contentExpirationDate-singleLine-value']")).clear();
		driver.findElement(By.xpath("//input[@id='contentExpirationDate-singleLine-value']")).sendKeys("2020-03-15");

		WebElement element91 = driver.findElement(By.xpath("//button[@id='content-ready-btn']"));
		JavascriptExecutor executor91 = (JavascriptExecutor) driver;
		executor91.executeScript("arguments[0].click();", element91);

		WebElement element92 = driver.findElement(By.xpath("//*[@id=\"ready-all-btn\"]"));
		JavascriptExecutor executor92 = (JavascriptExecutor) driver;
		executor92.executeScript("arguments[0].click();", element92);

	}

	public static void Admin_LoginAgain_Val() throws InterruptedException {

		driver.get(prop.getProperty("url"));
//				driver.findElement(By.xpath("//*[@id='Intranet_ID']")).sendKeys("santhr10@in.ibm.com");
//				driver.findElement(By.xpath("//*[@id='password']")).sendKeys("SANTHoshnithya@ibm");

		// driver.findElement(By.xpath("//*[@id='loginform']/input[3]")).click();
		WebElement AssetsClick = driver.findElement(By.linkText("Assets"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AssetsClick);
		Thread.sleep(500);
		driver.findElement(By.linkText("Assets")).click();

		driver.findElement(By.xpath("//td[6]/a/span")).click();
		String alret_text = driver.findElement(By.xpath("//p")).getText();
		System.out.println(alret_text);

		// Date validation
		Thread.sleep(5000);

		WebElement element3 = driver.findElement(By.xpath("//input[@name='validationDate']"));
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click();", element3);

		WebElement text2 = driver.findElement(By.xpath("//input[@name='validationDate']"));
		String textagain2 = text2.getAttribute("value");
		System.out.println(textagain2);

		// Expiration Date
		Thread.sleep(5000);

		WebElement element31 = driver.findElement(By.xpath("//input[@name='expirationDate']"));
		JavascriptExecutor executor31 = (JavascriptExecutor) driver;
		executor31.executeScript("arguments[0].click();", element31);

		WebElement text21 = driver.findElement(By.xpath("//input[@name='expirationDate']"));
		String textagain21 = text21.getAttribute("value");
		System.out.println(textagain21);

	}

}
