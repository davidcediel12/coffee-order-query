package com.cordilleracoffee.orderquery.infrastructure.persistence.repository;

import com.cordilleracoffee.orderquery.domain.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface OrderMongoRepository extends MongoRepository<Order, UUID> {
}
