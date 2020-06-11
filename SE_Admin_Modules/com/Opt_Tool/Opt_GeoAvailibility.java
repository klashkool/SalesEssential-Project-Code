package com.Opt_Tool;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;
import com.utils.ExcelSheetReader;

public class Opt_GeoAvailibility  extends Salesessential_base {
	static WebDriverWait wait = new WebDriverWait(driver, 100);
	static List<HashMap<String, String>> Opt_Geo = ExcelSheetReader.Opt_Geo_data();
	
	
		public static void Create_GeoAvail() throws InterruptedException  {
//			
//			WebElement element = driver.findElement(By.linkText("Geo Availability"));
//			JavascriptExecutor executor = (JavascriptExecutor)driver;
//			executor.executeScript("arguments[0].click();", element);
			
			// To click on check box
			//   //tree-root[@id='geo-tree']/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/tree-node-checkbox/input
			
//          driver.findElement(By.xpath("//tree-root[@id='geo-tree']/tree-viewport/div/div/tree-node-collection/div/tree-node/div/tree-node-wrapper/div/tree-node-checkbox/input")).click();
//          driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
//          
//          Thread.sleep(5000);
//          
//          driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
//          Thread.sleep(2000);
          
          // /html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[1]/div[4]/div/button[3]-delete draft
          // 
          WebElement element1 = driver.findElement(By.xpath("/html/body/app-root/div/div[2]/app-offering-portfolio-tool/div[2]/div[1]/div[4]/div/button[3]"));
			JavascriptExecutor executor1 = (JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();", element1);
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//button[contains(.,'Yes')]")).click();
			
			
			
			Thread.sleep(15000);
			
			// To check that offering
			driver.findElement(By.xpath("//input[@id='search-term']")).clear();
			driver.findElement(By.xpath("//input[@id='search-term']")).sendKeys("20G7C");
			driver.findElement(By.id("search-term")).sendKeys(Keys.ENTER);
		    driver.findElement(By.cssSelector(".glyphicon-check")).click();
		    
		    // To check if Draft is deleted status has changed to published or not
		    
		    String Status_Published = driver.findElement(By.xpath("//p[contains(.,'Status: Published')]")).getText();    
	         System.out.println(Status_Published);
			
			// To select the offering id
			
//			 WebElement element11 = driver.findElement(By.xpath("//*[@id='optGrid']/div[5]/div/div/div[1]/label"));
//				JavascriptExecutor executor11 = (JavascriptExecutor)driver;
//				executor11.executeScript("arguments[0].click();", element11);
//				Thread.sleep(5000);
				
				// To Process the Request
//				
//				WebElement element12 = driver.findElement(By.xpath("//span[contains(.,'Process Request')]"));
//				JavascriptExecutor executor12 = (JavascriptExecutor)driver;
//				executor12.executeScript("arguments[0].click();", element12);
				
							
				
				
				
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

			//  Thread.sleep(1000);
					driver.switchTo().frame("wch-iframe");

			//driver.findElement(By.xpath("//button[@id='content-filter-btn']")).click();
			//driver.findElement(By.cssSelector("#facetList_540 > .facet-item:nth-child(5) .facet-label")).click();

					WebElement element93 = driver.findElement(By.xpath("//li[8]/button"));
					JavascriptExecutor executor93 = (JavascriptExecutor) driver;
					executor93.executeScript("arguments[0].click();", element93);

					WebElement element9 = driver.findElement(By.xpath("//span[contains(.,'se-hierarchy')]"));
					JavascriptExecutor executor9 = (JavascriptExecutor) driver;
					executor9.executeScript("arguments[0].click();", element9);

					driver.findElement(By.id("search-input")).sendKeys("20G7C");
					driver.findElement(By.id("search-input")).sendKeys(Keys.ENTER);
					Thread.sleep(1000);

					driver.findElement(
							By.cssSelector(".ng-scope:nth-child(1) > .ng-scope > .authoring-item-name-container .ng-binding"))
							.click();
                    //driver.findElement(By.xpath("//*[@id=\"banner-message-warning-2170\"]/div[2]/button/span/svg")).click();
					driver.findElement(By.xpath("//button[contains(.,'Create draft')]")).click();

					driver.findElement(By.xpath("//input[@id='validationDate-singleLine-value']")).clear();
					driver.findElement(By.xpath("//input[@id='validationDate-singleLine-value']")).sendKeys("2020-04-20");

					driver.findElement(By.xpath("//input[@id='expirationDate-singleLine-value']")).clear();
					driver.findElement(By.xpath("//input[@id='expirationDate-singleLine-value']")).sendKeys("2021-04-20");

					WebElement element91 = driver.findElement(By.xpath("//button[@id='content-ready-btn']"));
					JavascriptExecutor executor91 = (JavascriptExecutor) driver;
					executor91.executeScript("arguments[0].click();", element91);

					WebElement element92 = driver.findElement(By.xpath("//*[@id=\"ready-all-btn\"]"));
					JavascriptExecutor executor92 = (JavascriptExecutor) driver;
					executor92.executeScript("arguments[0].click();", element92);
					Thread.sleep(5000);
					// driver.close();

				}

				
				
				public static void Admin_LoginAgain_Val() throws InterruptedException {

					driver.get(prop.getProperty("url"));
//				driver.findElement(By.xpath("//*[@id='Intranet_ID']")).sendKeys("santhr10@in.ibm.com");
//				driver.findElement(By.xpath("//*[@id='password']")).sendKeys("SANTHoshnithya@ibm");

					// driver.findElement(By.xpath("//*[@id='loginform']/input[3]")).click();
					WebElement OptClick = driver.findElement(By.linkText("Offering Portfolio Tool"));
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", OptClick);
					Thread.sleep(5000);
					driver.findElement(By.linkText("Offering Portfolio Tool")).click();
					
					Thread.sleep(5000);
					
					WebElement element1 = driver.findElement(By.xpath("//input[@id='search-term']"));
					JavascriptExecutor executor1 = (JavascriptExecutor)driver;
					executor1.executeScript("arguments[0].click();", element1);

					// Opt search to pick offering id 6955-03C
					
					
				    driver.findElement(By.id("search-term")).sendKeys("20G7C");
				    driver.findElement(By.id("search-term")).sendKeys(Keys.ENTER);
				    driver.findElement(By.cssSelector(".glyphicon-check")).click();
				    
				   


					
//					String alret_text = driver.findElement(By.xpath("//form/div/div/p")).getText();
//
//					System.out.println(alret_text);

					// Date validation
					Thread.sleep(5000);

					WebElement element3 = driver.findElement(By.xpath(
							"//*[@id=\"qa-comment\"]"));
					JavascriptExecutor executor3 = (JavascriptExecutor) driver;
					executor3.executeScript("arguments[0].click();", element3);

					WebElement text2 = driver.findElement(By.xpath("//*[@id=\"qa-comment\"]"));
					String textagain2 = text2.getAttribute("value");
					System.out.println(textagain2);

					// Expiration Date

					WebElement element31 = driver.findElement(By.xpath(
							"//*[@id=\"validationdate\"]"));
					JavascriptExecutor executor31 = (JavascriptExecutor) driver;
					executor31.executeScript("arguments[0].click();", element31);

					WebElement text21 = driver.findElement(By.xpath(
							"//*[@id=\"expirationdate\"]"));
					String textagain21 = text21.getAttribute("value");
					System.out.println(textagain21);
					
					// Now to check preview as we added details message
					
					driver.get("https://tpydalseuat01.sl.bluecloud.ibm.com/services/seismic/offering/6950-15Y");
					Thread.sleep(20000);
					
					
					
					

				}

			
		   
}

