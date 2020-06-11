package com.utils;

import java.util.HashMap;
import java.util.List;

import com.base.Salesessential_base;

public class ExcelSheetReader extends Salesessential_base {
	
	public static List<HashMap<String, String>> Templates_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "SP_Template");
		}
	
	public static List<HashMap<String, String>> Details_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Details");
		}
	
	public static List<HashMap<String, String>> Assets_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Assets");
		}
	
	public static List<HashMap<String, String>> SP_Contacts_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "SP_Contacts");
		}
	public static List<HashMap<String, String>> Showdocs_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Showdocs");
		}
	public static List<HashMap<String, String>>Editor_Showdocs_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Editor_Showdocs");
		}
	public static List<HashMap<String, String>> ManageAssets_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "ManageAssets");
		}
	public static List<HashMap<String, String>> Sparklers_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Sparklers");
		}
	public static List<HashMap<String, String>> Mcs_Template_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Mcs_Template");
		}
	public static List<HashMap<String, String>> Mcs_Asset_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Mcs_Asset");
		}
	public static List<HashMap<String, String>> Mcs_Contacts_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Mcs_Contacts");
		}
	public static List<HashMap<String, String>> Ts_Template_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Ts_Template");
		}
	public static List<HashMap<String, String>> Ts_Asset_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Ts_Asset");
		}
	public static List<HashMap<String, String>> Ts_Contacts_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Ts_Contacts");
		}
	public static List<HashMap<String, String>> Tss_Template_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Tss_Template");
		}
	public static List<HashMap<String, String>> Tss_Asset_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Tss_Asset");
		}
	public static List<HashMap<String, String>> Tss_Contacts_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Tss_Contacts");
		}
	public static List<HashMap<String, String>> Hpp_Template_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Hpp_Template");
		}
	public static List<HashMap<String, String>> Hpp_Asset_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Hpp_Asset");
		}
	public static List<HashMap<String, String>> Hpp_MoreResources_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Hpp_MoreResources");
		}
	public static List<HashMap<String, String>> Hpp_Contacts_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Hpp_Contacts");
		}
	public static List<HashMap<String, String>> Hpp_Carousel_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Hpp_Carousel");
		}
	public static List<HashMap<String, String>> Opt_Banner_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Opt_Banner");
		}
	public static List<HashMap<String, String>> Opt_Overview_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Opt_Overview");
		}
	public static List<HashMap<String, String>> Opt_Details_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Opt_Details");
		}
	public static List<HashMap<String, String>> Opt_Contacts_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Opt_Contacts");
		}
	public static List<HashMap<String, String>> Opt_Asset_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Opt_Asset");
		}
	public static List<HashMap<String, String>> Opt_Geo_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "Opt_Geo");
		}
	public static List<HashMap<String, String>> WCH_Details_data() {
		return (List<HashMap<String, String>>) ExcelReader.readExcelDatafromFile(
		"C:\\Users\\SanthoshNithyaR\\eclipse-workspace\\SalesEssentialAdmin\\src\\main\\java\\com\\utils\\SE_TestData.xlsx", "WCH_Details");
		}
}