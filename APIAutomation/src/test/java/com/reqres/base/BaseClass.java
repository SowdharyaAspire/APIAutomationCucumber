package com.reqres.base;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	private Response response;
	private RequestSpecification request;

	public RequestSpecification restAssuredInit() {
		return request = RestAssured.given();
	}

	public RequestSpecification addHeader(String key, String value) {
		return request = request.header(key, value);
	}

	public Response addMethodType(String methodName, String url) {
		switch (methodName) {
		case "GET":
			response = request.get(url);
			break;
		case "PUT":
			response = request.put(url);
			break;
		case "POST":
			response = request.post(url);
			break;
		case "PATCH":
			response = request.patch(url);
			break;
		case "DELETE":
			response = request.delete(url);
			break;
		}
		return response;
	}

	public int getStatusCode() {
		int statusCode = response.getStatusCode();
		return statusCode;
	}
}
