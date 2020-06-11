$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("1_SE_Admin.feature");
formatter.feature({
  "line": 1,
  "name": "Regressiontest suites2",
  "description": "",
  "id": "regressiontest-suites2",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "Launch SalesEssentials",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Launch the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Login with valid admin credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "SalesPlay_StepDef_Page.launch_the_url()"
});
formatter.result({
  "duration": 13590108900,
  "status": "passed"
});
formatter.match({
  "location": "SalesPlay_StepDef_Page.login_with_valid_admin_credentials()"
});
formatter.result({
  "duration": 15107727900,
  "status": "passed"
});
formatter.scenario({
  "line": 84,
  "name": "Create and Publish Manage Assets",
  "description": "",
  "id": "regressiontest-suites2;create-and-publish-manage-assets",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 83,
      "name": "@Test9"
    }
  ]
});
formatter.step({
  "line": 86,
  "name": "Click on Manage Assets",
  "keyword": "Given "
});
formatter.step({
  "line": 87,
  "name": "Create New Manage Assets",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "Submit for Review Manage Assets",
  "keyword": "Then "
});
formatter.step({
  "line": 89,
  "name": "Publish Manage Assets",
  "keyword": "Then "
});
formatter.step({
  "line": 90,
  "name": "Archive the Manage Assets",
  "keyword": "Then "
});
formatter.step({
  "line": 91,
  "name": "Preview the Manage Assets",
  "keyword": "And "
});
formatter.match({
  "location": "ManageAssets_StepDef_Page.click_on_Manage_Assets()"
});
formatter.result({
  "duration": 1271361400,
  "status": "passed"
});
formatter.match({
  "location": "ManageAssets_StepDef_Page.create_New_Manage_Assets()"
});
formatter.result({
  "duration": 12557930200,
  "error_message": "java.lang.AssertionError: expected:\u003c[Brand Rep, Coverage Rep, Digital Demand Rep]\u003e but was:\u003c[]\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.ManageAssets.Publish_Assets.SellerRoleDD_Val(Publish_Assets.java:104)\r\n\tat com.SE_Admin_StepDef_files.ManageAssets_StepDef_Page.create_New_Manage_Assets(ManageAssets_StepDef_Page.java:26)\r\n\tat ✽.Then Create New Manage Assets(1_SE_Admin.feature:87)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "ManageAssets_StepDef_Page.submit_for_Review_Manage_Assets()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ManageAssets_StepDef_Page.publish_Manage_Assets()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ManageAssets_StepDef_Page.archive_the_Manage_Assets()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ManageAssets_StepDef_Page.preview_the_Manage_Assets()"
});
formatter.result({
  "status": "skipped"
});
});