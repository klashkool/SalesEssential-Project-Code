package com.SE_Admin_StepDef_files;

import com.Admin_Dashboard.Pillarpage_Mcs;
import com.HomePagePillar_Mcs.Mcs_Asset;
import com.HomePagePillar_Mcs.Mcs_Contacts;
import com.HomePagePillar_Mcs.Mcs_Template;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePage_Pillar_MCS_Page {
	
	
	@Given("^Click on Mcs$")
	public void click_on_Mcs() throws InterruptedException  {
		 Pillarpage_Mcs.Click_MulticloudServices();
	}

	@Then("^Create New Mcs Template$")
	public void create_New_Mcs_Template() throws InterruptedException {
		Mcs_Template.Create_McsTemplate();
	    
	}

	@Then("^Create New Mcs Asset$")
	public void create_New_Mcs_Asset() throws InterruptedException  {
		Mcs_Asset.Create_Mcs_Assets();
	    
	}

	@Then("^Create New Mcs Contacts$")
	public void create_New_Mcs_Contacts() throws InterruptedException  {
		Mcs_Contacts.Create_MCSContacts();
	    
	}



}
