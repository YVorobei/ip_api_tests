package com.ip_api.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ServerStatus {
        SUCCESS("success"),
        FAIL("fail");

        private final String status;
}
