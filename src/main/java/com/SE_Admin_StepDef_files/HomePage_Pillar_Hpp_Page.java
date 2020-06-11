package com.SE_Admin_StepDef_files;

import com.Admin_Dashboard.Pillarpage_Hpp;
import com.HomePagePillar_hpp.Hpp_Asset;
import com.HomePagePillar_hpp.Hpp_Carousel;
import com.HomePagePillar_hpp.Hpp_MoreResources;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePage_Pillar_Hpp_Page {
	@Given("^Click on Hpp$")
	public void click_on_Hpp() throws InterruptedException  {
		Pillarpage_Hpp.Click_Homepage_Pillar();
	    
	}

	@Then("^Create New Hpp Template$")
	public void create_New_Hpp_Template()  {
	    
	}

	@Then("^Create New Hpp Asset$")
	public void create_New_Hpp_Asset() throws InterruptedException  {
		Hpp_Asset.Create_Hpp_Assets();
	    
	}

	@Then("^Create New Hpp More Resources$")
	public void create_New_Hpp_More_Resources() throws InterruptedException  {
		Hpp_MoreResources.Create_Hpp_MoreResources();
		
	    
	}

	@Then("^Create New Hpp Contacts$")
	public void create_New_Hpp_Contacts() {
	    
	}
	
	@Then("^Create New Hpp Carousel$")
	public void create_New_Hpp_Carousel() throws InterruptedException {
	    Hpp_Carousel.Create_Hpp_Carousel();
	}

}
