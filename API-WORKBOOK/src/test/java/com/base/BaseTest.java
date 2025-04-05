package com.base;

import config.ConfigReader;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	protected RequestSpecification request;

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = ConfigReader.getBaseUrl();
        request = RestAssured
                    .given()
                    .header("Content-Type", "application/json");
    }
	
	

}
