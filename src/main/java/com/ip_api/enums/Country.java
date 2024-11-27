package com.ip_api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Country {
        UA("Ukraine"),
        USA("United States Of America");

        private final String country;
}
