package com.cordilleracoffee.orderquery.application.mapper;

import com.cordilleracoffee.orderquery.domain.model.Order;
import com.cordilleracoffee.orderquery.infrastructure.messaging.client.product.dto.OrderDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper {


    Order toDomain(OrderDto orderDto);
}
