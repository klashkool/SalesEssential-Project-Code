package com.SE_Admin_StepDef_files;

import com.Admin_Dashboard.Manage_Assets;
import com.ManageAssets.Manage_Assets_Page;
import com.ManageAssets.Publish_Assets;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

   public class ManageAssets_StepDef_Page {

@Given("^Click on Manage Assets$")
public void click_on_Manage_Assets() throws InterruptedException  {
	
	Manage_Assets.Click_ManageAssets();
	
	
    
}

@Then("^Create New Manage Assets$")
public void create_New_Manage_Assets() throws InterruptedException  {
	Manage_Assets_Page.CreateNew_Btn_Assets();
	Publish_Assets.Create_Assets();
	Publish_Assets.AudienceDD_Val();
	Publish_Assets.SellerRoleDD_Val();
	Publish_Assets.SalesStageDD_Val();
	Publish_Assets.BuyJourDD_Val();
	Publish_Assets.Language_Val();
	Publish_Assets.GeoDD_Val();
	Publish_Assets.IndustryDD_Val();
	Publish_Assets.ServiceLinesDD_Val();
	Publish_Assets.StrategicInitiatives_Val();
	Publish_Assets.StrategicInitiativesCategories_Val();
	Publish_Assets.Covid19_Val();
	Publish_Assets.Conversations_Val();
	Publish_Assets.ThirdParty_Val();
	Publish_Assets.Alliances_Val();
	Publish_Assets.Event_Val();
	Publish_Assets.Competitor_Val();
	Publish_Assets.Industry_sector_Val();
	Publish_Assets.Seismic_profile_distribution_Val();
	Publish_Assets.Target_buyer_Val();
	Publish_Assets.Market_Val();
	
	Publish_Assets.Save_showdoc();
	Publish_Assets.QACommDD_Val();
	Publish_Assets.QAStatusDD_Val();
	Publish_Assets.Review_Val();
	Publish_Assets.title_Val();
	Publish_Assets.Publish_Val();
	//Publish_Assets.Archive_Val();
	//Publish_Assets.FilterArchived_Val();
	Publish_Assets.AcousticLogin_Val();
	Publish_Assets.Admin_LoginAgain_Val();
	
	
	
	
    
}

@Then("^Submit for Review Manage Assets$")
public void submit_for_Review_Manage_Assets() {
    
}

@Then("^Publish Manage Assets$")
public void publish_Manage_Assets()  {
    
}

@Then("^Archive the Manage Assets$")
public void archive_the_Manage_Assets()  {
    
}

@Then("^Preview the Manage Assets$")
public void preview_the_Manage_Assets()  {
    
}


}
