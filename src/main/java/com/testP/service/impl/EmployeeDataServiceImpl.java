package com.testP.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.testP.data.model.EmployeeData;
import com.testP.data.repo.EmployeeDataRepository;
import com.testP.service.EmployeeDataService;

@Service
public class EmployeeDataServiceImpl implements EmployeeDataService {

	@Autowired
	private EmployeeDataRepository employeeDataRepository;

	@Override
	public List<EmployeeData> getAllEmployeeData() {
		return employeeDataRepository.findAll();
	}

	String line = "";

	@Override
	public Boolean importAndSaveEmployeeDataToDB() {
		Boolean result = false;
		try {
			BufferedReader br = new BufferedReader(
					new FileReader("src/main/resources/import/CompanyA/EmployeeData_CompanyA.csv"));
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				EmployeeData emp = new EmployeeData();
				emp.setId(data[0]);
				emp.setName(data[1]);
				emp.setRole(data[2]);
				String strExp = data[3];
				Double doubleExp = Double.parseDouble(strExp);
				emp.setExperience(doubleExp);
				employeeDataRepository.save(emp);
				result = true;
				return result;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Boolean exportDataToCSVFile(HttpServletResponse response) throws Exception {
		Boolean result = true;
		// set file name and content type
		String filename = "src/main/resources/exmport/CompanyA/EmployeeData_CompanyA.csv";

		response.setContentType("text/csv");
		response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + filename + "\"");
		// create a csv writer
		StatefulBeanToCsv<EmployeeData> writer = new StatefulBeanToCsvBuilder<EmployeeData>(response.getWriter())
				.withQuotechar(CSVWriter.NO_QUOTE_CHARACTER).withSeparator(CSVWriter.DEFAULT_SEPARATOR)
				.withOrderedResults(false).build();
		// write all employees data to csv file
		List<EmployeeData> empDataList = getAllEmployeeData();
		if (CollectionUtils.isEmpty(empDataList)) {
			return result = false;
		} else {
			writer.write(empDataList);
		}
		return result;
	}
}
