package com.testP.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.testP.data.model.EmployeeData;

public interface EmployeeDataService {

	Boolean importAndSaveEmployeeDataToDB();

	List<EmployeeData> getAllEmployeeData();

	Boolean exportDataToCSVFile(HttpServletResponse response) throws Exception;
}
