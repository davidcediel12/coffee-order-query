package com.cordilleracoffee.orderquery.application.impl;

import com.cordilleracoffee.orderquery.application.CreateOrderService;
import com.cordilleracoffee.orderquery.application.mapper.OrderMapper;
import com.cordilleracoffee.orderquery.application.repository.OrderRepository;
import com.cordilleracoffee.orderquery.domain.model.Order;
import com.cordilleracoffee.orderquery.infrastructure.messaging.client.product.dto.OrderDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class CreateOrderServiceImpl implements CreateOrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    public void createOrder(OrderDto order) {
        Order domainOrder = orderMapper.toDomain(order);
        orderRepository.save(domainOrder);

        log.info("Order {} was successfully created", domainOrder.getId());

    }
}
