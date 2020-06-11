package com.SE_Admin_StepDef_files;

import com.Admin_Dashboard.Click_on_OID;
import com.RemoveGSM.Solution_Plays_WCh_and_Covid_19;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Seismic_WCH {
	
	@Given("^Click on Oid$")
	public void click_on_Oid() throws InterruptedException  {
		Click_on_OID.Click_Opt1_Tool();
		
		
	    
	}

	@Then("^Update Message in Details Tab$")
	public void update_Message_in_Details_Tab() throws InterruptedException  {
		
		Solution_Plays_WCh_and_Covid_19.Check_Solution_Plays_covid19();
		
		Solution_Plays_WCh_and_Covid_19.StrategicinitiativeD_Val();
		
	    
	}

	@Then("^Check Seismic page$")
	public void check_Seismic_page()  {
	    
	}



}
