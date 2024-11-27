package com.ip_api.client;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GeoLocationApiClient {

    public static Response getGeoLocationResponse(String url) {
        return RestAssured.given()
                .filter(new AllureRestAssured())
                .log().uri()
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .extract()
                .response();
    }
}

