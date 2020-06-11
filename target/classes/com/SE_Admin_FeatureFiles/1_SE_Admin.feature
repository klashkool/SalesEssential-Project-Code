Feature: Regressiontest suites2

Background: Launch SalesEssentials 

	Given Launch the url
	Then Login with valid admin credentials
	
@Test1	
Scenario: Create and Publish SalesPlay Template 

	Given Click on SalesPlay 
	Then Create New Template  
	Then Create Details  
	Then Create Asset  
	Then Create Contacts
	And Publish SalesPlay
	
@Test2	
Scenario: Create and Publish Showdocs
 
   Given Click on Showdocs
   Then Create New Showdocs
   Then Submit for Review
   Then Publish Showdocs
   Then Check the Versions
   Then Archive the Showdocs
   And Preview the Showdocs
   
 @Test3
   Scenario: Create and Publish Sparklers
   
   Given Click on Sparklers
   Then Create New Sparklers
   Then Publish Sparklers
   And Create Industry Sparklers
   
   @Test4
   Scenario:  Create  Pillar Multicloud

	Given Click on Mcs
	Then Create New Mcs Template
	Then Create New Mcs Asset  
	Then Create New Mcs Contacts
	
	@Test5
   Scenario:  Create  Pillar Tradtional Services

	Given Click on Ts
	Then Create New Ts Template
	Then Create New Ts Asset  
	And Create New Ts Contacts
	
	@Test6
   Scenario:  Create  Pillar Technology Support Services

	Given Click on Tss
	Then Create New Tss Template
	Then Create New Tss Asset  
	And Create New Tss Contacts
	
	@Test7
   Scenario:  Create HomePage Pillar

	Given Click on Hpp
	Then Create New Hpp Template
	Then Create New Hpp Asset  
	Then Create New Hpp More Resources
	Then Create New Hpp Contacts
	And Create New Hpp Carousel
	
		@Test8
   Scenario:  Create Offering Portfolio Tool

	Given Click on Opt 
	Then Click on Opt Banner
	Then Create New Opt Overview
	Then Create New Opt Portfolio Position  
	Then Create New Opt Details
	Then Create New Opt Assets
	Then Create New Opt Contacts
	And Create New Opt Geo Availability
	
	@Test9
Scenario: Create and Publish Manage Assets
 
   Given Click on Manage Assets
   Then Create New Manage Assets
   Then Submit for Review Manage Assets
   Then Publish Manage Assets
   Then Archive the Manage Assets
   And Preview the Manage Assets
   
   
   @Test10
   	Scenario:  Remove GSM 432

	Given Click on Oid
	Then Update Message in Details Tab
	And Check Seismic page
	 
	
	

	
	
	
   

	