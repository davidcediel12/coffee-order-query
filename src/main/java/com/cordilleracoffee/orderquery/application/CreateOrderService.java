package com.cordilleracoffee.orderquery.application;

import com.cordilleracoffee.orderquery.infrastructure.messaging.client.product.dto.OrderDto;

public interface CreateOrderService {
    void createOrder(OrderDto order);
}
