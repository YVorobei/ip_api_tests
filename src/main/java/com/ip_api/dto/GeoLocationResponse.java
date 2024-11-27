package com.ip_api.dto;

import lombok.Data;

@Data
public class GeoLocationResponse {
        String status;
        String country;
        String countryCode;
        String region;
        String regionName;
        String city;
        String zip;
        Double lat;
        Double lon;
        String timezone;
        String isp;
        String org;
        String as;
        String query;
        String message;
}
