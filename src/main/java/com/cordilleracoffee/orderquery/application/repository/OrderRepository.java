package com.cordilleracoffee.orderquery.application.repository;

import com.cordilleracoffee.orderquery.domain.model.Order;

public interface OrderRepository {

    Order save(Order order);
}
