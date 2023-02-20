package com.testP.data.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class APIResponse {

	@JsonProperty("success")
	Boolean success;

	@JsonProperty("ErrorMessage")
	String ErrorMessage = "";

	@JsonProperty("body")
	Object body;

	public static APIResponse error(String message) {
		APIResponse apiResponse = new APIResponse();
		apiResponse.setSuccess(false);
		apiResponse.setErrorMessage(message);
		return apiResponse;
	}

	public static APIResponse success(Object body) {
		APIResponse apiResponse = new APIResponse();
		apiResponse.setSuccess(true);
		apiResponse.setErrorMessage("");
		apiResponse.setBody(body);
		return apiResponse;
	}

}
