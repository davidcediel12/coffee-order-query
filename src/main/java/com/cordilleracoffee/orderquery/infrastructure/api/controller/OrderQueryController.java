package com.cordilleracoffee.orderquery.infrastructure.api.controller;


import com.cordilleracoffee.orderquery.application.FindOrderService;
import com.cordilleracoffee.orderquery.domain.model.Order;
import com.cordilleracoffee.orderquery.infrastructure.api.controller.dto.OrderDto;
import com.cordilleracoffee.orderquery.infrastructure.api.controller.mapper.ApiOrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/v1/order-query/orders")
@RequiredArgsConstructor
public class OrderQueryController {

    private final FindOrderService findOrderService;
    private final ApiOrderMapper apiOrderMapper;

    @GetMapping("/{id}")
    public ResponseEntity<OrderDto> findOrderById(@PathVariable UUID id) {
        Order order = findOrderService.findOrder(id);

        if(order == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(apiOrderMapper.toDto(order));
    }
}
