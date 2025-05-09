package com.cordilleracoffee.orderquery.infrastructure.api.controller.mapper;

import com.cordilleracoffee.orderquery.domain.model.Order;
import com.cordilleracoffee.orderquery.infrastructure.api.controller.dto.OrderDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ApiOrderMapper {


    OrderDto toDto(Order order);
}
