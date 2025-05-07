package com.cordilleracoffee.orderquery.infrastructure.messaging.client.product.dto;


import com.fasterxml.jackson.databind.JsonNode;

public record OrderMessage(OrderEvent orderEvent, JsonNode content) {
}
