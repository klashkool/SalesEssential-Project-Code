package com.SE_Admin_StepDef_files;

import org.openqa.selenium.By;

import com.Admin_Dashboard.Sales_Play;
import com.SalesPlay_Module.Manage_SalesPlay_page;
import com.SalesPlay_Module.SP_Assets;
import com.SalesPlay_Module.SP_Contacts;
import com.SalesPlay_Module.SP_Details;
import com.SalesPlay_Module.SP_Template;
import com.base.Salesessential_base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SalesPlay_StepDef_Page extends Salesessential_base {

	@Given("^Launch the url$")
	public void launch_the_url() {
		Salesessential_base.initialization();

	}

	@Then("^Login with valid admin credentials$")
	public void login_with_valid_admin_credentials() {
		driver.findElement(By.id("Intranet_ID")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("Login")).click();
		driver.findElement(By.linkText("Home")).click();
	}

	@Given("^Click on SalesPlay$")
	public void click_on_SalesPlay() throws InterruptedException {
		
		Sales_Play.Click_SalesPlay();

	}

	@Then("^Create New Template$")
	public void create_New_Template() throws InterruptedException {
		Manage_SalesPlay_page.CreateNew_Btn();
		SP_Template.Create_Template();
		SP_Template.AudienceDD_Val();
		SP_Template.SellerRoleDD_Val();
		SP_Template.SalesStageDD_Val();
		SP_Template.BuyJourDD_Val();
		SP_Template.GeoDD_Val();
		SP_Template.IndustryDD_Val();
		SP_Template.ServiceLinesDD_Val();
		SP_Template.SecurityDD_Val();
		SP_Template.QAStatusDD_Val();
		SP_Template.QACommDD_Val();

	}

	@Then("^Create Details$")
	public void create_Details() throws InterruptedException {
		SP_Details.Create_Details();
	}

	@Then("^Create Asset$")
	public void create_Asset() throws InterruptedException {
		SP_Assets.Create_Assets();

	}

	@Then("^Create Contacts$")
	public void create_Contacts() throws InterruptedException {
		SP_Contacts.Create_Contacts();
		
	}

	@Then("^Publish SalesPlay$")
	public void publish_SalesPlay() {

	}

}
