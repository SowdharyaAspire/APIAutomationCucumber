package com.reqres.stepdef;

import org.junit.Assert;
import com.reqres.base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class StepDefinitions extends BaseClass {
	Response response;
	

	@Given("User initialize Rest Assured")
	public void user_initialize_rest_assured() {
		restAssuredInit();
	}

	@When("User add header {string} and {string}")
	public void user_add_header_and(String key, String value) {
		addHeader(key, value);
	}

	@When("User call the {string} method with url {string}")
	public void user_call_the_method_with_url(String httpMethod, String url) {
		addMethodType(httpMethod, url);
	}

	@Then("verify status code is {int}")
	public void verify_status_code_is(Integer expectedstatusCode) {
		int actualStatusCode = getStatusCode();
		Assert.assertTrue(expectedstatusCode==actualStatusCode);
//		Assert.assertEquals(expectedstatusCode, actualStatusCode);--- it is deprecated and asks for Object Representation rather int or String
	}

}
