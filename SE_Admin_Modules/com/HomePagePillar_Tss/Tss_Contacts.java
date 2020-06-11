package com.HomePagePillar_Tss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Salesessential_base;
import com.utils.ExcelSheetReader;

public class Tss_Contacts  extends Salesessential_base {
	
	static WebDriverWait wait = new WebDriverWait(driver, 100);
	static List<HashMap<String, String>> Contacts = ExcelSheetReader.SP_Contacts_data();
	
	
		public static void Create_Tss_Contacts() throws InterruptedException  {
			
			
			
			WebElement element = driver.findElement(By.linkText("Contacts"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
			
			// To click on Create New Button under Contacats tab
			
			
			
						WebElement element1 = driver.findElement(By.id("create-new-btn"));
						JavascriptExecutor executor1 = (JavascriptExecutor)driver;
						executor1.executeScript("arguments[0].click();", element1);
						
						Thread.sleep(5000);
						WebElement element2 = driver.findElement(By.id("intranetId"));
						JavascriptExecutor executor2 = (JavascriptExecutor)driver;
						executor2.executeScript("arguments[0].click();", element2);
						
						
						
						
					    driver.findElement(By.id("intranetId")).sendKeys("santhosh nithya R");
					    Thread.sleep(10000);
					    driver.findElement(By.cssSelector("#faces-list > li")).click();
					    driver.findElement(By.cssSelector("#override-role small")).click();
					    
					  
					    driver.findElement(By.xpath("//*[@id='pillar-contact-form']/div[3]/button[1]")).click();
					    
					    // To publish
					    
					 // To publish

					    WebElement element6 = driver.findElement(By.xpath("//a[3]/span"));
					    JavascriptExecutor executor6 = (JavascriptExecutor)driver;
					    executor6.executeScript("arguments[0].click();", element6);
					    Thread.sleep(5000);
					    

					    driver.findElement(By.xpath("//button[contains(.,'Yes')]")).click();
					    

					    
			
		
			
//			WebElement element = driver.findElement(By.linkText("Contacts"));
//			JavascriptExecutor executor = (JavascriptExecutor)driver;
//			executor.executeScript("arguments[0].click();", element);
//			
//			// To click on Create New Button under Contacats tab
//			
//			
//			
//						WebElement element1 = driver.findElement(By.id("create-new-btn"));
//						JavascriptExecutor executor1 = (JavascriptExecutor)driver;
//						executor1.executeScript("arguments[0].click();", element1);
//						driver.findElement(By.name("emailID")).sendKeys(Contacts.get(0).get("Email Id"));
//						driver.findElement(By.xpath("//li[contains(.,'santhr10@in.ibm.com / Santhosh Nithya R')]")).click();
//						
//					List<WebElement> EmailDD = driver.findElements(By.xpath("//*[@id='faces-list']"));
//						System.out.println(EmailDD.size());
//						
//						for(int a=1; a<=EmailDD.size(); a++) {
//							
//							String Email = driver.findElement(By.xpath("//*[@id='faces-list']")).getText();
//							System.out.println(Email);
//						}
//							 driver.findElement(By.xpath("//*[@id='email-wrapper']/div[2]")).click();
//								
////								String username = driver.findElement(By.name("userName")).getText();
////								Assert.assertEquals(username,Contacts.get(0).get("Name"));
////								System.out.println(username);
////							    
////					            String userrole = driver.findElement(By.name("userRole")).getText();
////					            Assert.assertEquals(userrole,Contacts.get(0).get("Role"));
////								System.out.println(userrole);
//								
//								driver.findElement(By.xpath("//*[@id='override-role']/span/small")).click();
//								
//								String ContactType = driver.findElement(By.name("contactType")).getText();
////								Assert.assertEquals(ContactType,Contacts.get(0).get("Type"));
////								System.out.println(ContactType);
//								
//								driver.findElement(By.xpath("//*[@id='priority']/span/small")).click();
//								
//								driver.findElement(By.xpath("//*[@id='order']")).sendKeys("1");
//								
//								// Geography
//								
//								String[] Geo = Contacts.get(0).get("Geography").split("/", 0);
//								List<String> GeoList = Arrays.asList(Geo);
//								System.out.println(GeoList);
//
//								WebElement Geo_view= driver.findElement((By.id("geo")));
//								((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Geo_view);
//								Thread.sleep(500);
//
//								Select GeoBox = new Select(
//										driver.findElement(By.id("geo")));
//								List<WebElement> selectedGeo = GeoBox.getAllSelectedOptions();
//
//								List<String> SelectedGeoList = new ArrayList<String>();
//								for (int i = 0; i < selectedGeo.size(); i++) {
//									String SelectedGeoTxt = selectedGeo.get(i).getText().trim();
//									System.out.println(SelectedGeoTxt);
//									SelectedGeoList.add(SelectedGeoTxt);
//								}
//								Assert.assertEquals(GeoList, SelectedGeoList);
//								
//								// Save contacts
//								
//								
//								
//								
//								
//								Thread.sleep(1000);
//							WebElement SaveContacts = driver.findElement(By.xpath("//button[contains(.,'Save')]"));
//							((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", SaveContacts);
//
//							wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[contains(.,'Save')]")));
//							driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
//							
						}
							
							

							
						
							
							
						
		}

