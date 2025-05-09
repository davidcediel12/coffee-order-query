package com.cordilleracoffee.orderquery.infrastructure.api.controller.dto;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

public record OrderDto(
        UUID id,
        UUID paymentId,
        String paymentStatus,
        UUID cartId,
        String userId,
        String currency,
        BigDecimal price,
        Set<OrderItemDto> orderItems
) {
}
