Feature: Regressiontest suites2
Background: Launch SalesEssentials 

	Given Launch the url
	Then Login with valid editor credentials
	
	@Test11
Scenario: Create and Publish Showdocs
 
   Given Click on Showdocs as an editor
   Then Create New Showdocs as an editor
   Then Submit for Review as an editor
   Then Publish Showdocs as an editor
   Then Check the Versions as an editor
   Then Archive the Showdocs as an editor
   And Preview the Showdocs as an editor