package com.ip_api;

import com.ip_api.config.ConfigLoader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static com.ip_api.client.GeoLocationApiClient.getGeoLocationResponse;
import static com.ip_api.enums.Country.UA;
import static com.ip_api.steps.NtpServerStep.checkServerCountry;
import static com.ip_api.steps.NtpServerStep.checkServerStatus;

public class NtpServerTest {

    private static String apiEndpoint;
    private static List<String> ntpDomains;

    @BeforeAll
    public static void setup() {
        ConfigLoader configLoader = new ConfigLoader();
        apiEndpoint = configLoader.getApiEndpoint();
        ntpDomains = configLoader.getNtpDomains();
    }

    private static Stream<String> ntpDomainsProvider() {
        return ntpDomains.stream();
    }

    @DisplayName("Verify ntp server is in Ukraine")
    @ParameterizedTest
    @MethodSource("ntpDomainsProvider")
    public void verifyNtpServerIsInUkraineTest(String domain) {
        var url = apiEndpoint + domain;
        var response = getGeoLocationResponse(url);

        checkServerStatus(response);
        checkServerCountry(response, UA);
    }
}