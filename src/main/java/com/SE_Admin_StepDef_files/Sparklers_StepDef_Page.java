package com.SE_Admin_StepDef_files;

import com.Admin_Dashboard.Sparklers;
import com.Sparklers_Page.Manage_Sparklers_Page;
import com.Sparklers_Page.Publishing_Sparklers_Page;
import com.base.Salesessential_base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Sparklers_StepDef_Page extends Salesessential_base {
	
	@Given("^Click on Sparklers$")
	public void click_on_Sparklers() throws InterruptedException  {
		Sparklers.Click_Sparklers();
	    
	}

	@Then("^Create New Sparklers$")
	public void create_New_Sparklers() throws InterruptedException  {
		Manage_Sparklers_Page.CreateNew_Btn();
		Publishing_Sparklers_Page.Create_Sparklers();
		Publishing_Sparklers_Page.Create_IndustrySparklers();
		Publishing_Sparklers_Page.Submit_IndustrySparklers();
		Publishing_Sparklers_Page.Publish_IndustrySparklers();
		
	   
	}

	@Then("^Publish Sparklers$")
	public void publish_Sparklers() throws InterruptedException {
		
	}

	@Then("^Create Industry Sparklers$")
	public void create_Industry_Sparklers()  {
	    
	}



}
