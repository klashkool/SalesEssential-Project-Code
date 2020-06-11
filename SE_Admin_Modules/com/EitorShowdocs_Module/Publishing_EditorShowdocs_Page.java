package com.EitorShowdocs_Module;

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

public class Publishing_EditorShowdocs_Page extends Salesessential_base {
	static WebDriverWait wait = new WebDriverWait(driver, 200);
	static List<HashMap<String, String>> Editor_Showdocs = ExcelSheetReader.Editor_Showdocs_data();

	public static void Create_Showdocs() throws InterruptedException {
		
		Thread.sleep(2000);
		
		Date date = new Date();
		String lastDate = (date.toString().trim());
		// display time and date using toString()
		System.out.println(lastDate);
		
		

		driver.findElement(By.name("title")).sendKeys("Ran Walker is the author of the forthcoming 50-word story collection THE STRANGE MUSEUM. He credits this site with  " + lastDate);
		driver.findElement(By.name("owner")).sendKeys(Editor_Showdocs.get(0).get("OwnerEmail"));
		driver.findElement(By.name("showdocDesc")).sendKeys(Editor_Showdocs.get(0).get("Description"));
		driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[4]/tag-input/div/div/tag-input-form/form/input"))
				.sendKeys(Editor_Showdocs.get(0).get("Keywords"));
		driver.findElement(By.xpath(
				"/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[4]/tag-input/div/div/tag-input-form/form/input"))
				.sendKeys(Keys.ENTER);

// Content
		driver.findElement(By.name("content")).sendKeys(Editor_Showdocs.get(0).get("Content"));

//Language

		WebElement Language = driver.findElement(By.name("language"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Language);
		Thread.sleep(500);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("language")));
		Select Lang = new Select(driver.findElement(By.name("language")));
		Lang.selectByIndex(2);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("showdocContentCategory")));
		Select catgry = new Select(driver.findElement(By.name("showdocContentCategory")));
		catgry.selectByVisibleText(Editor_Showdocs.get(0).get("Content Category"));
	}

	// Audience

	public static void AudienceDD_Val() throws InterruptedException {

		String[] Audience = Editor_Showdocs.get(0).get("Audience").split("/", 0);
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

			String[] Sellerrole = Editor_Showdocs.get(0).get("Seller role").split("/", 0);
			List<String> SellerList = Arrays.asList(Sellerrole);
			System.out.println(SellerList);

			WebElement SellerRole = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[14]/select"));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SellerRole);
			Thread.sleep(500);

			Select SellerRoleBox = new Select(
					driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[14]/select")));
			List<WebElement> selectedSellerRoles = SellerRoleBox.getAllSelectedOptions();

			List<String> SelectedSellerRoleList = new ArrayList<String>();
			for (int i = 0; i < selectedSellerRoles.size(); i++) {
				String SelectedSellerRoleTxt = selectedSellerRoles.get(i).getText().trim();
				System.out.println(SelectedSellerRoleTxt);
				SelectedSellerRoleList.add(SelectedSellerRoleTxt);
			}
			Assert.assertEquals(SellerList, SelectedSellerRoleList);
		}
			
			//SSales Stage
			
			public static void SalesStageDD_Val() throws InterruptedException {

				String[] SalesStage = Editor_Showdocs.get(0).get("Sales stage").split("/", 0);
				List<String> SalesStageList = Arrays.asList(SalesStage);
				System.out.println(SalesStageList);

				WebElement SalesStage_view= driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[15]/select"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SalesStage_view);
				Thread.sleep(500);

				Select SalesStageBox = new Select(
						driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[15]/select")));
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

				String[] BuyJour = Editor_Showdocs.get(0).get("Buyers journey").split("/", 0);
				List<String> BuyJourList = Arrays.asList(BuyJour);
				System.out.println(BuyJourList);

				WebElement BuyJour_view= driver.findElement(By.xpath("//select[@name='buyerJournies']"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", BuyJour_view);
				Thread.sleep(500);

				Select BuyJournBox = new Select(
						driver.findElement(By.xpath("//select[@name='buyerJournies']")));
				List<WebElement> selectedBuyJour = BuyJournBox.getAllSelectedOptions();

				List<String> SelectedBuyJourList = new ArrayList<String>();
				for (int m = 0; m < selectedBuyJour.size(); m++) {
					String SelectedBuyJourTxt = selectedBuyJour.get(m).getText().trim();
					System.out.println(SelectedBuyJourTxt);
					SelectedBuyJourList.add(SelectedBuyJourTxt);
				}
				Assert.assertEquals(BuyJourList, SelectedBuyJourList);
			}
			
			
			public static void GeoDD_Val() throws InterruptedException {

				String[] Geo = Editor_Showdocs.get(0).get("Geography").split("/", 0);
				List<String> GeoList = Arrays.asList(Geo);
				System.out.println(GeoList);

				WebElement Geo_view= driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[17]/select"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Geo_view);
				Thread.sleep(500);

				Select GeoBox = new Select(
						driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[17]/select")));
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

				String[] Industry = Editor_Showdocs.get(0).get("Industry").split("/", 0);
				List<String> IndustryList = Arrays.asList(Industry);
				System.out.println(IndustryList);

				WebElement Industry_view= driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[18]/select"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Industry_view);
				Thread.sleep(500);

				Select IndustryBox = new Select(
						driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[18]/select")));
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

				String[] SL = Editor_Showdocs.get(0).get("Service Lines").split("/", 0);
				List<String> SLList = Arrays.asList(SL);
				System.out.println(SLList);

				WebElement SL_view= driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[19]/select"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SL_view);
				Thread.sleep(500);

				Select SLBox = new Select(
						driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[19]/select")));
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

				String[] Security = Editor_Showdocs.get(0).get("Security").split("/", 0);
				List<String> SecurityList = Arrays.asList(Security);
				System.out.println(SecurityList);

				WebElement Security_view= driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[20]/select"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Security_view);
				Thread.sleep(500);

				Select SecurityBox = new Select(
						driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div/form/div[1]/div[20]/select")));
				List<WebElement> selectedSecurity = SecurityBox.getAllSelectedOptions();

				List<String> SelectedSecurityList = new ArrayList<String>();
				for (int i = 0; i < selectedSecurity.size(); i++) {
					String SelectedSecurityTxt = selectedSecurity.get(i).getText().trim();
					System.out.println(SelectedSecurityTxt);
					SelectedSecurityList.add(SelectedSecurityTxt);
				}
				Assert.assertEquals(SecurityList, SelectedSecurityList);
			}
			
			
			public static void Save_showdoc() throws InterruptedException
			{
				Thread.sleep(5000);
				driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/notifier-container/ul/li/notifier-notification/p")));
				boolean  SaveMessageVal = driver.findElement(By.xpath("/html/body/app-root/notifier-container/ul/li/notifier-notification/p")).isDisplayed();
			Assert.assertTrue(SaveMessageVal);
			System.out.println("Showdoc Created Successfully");
			Thread.sleep(5000);
				
			}
			
			
		
			
			
			
			
			
			public static void QAStatusDD_Val() throws InterruptedException {
				
				WebElement element1 = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[2]/form/div[2]/fieldset/div[2]/select"));
				JavascriptExecutor executor1 = (JavascriptExecutor)driver;
				executor1.executeScript("arguments[0].click();", element1);

				String[] QAStatus = Editor_Showdocs.get(0).get("QA Status").split("/", 0);
				List<String> QAStatusList = Arrays.asList(QAStatus);
				System.out.println(QAStatusList);

			WebElement QAStatus_view= driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[2]/form/div[2]/fieldset/div[2]/select"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", QAStatus_view);
			Thread.sleep(500);

				Select QAStatusBox = new Select(
						driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[2]/form/div[2]/fieldset/div[2]/select")));
				List<WebElement> selectedQAStatus = QAStatusBox.getAllSelectedOptions();

				List<String> SelectedQAStatusList = new ArrayList<String>();
				for (int i = 0; i < selectedQAStatus.size(); i++) {
					String SelectedQAStatusTxt = selectedQAStatus.get(i).getText().trim();
					System.out.println(SelectedQAStatusTxt);
					SelectedQAStatusList.add(SelectedQAStatusTxt);
				}			Assert.assertEquals(QAStatusList, SelectedQAStatusList);
			}

			
			
		public static void QACommDD_Val() throws InterruptedException {
			
			Thread.sleep(5000);
			
			WebElement element1 = driver.findElement(By.id("qa-comment"));
			JavascriptExecutor executor1 = (JavascriptExecutor)driver;
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
					WebElement Review = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/button[4]"));
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Review);
					
					driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/button[4]")).click();
					
//					String ShowdocSubmit = driver.findElement(By.xpath("/html/body/app-root/notifier-container/ul/li/notifier-notification/p")).getText();
//					Assert.assertEquals("Showdoc submitted for review!", ShowdocSubmit);

				
				}
				
				public static void Publish_Val() throws InterruptedException {
					
					//publishing the showdoc
					
					Thread.sleep(5000);
					WebElement Publish = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/div/button[1]"));
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Publish);
					
					driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/div/button[1]")).click();
	    
	         driver.findElement(By.xpath("//*[@id='se-ct-cust-table-2']/tbody[1]/tr[1]/td[6]/a[1]/span")).click();
	         
				// Date validation
	         Thread.sleep(5000);
	         

				WebElement element3 = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[2]/form/div[2]/div/input"));
				JavascriptExecutor executor3 = (JavascriptExecutor)driver;
				executor3.executeScript("arguments[0].click();", element3);	

				
				 WebElement text2 = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[2]/form/div[2]/div/input"));
				    String textagain2 = text2.getAttribute("value");
				System.out.println(textagain2);

				}
				
				
			

			
			public static void Check_Versions() throws InterruptedException {
				
				// Checking the Version
				
				Thread.sleep(5000);
				WebElement Version = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/button[3]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Version);
				
				driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/button[3]")).click();
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
				WebElement ReviewAgain = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/button[4]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ReviewAgain);
				
				driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/button[4]")).click();
				
//				String ShowdocSubmit = driver.findElement(By.xpath("/html/body/app-root/notifier-container/ul/li/notifier-notification/p")).getText();
//				Assert.assertEquals("Showdoc submitted for review!", ShowdocSubmit);

			
			}
			
			public static void PublishAgain_Val() throws InterruptedException {
				
				//publishing the showdoc
				
				Thread.sleep(5000);
				WebElement PublishAgain = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/div/button[1]"));
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", PublishAgain);
				
				driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/div/button[1]")).click();
    
         driver.findElement(By.xpath("//*[@id='se-ct-cust-table-2']/tbody[1]/tr[1]/td[6]/a[1]/span")).click();
         
         Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-showdoc/div/div/app-showdoc-form/div[1]/div[2]/button[4]")).click();
			}
			
			// Home page
			
public static void HomePage_Val() throws InterruptedException {
				
				// Content categories By Filters
	Thread.sleep(5000);
	WebElement dropdown = driver.findElement(By.cssSelector(".se-ct-cust-table-2_filter54"));
    dropdown.findElement(By.xpath("//option[. = 'Communications Or Blogs']")).click();
				
				
    driver.findElement(By.cssSelector(".se-ct-cust-table-2_filter54")).click();
    driver.findElement(By.cssSelector(".se-ct-cust-table-2_filterStatus54")).click();
    
    
    // Display status By Filters
    Thread.sleep(5000);
    
    WebElement dropdown1 = driver.findElement(By.cssSelector(".se-ct-cust-table-2_filterStatus54"));
    dropdown1.findElement(By.xpath("//option[. = 'Published']")).click();
    
    driver.findElement(By.cssSelector(".se-ct-cust-table-2_filterStatus54")).click();
    
			}
public static void Export_Val() throws InterruptedException {
	

	
	Thread.sleep(5000);
	WebElement Export = driver.findElement(By.xpath("//*[@id=\"create-new-btn\"]"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Export);
	
	driver.findElement(By.xpath("//*[@id=\"create-new-btn\"]")).click();
	
	
	// Getting the count
	Thread.sleep(10000);
	
	String Count = driver.findElement(By.xpath("//*[@id='se-ct-cust-table-2_info']")).getText();
	   System.out.println(Count);
	
}


}
