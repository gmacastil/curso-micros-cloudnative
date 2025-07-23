package com.example.rabbit.infraestructure.rabbit.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.example.rabbit.domain.Mensaje;

@Service
public class Consumer {

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void receiveMessage(String message) {
        // logica de negocio
        // ...
        System.out.println("Message received from RabbitMQ: " + message);
    }
    

    @RabbitListener(queues = {"${rabbitmq.queue.json.name}"})
    public void consumeJsonMessage(Mensaje message ) {
        // logica de negocio
        // ...
        System.out.println("Message received from RabbitMQ: " + message.toString());
    }
}
