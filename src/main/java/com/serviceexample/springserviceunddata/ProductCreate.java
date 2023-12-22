package com.serviceexample.springserviceunddata;

import org.springframework.data.annotation.Id;

public record ProductCreate(
        @Id
        String id,
        String name,
        double price
) {
}
