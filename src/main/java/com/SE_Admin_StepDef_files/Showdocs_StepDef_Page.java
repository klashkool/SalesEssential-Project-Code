package com.SE_Admin_StepDef_files;

import com.Admin_Dashboard.Show_Docs;
import com.Showdocs_Module.Manage_Showdocs_page;
import com.Showdocs_Module.Publishing_Showdocs_Page;
import com.base.Salesessential_base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Showdocs_StepDef_Page extends Salesessential_base {
	
	@Given("^Click on Showdocs$")
	public void click_on_Showdocs() throws InterruptedException {
		
		
		
		Show_Docs.Click_Showdocs();
		

	    
	}

	@Then("^Create New Showdocs$")
	public void create_New_Showdocs() throws InterruptedException  {
		Manage_Showdocs_page.CreateNew_Btn_Showdocs();
		Publishing_Showdocs_Page.Create_Showdocs();
		Publishing_Showdocs_Page.AudienceDD_Val();
		Publishing_Showdocs_Page.SellerRoleDD_Val();
		Publishing_Showdocs_Page.SalesStageDD_Val();
		Publishing_Showdocs_Page.BuyJourDD_Val();
		Publishing_Showdocs_Page.GeoDD_Val();
		Publishing_Showdocs_Page.IndustryDD_Val();
		Publishing_Showdocs_Page.ServiceLinesDD_Val();
		Publishing_Showdocs_Page.StrategicInitiatives_Val();
		Publishing_Showdocs_Page.StrategicInitiativesCategories_Val();
		Publishing_Showdocs_Page.Covid19_Val();
		Publishing_Showdocs_Page.Conversations_Val();
		Publishing_Showdocs_Page.ThirdParty_Val();
		Publishing_Showdocs_Page.Covid19_Val();
		Publishing_Showdocs_Page.Conversations_Val();
		Publishing_Showdocs_Page.ThirdParty_Val();
		Publishing_Showdocs_Page.Alliances_Val();
		Publishing_Showdocs_Page.Event_Val();
		
		Publishing_Showdocs_Page.SecurityDD_Val();
		
		Publishing_Showdocs_Page.Save_showdoc();
		
		Publishing_Showdocs_Page.QACommDD_Val();
		Publishing_Showdocs_Page.QAStatusDD_Val();
		Publishing_Showdocs_Page.Review_Val();
		Publishing_Showdocs_Page.Publish_Val();
		Publishing_Showdocs_Page.Check_Versions();
		Publishing_Showdocs_Page.ReviewAgain_Val();
		Publishing_Showdocs_Page.PublishAgain_Val();
		Publishing_Showdocs_Page.HomePage_Val();
		Publishing_Showdocs_Page.Export_Val();
		Publishing_Showdocs_Page.AcousticLogin_Val();
		//Publishing_Showdocs_Page.Notifyurl_LoginAgain_Val();
		Publishing_Showdocs_Page.Admin_LoginAgain_Val();
		
		
		
	
	   
	}

	@Then("^Submit for Review$")
	public void submit_for_Review()  {
	    
	}

	@Then("^Publish Showdocs$")
	public void publish_Showdocs()  {
	    
	}

	@Then("^Check the Versions$")
	public void check_the_Versions()  {
	    
	    
	}

	@Then("^Archive the Showdocs$")
	public void archive_the_Showdocs()  {
	    
	}

	@Then("^Preview the Showdocs$")
	public void preview_the_Showdocs()  {
	   
	}

}
