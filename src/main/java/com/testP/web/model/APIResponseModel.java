package com.testP.web.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class APIResponseModel {

	@JsonProperty("success")
	Boolean success;

	@JsonProperty("message")
	String message;

	@JsonProperty("body")
	Object body;

	@JsonProperty("failCode")
	Integer failureCode;
	
	public static APIResponseModel error(String message) {
		APIResponseModel apiResponseModel = new APIResponseModel();
		apiResponseModel.setSuccess(false);
		apiResponseModel.setMessage(message);
		return apiResponseModel;
	}

	public static APIResponseModel successMessage(String message) {
		APIResponseModel apiResponseModel = new APIResponseModel();
		apiResponseModel.setSuccess(true);
		apiResponseModel.setMessage(message);
		return apiResponseModel;
	}

	public static APIResponseModel success(Object body) {
		APIResponseModel apiResponseModel = new APIResponseModel();
		apiResponseModel.setSuccess(true);
		apiResponseModel.setBody(body);
		return apiResponseModel;
	}

	public static APIResponseModel success(String message, Object body) {
		APIResponseModel apiResponseModel = new APIResponseModel();
		apiResponseModel.setSuccess(true);
		apiResponseModel.setMessage(message);
		apiResponseModel.setBody(body);
		return apiResponseModel;
	}
}
