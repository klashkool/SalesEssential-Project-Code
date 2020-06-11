package com.SE_Admin_TestRunner_file;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.Salesessential_base;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class SE_Admin_TestRunner extends Salesessential_base {

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\SE_Admin_FeatureFiles", // the
			// path
			// of
			// the
			// feature
			// files
			glue = { "com.SE_Admin_StepDef_files" }, // the path of the step definition files
			plugin = { "pretty", "html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml",
					"com.cucumber.listener.ExtentCucumberFormatter:C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\Reports\\         report.html" }, // to
			// generate
			// different
			// types
			// of
			// reporting
			monochrome = true, // display the console output in a proper readable format
			strict = true, // it will check if any step is not defined in step definition file
			
			dryRun = false,
			
			//dryRun = true,
			// to check the mapping is proper between feature file and step def file
			// tags = { "@Test2,@Test3,@Test4" }
			// tags = {"@Test10,@Test11"}
			tags = { "@Test9"
					+ "" })

	public static class PO_Scenarios_TestRunner {

		@AfterClass
		public static void reportSetup() {
			try {
				Reporter.loadXMLConfig(
						new File("C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\extend-config.xml"));
			} catch (Exception e) {
				System.out.println(e);
			}

			Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
			Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
			Reporter.setSystemInfo("64 Bit", "Windows 10");
			Reporter.setSystemInfo("2.53.0", "Selenium");
			Reporter.setSystemInfo("3.3.9", "Maven");
			Reporter.setSystemInfo("1.8.0_66", "Java Version");
			Reporter.setTestRunnerOutput("Cucumber JUnit Test Runner");
		}

	}

}
