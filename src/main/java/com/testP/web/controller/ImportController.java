package com.testP.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testP.service.EmployeeDataService;
import com.testP.web.model.APIResponseModel;

@RestController
@RequestMapping("/import")
public class ImportController {

	@Autowired
	private EmployeeDataService employeeDataService;

	@GetMapping("/all")
	public APIResponseModel importFromCSVToDatabase() {
		Boolean result = employeeDataService.importAndSaveEmployeeDataToDB();
		if (result) {
			return APIResponseModel.success("Data imported from CSV File to Database is successful");
		} else {
			return APIResponseModel.error("Data imported from CSV File to Database is failed");
		}
	}
}
