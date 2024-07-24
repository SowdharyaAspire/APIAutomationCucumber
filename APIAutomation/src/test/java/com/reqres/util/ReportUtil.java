package com.reqres.util;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;

import io.cucumber.java.After;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import java.io.File;
import java.io.FileNotFoundException;

public class ReportUtil {

	@AfterClass
	void generateReport() throws FileNotFoundException {
		String projName = "ReqResRegression";

		File reportDirectory = new File(System.getProperty("user.dir") + "/target/reports");
		List<String> jsonFiles = new ArrayList<>();
		jsonFiles.add("/target/reports/cucumber.json");

		Configuration config = new Configuration(reportDirectory, projName);
		config.addClassifications("Platform", "windows");
		config.addClassifications("Browser", "Chrome");

		ReportBuilder report = new ReportBuilder(jsonFiles, config);
		Reportable result = report.generateReports();

	}
}
