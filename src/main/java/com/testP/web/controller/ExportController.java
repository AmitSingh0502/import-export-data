package com.testP.web.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testP.service.EmployeeDataService;
import com.testP.web.model.APIResponseModel;

@RestController
@RequestMapping("/export")
public class ExportController {

	@Autowired
	private EmployeeDataService employeeDataService;

	@GetMapping("/all")
	public APIResponseModel exportFromDatabaseToCSVFile(HttpServletResponse response) throws Exception {
		Boolean result = employeeDataService.exportDataToCSVFile(response);
		if (result) {
			return APIResponseModel.success("Data imported from CSV File to Database is successful");
		} else {
			return APIResponseModel.error("Data imported from CSV File to Database is failed");
		}
	}
}
