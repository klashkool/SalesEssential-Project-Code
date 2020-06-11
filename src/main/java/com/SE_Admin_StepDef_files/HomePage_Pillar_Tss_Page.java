package com.SE_Admin_StepDef_files;

import com.Admin_Dashboard.Pillarpage_Tss;
import com.HomePagePillar_Tss.Tss_Asset;
import com.HomePagePillar_Tss.Tss_Contacts;
import com.HomePagePillar_Tss.Tss_Template;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePage_Pillar_Tss_Page {
	
	
	@Given("^Click on Tss$")
	public void click_on_Tss() throws InterruptedException 
 {
		Pillarpage_Tss.Click_Technology_Support_Services();
	}

	@Then("^Create New Tss Template$")
	public void create_New_Tss_Template() throws InterruptedException  {
	Tss_Template.Create_TssTemplate();
	    
	}

	@Then("^Create New Tss Asset$")
	public void create_New_Tss_Asset() throws InterruptedException  {
		Tss_Asset.Create_Tss_Assets();
	    
	}

	@Then("^Create New Tss Contacts$")
	public void create_New_Tss_Contacts() throws InterruptedException  {
		Tss_Contacts .Create_Tss_Contacts();
	    
	}



}
