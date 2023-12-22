package com.serviceexample.springserviceunddata;

public record Product(
        String id,
        String name,
        double price,
        long createdAt
) {
}
