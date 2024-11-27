package com.ip_api.steps;

import com.ip_api.dto.GeoLocationResponse;
import com.ip_api.enums.Country;
import io.restassured.response.Response;

import static com.ip_api.enums.ServerStatus.SUCCESS;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NtpServerStep {

    public static void checkServerStatus(Response response) {
        var status = response.jsonPath().getString("status");
        var statusOnResponse = status.equalsIgnoreCase(SUCCESS.getStatus());
        assertTrue(statusOnResponse, String.format("Status on response: %s but we expect %s",
                status.toUpperCase(), SUCCESS.getStatus().toUpperCase()));
    }

    public static void checkServerCountry(Response response, Country country) {
        var actualCountry = response.as(GeoLocationResponse.class).getCountry();

        assertEquals(country.getCountry(), actualCountry,
                "The server is not located in " + country.getCountry());
    }
}
