package com.cordilleracoffee.orderquery.application.impl;


import com.cordilleracoffee.orderquery.application.FindOrderService;
import com.cordilleracoffee.orderquery.application.repository.OrderRepository;
import com.cordilleracoffee.orderquery.domain.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FindOrderServiceImpl implements FindOrderService {


    private final OrderRepository orderRepository;

    @Override
    public Order findOrder(UUID orderId) {
        return orderRepository.findById(orderId).orElse(null);
    }
}
