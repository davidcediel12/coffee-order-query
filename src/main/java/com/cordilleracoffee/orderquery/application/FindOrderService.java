package com.cordilleracoffee.orderquery.application;

import com.cordilleracoffee.orderquery.domain.model.Order;

import java.util.UUID;

public interface FindOrderService {
    Order findOrder(UUID orderId);
}
