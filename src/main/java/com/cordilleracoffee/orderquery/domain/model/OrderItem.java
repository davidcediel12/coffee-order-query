package com.cordilleracoffee.orderquery.domain.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class OrderItem {

    @Id
    private UUID id;
    private Long productId;
    private Long variantId;
    private Long categoryId;
    private Integer quantity;
    private BigDecimal unitPrice;
    private UUID discountId;
    private String name;
    private String description;
    private String sku;
    private String imageUrl;
    private Boolean isVariant;
}
