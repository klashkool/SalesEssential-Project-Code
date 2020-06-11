package com.Showdocs_Module;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;
import com.utils.ExcelReader;
import com.utils.ExcelReader_ReportsVal;
import com.utils.ExcelSheetReader;
import com.utils.FileRename;

public class Publishing_Showdocs_Page extends Salesessential_base {

	static WebDriverWait wait = new WebDriverWait(driver, 200);
	static List<HashMap<String, String>> Showdocs = ExcelSheetReader.Showdocs_data();
	public static String showdoc_title;

	public static void Create_Showdocs() throws InterruptedException {

		Thread.sleep(2000);

		Date date = new Date();
		String lastDate = (date.toString().trim());
		// display time and date using toString()
		System.out.println(lastDate);

		driver.findElement(By.name("title")).sendKeys(
				"Ran Walker is the author of the forthcoming 50-word story collection THE STRANGE MUSEUM. He credits this site with  "
						+ lastDate);
		driver.findElement(By.name("owner")).sendKeys(Showdocs.get(0).get("OwnerEmail"));
		driver.findElement(By.name("showdocDesc")).sendKeys(Showdocs.get(0).get("Description"));
		driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[4]/tag-input/div/div/tag-input-form/form/input"))
				.sendKeys(Showdocs.get(0).get("Keywords"));
		driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[4]/tag-input/div/div/tag-input-form/form/input"))
				.sendKeys(Keys.ENTER);

// Content
		driver.findElement(By.name("content")).sendKeys(Showdocs.get(0).get("Content"));

//Language

		WebElement Language = driver.findElement(By.name("language"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Language);
		Thread.sleep(500);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("language")));
		Select Lang = new Select(driver.findElement(By.name("language")));
		Lang.selectByIndex(2);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("showdocContentCategory")));
		Select catgry = new Select(driver.findElement(By.name("showdocContentCategory")));
		catgry.selectByVisibleText(Showdocs.get(0).get("Content Category"));
	}

	// Audience

	public static void AudienceDD_Val() throws InterruptedException {

		String[] Audience = Showdocs.get(0).get("Audience").split("/", 0);
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

		String[] Sellerrole = Showdocs.get(0).get("Seller role").split("/", 0);
		List<String> SellerList = Arrays.asList(Sellerrole);
		System.out.println(SellerList);

		WebElement SellerRole = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[14]/select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SellerRole);
		Thread.sleep(500);

		Select SellerRoleBox = new Select(driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[14]/select")));
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

		String[] SalesStage = Showdocs.get(0).get("Sales stage").split("/", 0);
		List<String> SalesStageList = Arrays.asList(SalesStage);
		System.out.println(SalesStageList);

		WebElement SalesStage_view = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[15]/select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SalesStage_view);
		Thread.sleep(500);

		Select SalesStageBox = new Select(driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[15]/select")));
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

		String[] BuyJour = Showdocs.get(0).get("Buyers journey").split("/", 0);
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
		
		String[] BuyJour1 = Showdocs.get(0).get("Buyers journey").split("/", 0);
		List<String> BuyJourList1 = Arrays.asList(BuyJour1);
		System.out.println(BuyJourList1);

		WebElement BuyJour_view1 = driver.findElement(By.xpath("//select[@name='buyerJournies']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BuyJour_view1);
		Thread.sleep(500);

		Select BuyJournBox1 = new Select(driver.findElement(By.xpath("//select[@name='buyerJournies']")));
		List<WebElement> selectedBuyJour1 = BuyJournBox1.getOptions();

		List<String> SelectedBuyJourList1 = new ArrayList<String>();
		for (int m = 0; m < selectedBuyJour1.size(); m++) {
			String SelectedBuyJourTxt1 = selectedBuyJour1.get(m).getText().trim();
			System.out.println(SelectedBuyJourTxt1);
			SelectedBuyJourList1.add(SelectedBuyJourTxt1);
	}
	}
	public static void GeoDD_Val() throws InterruptedException {

		String[] Geo = Showdocs.get(0).get("Geography").split("/", 0);
		List<String> GeoList = Arrays.asList(Geo);
		System.out.println(GeoList);

		WebElement Geo_view = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[17]/select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Geo_view);
		Thread.sleep(500);

		Select GeoBox = new Select(driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[17]/select")));
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

		String[] Industry = Showdocs.get(0).get("Industry").split("/", 0);
		List<String> IndustryList = Arrays.asList(Industry);
		System.out.println(IndustryList);

		WebElement Industry_view = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[18]/select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Industry_view);
		Thread.sleep(500);

		Select IndustryBox = new Select(driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[18]/select")));
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

//				String[] SL = Showdocs.get(0).get("Service Lines").split("/", 0);
//				List<String> SLList = Arrays.asList(SL);
//				System.out.println(SLList);

		WebElement SL_view = driver.findElement(By.xpath("//select[@name='servicelines']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SL_view);
		Thread.sleep(500);

		Select SLBox = new Select(driver.findElement(By.xpath("//select[@name='servicelines']")));
		SLBox.selectByVisibleText("Multicloud Services ");
		
		


	}

	public static void StrategicInitiatives_Val() throws InterruptedException {

		String[] SI = Showdocs.get(0).get("Strategic Initiatives").split("/", 0);
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
		
		String[] SI1 = Showdocs.get(0).get("Strategic Initiatives").split("/", 0);
		List<String> SIList1 = Arrays.asList(SI1);
		System.out.println(SIList1);

		WebElement SI_view1 = driver.findElement(By.xpath("//select[@name='strategicInit']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SI_view1);
		Thread.sleep(500);

		Select SIBox1 = new Select(driver.findElement(By.xpath("//select[@name='strategicInit']")));
		List<WebElement> selectedSI1 = SIBox1.getOptions();

		List<String> SelectedSIList1 = new ArrayList<String>();
		for (int i = 0; i < selectedSI1.size(); i++) {
			String SelectedSITxt1 = selectedSI1.get(i).getText().trim();
			System.out.println(SelectedSITxt1);
			SelectedSIList1.add(SelectedSITxt1);
		}
	}

	public static void StrategicInitiativesCategories_Val() throws InterruptedException {

		String[] SIC = Showdocs.get(0).get("Strategic Initiatives Categories").split("/", 0);
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
		
		String[] SIC1 = Showdocs.get(0).get("Strategic Initiatives Categories").split("/", 0);
		List<String> SICList1 = Arrays.asList(SIC1);
		System.out.println(SICList1);

		WebElement SIC_view1 = driver.findElement(By.xpath("//select[@name='strategicInitCate']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SIC_view1);
		Thread.sleep(5000);

		Select SICBox1 = new Select(driver.findElement(By.xpath("//select[@name='strategicInitCate']")));
		List<WebElement> selectedSIC1 = SICBox1.getOptions();

		List<String> SelectedSICList1 = new ArrayList<String>();
		for (int i = 0; i < selectedSIC1.size(); i++) {
			String SelectedSICTxt1 = selectedSIC1.get(i).getText().trim();
			System.out.println(SelectedSICTxt1);
			SelectedSICList1.add(SelectedSICTxt1);
		}
	}
	
	// Covid-19
	
	public static void Covid19_Val() throws InterruptedException {
		
		String[] COV = Showdocs.get(0).get("COVID-19:").split("/", 0);
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

		String[] CON = Showdocs.get(0).get("Conversations:").split("/", 0);
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
		CNBox.selectByVisibleText("Build and modernize applications to maximize agility and ROI (Conversation 2) ");
		System.out.println("Build and modernize applications to maximize agility and ROI (Conversation 2) ");
			}
	// Third Party
	
	public static void ThirdParty_Val() throws InterruptedException {
		
		String[] CON = Showdocs.get(0).get("Third Party Publisher:").split("/", 0);
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
		
		String[] CON = Showdocs.get(0).get("Alliances:").split("/", 0);
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
	
	String[] CON = Showdocs.get(0).get("Event:").split("/", 0);
	List<String> CONList = Arrays.asList(CON);
	System.out.println(CONList);

	WebElement CON_view = driver.findElement(By.xpath("//select[@name='events']"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", CON_view);
	Thread.sleep(5000);

	Select CONBox = new Select(driver.findElement(By.xpath("//select[@name='events']")));
	List<WebElement> selectedCON = CONBox.getOptions();

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






	public static void SecurityDD_Val() throws InterruptedException {

		String[] Security = Showdocs.get(0).get("Security").split("/", 0);
		List<String> SecurityList = Arrays.asList(Security);
		System.out.println(SecurityList);

		WebElement Security_view = driver.findElement(By.xpath("//select[@name='security']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Security_view);
		Thread.sleep(500);

		Select SecurityBox = new Select(driver.findElement(By.xpath("//select[@name='security']")));
		List<WebElement> selectedSecurity = SecurityBox.getAllSelectedOptions();

		List<String> SelectedSecurityList = new ArrayList<String>();
		for (int i = 0; i < selectedSecurity.size(); i++) {
			String SelectedSecurityTxt = selectedSecurity.get(i).getText().trim();
			System.out.println(SelectedSecurityTxt);
			SelectedSecurityList.add(SelectedSecurityTxt);
		}
		Assert.assertEquals(SecurityList, SelectedSecurityList);
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
		System.out.println("Showdoc Created Successfully");
		Thread.sleep(5000);

	}

	public static void QAStatusDD_Val() throws InterruptedException {

		WebElement element1 = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[2]/form/div[2]/fieldset/div[2]/select"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", element1);

		String[] QAStatus = Showdocs.get(0).get("QA Status").split("/", 0);
		List<String> QAStatusList = Arrays.asList(QAStatus);
		System.out.println(QAStatusList);

		WebElement QAStatus_view = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[2]/form/div[2]/fieldset/div[2]/select"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", QAStatus_view);
		Thread.sleep(500);

		Select QAStatusBox = new Select(driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[2]/form/div[2]/fieldset/div[2]/select")));
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

		Thread.sleep(1000);
		WebElement Review = driver.findElement(By
				.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/button[4]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Review);

		driver.findElement(
				By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/button[4]"))
				.click();

//					String ShowdocSubmit = driver.findElement(By.xpath("/html/body/app-root/notifier-container/ul/li/notifier-notification/p")).getText();
//					Assert.assertEquals("Showdoc submitted for review!", ShowdocSubmit);

	}

	public static void Publish_Val() throws InterruptedException {

		// publishing the showdoc

		Thread.sleep(5000);
		WebElement Publish = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/div/button[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Publish);

		driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/div/button[1]"))
				.click();

		driver.findElement(By.xpath("//*[@id='se-ct-cust-table-2']/tbody[1]/tr[1]/td[6]/a[1]/span")).click();

		// Date validation
		Thread.sleep(5000);

		WebElement element3 = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[2]/div[1]/input"));
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click();", element3);

		WebElement text2 = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[2]/div[1]/input"));
		String textagain2 = text2.getAttribute("value");
		System.out.println(textagain2);

		// Expiration Date

		WebElement element31 = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[2]/div[2]/input"));
		JavascriptExecutor executor31 = (JavascriptExecutor) driver;
		executor31.executeScript("arguments[0].click();", element31);

		WebElement text21 = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[2]/div[2]/input"));
		String textagain21 = text21.getAttribute("value");
		System.out.println(textagain21);

	}

	public static void Check_Versions() throws InterruptedException {

		// Checking the Version

		Thread.sleep(5000);
		WebElement Version = driver.findElement(By
				.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/button[3]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Version);

		driver.findElement(
				By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/button[3]"))
				.click();
		// Clicking on version

		Thread.sleep(5000);
		WebElement ClickVersion = driver.findElement(By.xpath("//b"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ClickVersion);

		driver.findElement(By.xpath("//b")).click();

		// Make as current version
		Thread.sleep(5000);
		WebElement MakeVersion = driver.findElement(By.xpath("//button[contains(.,'Make as Current')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", MakeVersion);

		driver.findElement(By.xpath("//button[contains(.,'Make as Current')]")).click();

		// Click on Save Button
		Thread.sleep(7000);
		WebElement SaveVersion = driver.findElement(By.xpath("//button[contains(.,'Save')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SaveVersion);

		driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();

	}

	public static void ReviewAgain_Val() throws InterruptedException {

		Thread.sleep(5000);
		WebElement ReviewAgain = driver.findElement(By
				.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/button[4]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ReviewAgain);

		driver.findElement(
				By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/button[4]"))
				.click();

//				String ShowdocSubmit = driver.findElement(By.xpath("/html/body/app-root/notifier-container/ul/li/notifier-notification/p")).getText();
//				Assert.assertEquals("Showdoc submitted for review!", ShowdocSubmit);

	}

	public static void PublishAgain_Val() throws InterruptedException {

		// publishing the showdoc

		Thread.sleep(5000);
		WebElement PublishAgain = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/div/button[1]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PublishAgain);

		driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/div/button[1]"))
				.click();

		driver.findElement(By.xpath("//*[@id='se-ct-cust-table-2']/tbody[1]/tr[1]/td[6]/a[1]/span")).click();

		Thread.sleep(2000);
		driver.findElement(
				By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/button[4]"))
				.click();
	}

	// Home page

	public static void HomePage_Val() throws InterruptedException {

		// Content categories By Filters
		Thread.sleep(5000);
		WebElement dropdown = driver.findElement(By.cssSelector(".se-ct-cust-table-2_filterStatus69"));
		dropdown.findElement(By.xpath("//option[. = 'Communications Or Blogs']")).click();

		driver.findElement(By.cssSelector(".se-ct-cust-table-2_filterStatus69")).click();
		driver.findElement(By.cssSelector(".se-ct-cust-table-2_filterStatus69")).click();

		// Display status By Filters
		Thread.sleep(5000);

		WebElement dropdown1 = driver.findElement(By.cssSelector(".se-ct-cust-table-2_filterStatus69"));
		dropdown1.findElement(By.xpath("//option[. = 'Published']")).click();

		driver.findElement(By.cssSelector(".se-ct-cust-table-2_filterStatus69")).click();
		

	}

	public static void Export_Val() throws InterruptedException {

		Thread.sleep(5000);
		WebElement Export = driver.findElement(By.xpath("//*[@id=\"create-new-btn\"]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Export);
		
		
		

		driver.findElement(By.xpath("//*[@id=\"create-new-btn\"]")).click();

		// Getting the count
//		Thread.sleep(10000);
//
//		String Count = driver.findElement(By.xpath("//*[@id='se-ct-cust-table-2_info']")).getText();
//		System.out.println(Count);
		
		FileRename.test();
	
		List<HashMap<String, String>> Showdoc_Report = ExcelReader_ReportsVal.readExcelDatafromFile("C:\\Users\\SanthoshNithyaR\\Downloads\\report.xls",
				"ShowDocs");
		
		String  thirdParty = Showdoc_Report.get(0).get(" Third Party Publisher");
		System.out.println(thirdParty);
		
		Assert.assertEquals("Analyst Limited License", thirdParty);
		

	String  Alliances = Showdoc_Report.get(0).get(" Alliances");
		
		Assert.assertEquals("Apple",Alliances);
		
		
		
		// Preview the showdoc

		WebElement element1 = driver.findElement(By.xpath("//td[6]/a/span"));
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", element1);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[contains(.,'Preview')]")).click();
		driver.findElement(By.cssSelector(".prewLink")).click();

		Set<String> generatePreview = driver.getWindowHandles();

		Iterator<String> generatePreview1 = generatePreview.iterator();

		String MainWindowID1 = generatePreview1.next();

		String SubWindowID1 = generatePreview1.next();

		driver.switchTo().window(SubWindowID1);

		Thread.sleep(5000);
		String Preview_Header = driver.findElement(By.xpath("//div[@id='se-showDocs']/div/div/div/div/div/h2"))
				.getText();
		// Assert.assertEquals("Solutioning / Delivery Assets", Preview_Header);
		System.out.println(Preview_Header);
		showdoc_title = Preview_Header;

		// driver.close();
		driver.switchTo().window(MainWindowID1);
		driver.findElement(By.xpath("//div[2]/div/span")).click();

	}
		
	
	public static void AcousticLogin_Val() throws InterruptedException {

		driver.get(prop.getProperty("urlAcoustic"));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("santhr10@in.ibm.com");
		// click on continue button

		driver.findElement(By.xpath("//button[@id='continue-button']")).click();

		// enter ur username and password

		driver.findElement(By.xpath("//*[@id=\"desktop\"]")).sendKeys("santhr10@in.ibm.com");
		driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div[2]/div/div/form/input[4]"))
				.sendKeys("SANTHoshnithya@ibm");

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

//  Thread.sleep(1000);
		driver.switchTo().frame("wch-iframe");

//driver.findElement(By.xpath("//button[@id='content-filter-btn']")).click();
//driver.findElement(By.cssSelector("#facetList_540 > .facet-item:nth-child(5) .facet-label")).click();

		WebElement element93 = driver.findElement(By.xpath("//li[8]/button"));
		JavascriptExecutor executor93 = (JavascriptExecutor) driver;
		executor93.executeScript("arguments[0].click();", element93);

		WebElement element9 = driver.findElement(By.xpath("//span[contains(.,'showdoc template')]"));
		JavascriptExecutor executor9 = (JavascriptExecutor) driver;
		executor9.executeScript("arguments[0].click();", element9);

		driver.findElement(By.id("search-input")).sendKeys(showdoc_title);
		driver.findElement(By.id("search-input")).sendKeys(Keys.ENTER);

		driver.findElement(
				By.cssSelector(".ng-scope:nth-child(1) > .ng-scope > .authoring-item-name-container .ng-binding"))
				.click();

		driver.findElement(By.xpath("//button[contains(.,'Create draft')]")).click();

		driver.findElement(By.xpath("//input[@id='lastValidDate-singleLine-value']")).clear();
		driver.findElement(By.xpath("//input[@id='lastValidDate-singleLine-value']")).sendKeys("2019-04-16");

		driver.findElement(By.xpath("//input[@id='contentExpirationDate-singleLine-value']")).clear();
		driver.findElement(By.xpath("//input[@id='contentExpirationDate-singleLine-value']")).sendKeys("2020-04-15");

		WebElement element91 = driver.findElement(By.xpath("//button[@id='content-ready-btn']"));
		JavascriptExecutor executor91 = (JavascriptExecutor) driver;
		executor91.executeScript("arguments[0].click();", element91);

		WebElement element92 = driver.findElement(By.xpath("//*[@id=\"ready-all-btn\"]"));
		JavascriptExecutor executor92 = (JavascriptExecutor) driver;
		executor92.executeScript("arguments[0].click();", element92);
		Thread.sleep(5000);
		// driver.close();

	}

//	public static void Notifyurl_LoginAgain_Val() throws InterruptedException {
//
//		driver.get(prop.getProperty("Notifyurl"));
//		Thread.sleep(10000);
//
//	}

	public static void Admin_LoginAgain_Val() throws InterruptedException {

		driver.get(prop.getProperty("url"));
//	driver.findElement(By.xpath("//*[@id='Intranet_ID']")).sendKeys("santhr10@in.ibm.com");
//	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("SANTHoshnithya@ibm");

		// driver.findElement(By.xpath("//*[@id='loginform']/input[3]")).click();
		WebElement ShowdocsClick = driver.findElement(By.linkText("Showdocs"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ShowdocsClick);
		Thread.sleep(500);
		driver.findElement(By.linkText("Showdocs")).click();

		driver.findElement(By.xpath("//td[6]/a/span")).click();
		String alret_text = driver
				.findElement(
						By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[2]/div/p"))
				.getText();

		System.out.println(alret_text);

		// Date validation
		Thread.sleep(5000);

		WebElement element3 = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[2]/div[1]/input"));
		JavascriptExecutor executor3 = (JavascriptExecutor) driver;
		executor3.executeScript("arguments[0].click();", element3);

		WebElement text2 = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[2]/div[1]/input"));
		String textagain2 = text2.getAttribute("value");
		System.out.println(textagain2);

		// Expiration Date

		WebElement element31 = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[2]/div[2]/input"));
		JavascriptExecutor executor31 = (JavascriptExecutor) driver;
		executor31.executeScript("arguments[0].click();", element31);

		WebElement text21 = driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[2]/div[2]/input"));
		String textagain21 = text21.getAttribute("value");
		System.out.println(textagain21);

	}

}
