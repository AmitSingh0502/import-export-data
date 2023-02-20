package com.testP.service;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.testP.data.model.LoginInfo;

public interface LoginInfoService {

	Boolean importAndSaveLoginInfoToDB();

	List<LoginInfo> getAllEmployeeData();

	Boolean exportDataToCSVFile(HttpServletResponse response) throws Exception;
}
