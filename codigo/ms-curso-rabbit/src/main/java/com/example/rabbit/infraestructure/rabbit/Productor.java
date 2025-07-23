package com.example.rabbit.infraestructure.rabbit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.rabbit.domain.Mensaje;

@Service
public class Productor {

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    @Value("${rabbitmq.routing.json.key}")
    private String routingJsonKey;


    private RabbitTemplate rabbitTemplate;

    public Productor(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String text) {
        rabbitTemplate.convertAndSend(exchange, routingKey, text);
        System.out.println("Message sent to RabbitMQ type String.");
    }

    public void sendMessageJson(Mensaje json) {
        rabbitTemplate.convertAndSend(exchange, routingJsonKey, json);
        System.out.println("Message sent to RabbitMQ type json");
    }
}
