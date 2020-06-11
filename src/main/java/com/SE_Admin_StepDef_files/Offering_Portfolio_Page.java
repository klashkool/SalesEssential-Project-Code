package com.SE_Admin_StepDef_files;

import com.Admin_Dashboard.Opt_page;
import com.Opt_Tool.Opt_Asset;
import com.Opt_Tool.Opt_Banner;
import com.Opt_Tool.Opt_Contacts;
import com.Opt_Tool.Opt_Details;
import com.Opt_Tool.Opt_GeoAvailibility;
import com.Opt_Tool.Opt_Overview;
import com.Opt_Tool.Opt_Portfolio;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Offering_Portfolio_Page {
	
	
	@Given("^Click on Opt$")
	public void click_on_Opt() throws InterruptedException {
		
	    
	    Opt_page.Click_Opt_Tool();
	}
	
	@Then("^Click on Opt Banner$")
	public void click_on_Opt_Banner() throws InterruptedException  {
		Opt_Banner.Create_Banner();
	   
	}

	@Then("^Create New Opt Overview$")
	public void create_New_Opt_Overview() throws InterruptedException  {
		Opt_Overview.Create_Overview();
	    
	}

	@Then("^Create New Opt Portfolio Position$")
	public void create_New_Opt_Portfolio_Position() throws InterruptedException  {
		Opt_Portfolio.Create_Portfolio();
	    
	}

	@Then("^Create New Opt Details$")
	public void create_New_Opt_Details() throws InterruptedException  {
		Opt_Details.Create_Details();
	    
	}
	
	@Then("^Create New Opt Assets$")
	public void create_New_Opt_Assets() throws InterruptedException  {
		Opt_Asset.Create_Opt_Assets();
	    
	}

	@Then("^Create New Opt Contacts$")
	public void create_New_Opt_Contacts() throws InterruptedException  {
		Opt_Contacts.Create_OPTContacts();
	
	    
	}

	@Then("^Create New Opt Geo Availability$")
	public void create_New_Opt_Geo_Availability() throws InterruptedException {
		Opt_GeoAvailibility.Create_GeoAvail();
		Opt_GeoAvailibility.AcousticLogin_Val();
		Opt_GeoAvailibility.Admin_LoginAgain_Val();
	    
	}



}
