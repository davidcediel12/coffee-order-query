package com.cordilleracoffee.orderquery.application.repository;

import com.cordilleracoffee.orderquery.domain.model.Order;

import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {

    Order save(Order order);
    Optional<Order> findById(UUID orderId);
}
