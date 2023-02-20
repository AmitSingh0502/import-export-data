package com.testP.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.testP.data.model.LoginInfo;
import com.testP.service.LoginInfoService;

@Service
public class LoginInfoServiceImpl implements LoginInfoService {

	@Override
	public Boolean importAndSaveLoginInfoToDB() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoginInfo> getAllEmployeeData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean exportDataToCSVFile(HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
