package com.cordilleracoffee.orderquery.domain.model;

import com.cordilleracoffee.orderquery.infrastructure.messaging.client.product.dto.OrderItemDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Document
public class Order {
    @Id
    private UUID id;
    private UUID paymentId;
    private String paymentStatus;
    private UUID cartId;
    private String userId;
    private String currency;
    private BigDecimal price;
    private Set<OrderItemDto> orderItems;
}
