package com.example.rabbit.infraestructure.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rabbit.domain.Mensaje;
import com.example.rabbit.infraestructure.rabbit.Productor;

@RestController
public class RabbitController {

    private Productor rabbitMQProducer;

    public RabbitController(Productor rabbitMQProducer) {
        this.rabbitMQProducer = rabbitMQProducer;
    }

    @GetMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message) {
        rabbitMQProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to RabbitMQ type String.");
    }

    @GetMapping("/sendjson")
    public ResponseEntity<String> sendMessageJson(@RequestBody Mensaje message) {
        rabbitMQProducer.sendMessageJson(message);
        return ResponseEntity.ok("Message sent to RabbitMQ type json");
    }
    
}
