package com.cordilleracoffee.orderquery.infrastructure.messaging.client.product;

import com.cordilleracoffee.orderquery.infrastructure.messaging.client.product.dto.OrderMessage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class ProductListener {


    private final ObjectMapper objectMapper;

    @KafkaListener(groupId = "order", topics = "checkout")
    public void consume(GenericMessage<String> message) {
        log.info("Received Message from order topic: {}", message.getPayload());

        try {
            OrderMessage orderMessage = objectMapper.readValue(message.getPayload(), OrderMessage.class);

            if (orderMessage.orderEvent() == null) {
                return;
            }

            switch (orderMessage.orderEvent()){
                case ORDER_CREATED -> log.info("Received Order Created: {}", orderMessage);
            }



        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
