package com.cordilleracoffee.orderquery.infrastructure.persistence.repository.impl;


import com.cordilleracoffee.orderquery.application.repository.OrderRepository;
import com.cordilleracoffee.orderquery.domain.model.Order;
import com.cordilleracoffee.orderquery.infrastructure.persistence.repository.OrderMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Repository
@Transactional(propagation = Propagation.MANDATORY)
@RequiredArgsConstructor
public class OrderRepositoryImpl implements OrderRepository {


    private final OrderMongoRepository orderMongoRepository;


    @Override
    public Order save(Order order) {
        return orderMongoRepository.save(order);
    }

    @Override
    public Optional<Order> findById(UUID orderId) {
        return orderMongoRepository.findById(orderId);
    }
}
