package com.SE_Admin_StepDef_files;

import com.Admin_Dashboard.Editor_Show_Docs;
import com.EitorShowdocs_Module.Login_Editor_Showdocs_Page;
import com.EitorShowdocs_Module.Manage_EditorShowdocs_page;
import com.EitorShowdocs_Module.Publishing_EditorShowdocs_Page;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Showdocs_Editor_StepDef_Page {
	
	
	@Then("^Login with valid editor credentials$")
	public void login_with_valid_editor_credentials() throws InterruptedException  {
	    Login_Editor_Showdocs_Page.login_Showdocs_Editor();
	}

	@Given("^Click on Showdocs as an editor$")
	public void click_on_Showdocs_as_an_editor() throws InterruptedException {
		Editor_Show_Docs.Click_Showdocs_Editor();
	   
	}

	@Then("^Create New Showdocs as an editor$")
	public void create_New_Showdocs_as_an_editor() throws InterruptedException {
		Manage_EditorShowdocs_page.CreateNew_Btn_Showdocs_Editor();
		Publishing_EditorShowdocs_Page.Create_Showdocs();
		Publishing_EditorShowdocs_Page.AudienceDD_Val();
		Publishing_EditorShowdocs_Page.SellerRoleDD_Val();
		Publishing_EditorShowdocs_Page.SalesStageDD_Val();
		Publishing_EditorShowdocs_Page.BuyJourDD_Val();
		Publishing_EditorShowdocs_Page.GeoDD_Val();
		Publishing_EditorShowdocs_Page.IndustryDD_Val();
		Publishing_EditorShowdocs_Page.ServiceLinesDD_Val();
		Publishing_EditorShowdocs_Page.SecurityDD_Val();
		
		Publishing_EditorShowdocs_Page.Save_showdoc();
		
		Publishing_EditorShowdocs_Page.QACommDD_Val();
		Publishing_EditorShowdocs_Page.QAStatusDD_Val();
		Publishing_EditorShowdocs_Page.Review_Val();
		Publishing_EditorShowdocs_Page.Publish_Val();
		Publishing_EditorShowdocs_Page.Check_Versions();
		Publishing_EditorShowdocs_Page.ReviewAgain_Val();
		Publishing_EditorShowdocs_Page.PublishAgain_Val();
		Publishing_EditorShowdocs_Page.HomePage_Val();
		Publishing_EditorShowdocs_Page.Export_Val();
		
		
	
	   
	}

	@Then("^Submit for Review as an editor$")
	public void submit_for_Review_as_an_editor() {
	    
	}

	@Then("^Publish Showdocs as an editor$")
	public void publish_Showdocs_as_an_editor() {
	    
	}

	@Then("^Check the Versions as an editor$")
	public void check_the_Versions_as_an_editor()  {
	    
	}

	@Then("^Archive the Showdocs as an editor$")
	public void archive_the_Showdocs_as_an_editor() {
	    
	}

	@Then("^Preview the Showdocs as an editor$")
	public void preview_the_Showdocs_as_an_editor() {
	    
	}



}
