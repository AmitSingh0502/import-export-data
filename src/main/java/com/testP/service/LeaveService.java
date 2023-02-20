package com.testP.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.testP.data.model.Leave;

public interface LeaveService {

	Boolean importAndSaveLeaveToDB();

	List<Leave> getAllEmployeeData();

	Boolean exportDataToCSVFile(HttpServletResponse response) throws Exception;
}
