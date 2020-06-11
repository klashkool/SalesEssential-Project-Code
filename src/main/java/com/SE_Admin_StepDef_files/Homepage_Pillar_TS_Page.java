package com.SE_Admin_StepDef_files;

import com.Admin_Dashboard.Pillarpage_Ts;
import com.HomePagePillar_Ts.Ts_Asset;
import com.HomePagePillar_Ts.Ts_Contacts;
import com.HomePagePillar_Ts.Ts_Template;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Homepage_Pillar_TS_Page {
	
	@Given("^Click on Ts$")
	public void click_on_Ts() throws InterruptedException  {
		Pillarpage_Ts.Click_TraditionalServices();
	    	}

	@Then("^Create New Ts Template$")
	public void create_New_Ts_Template() throws InterruptedException  {
		Ts_Template.Create_Ts_Template();
		
	
		
		
	   
	}

	@Then("^Create New Ts Asset$")
	public void create_New_Ts_Asset() throws InterruptedException  {
		Ts_Asset.Create_Ts_Assets();
	    
	}

	@Then("^Create New Ts Contacts$")
	public void create_New_Ts_Contacts() throws InterruptedException  {
		Ts_Contacts.Create_Ts_Contacts();
	    
	}



}
