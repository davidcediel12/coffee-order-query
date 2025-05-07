package com.cordilleracoffee.orderquery.infrastructure.messaging.client.product.dto;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum OrderEvent {

    ORDER_CREATED;

    @JsonCreator
    public static OrderEvent fromValue(String value) {
        try {
            return OrderEvent.valueOf(value);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
