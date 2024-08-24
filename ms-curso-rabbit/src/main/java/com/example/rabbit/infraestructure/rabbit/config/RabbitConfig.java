package com.example.rabbit.infraestructure.rabbit.config;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    @Value("${rabbitmq.queue.name}")
    private String queue;

    @Value("${rabbitmq.queue.json.name}")
    private String jsonQueue;

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    @Value("${rabbitmq.routing.json.key}")
    private String routingJsonKey;

    /**
     * Bean for rabbitmq queue
     *
     * @return New Queue
     */
    @Bean
    public Queue queue() {
        return new Queue(queue);
    }

    /**
     * Bean for rabbitmq queue of json
     *
     * @return New Queue
     */
    @Bean
    public Queue jsonQueue() {
        return new Queue(jsonQueue);
    }

    /**
     * Bean for rabbitmq exchange
     *
     * @return New TopicExchange
     */
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(exchange);
    }

    /**
     * Binding between queue and exchange using routing key
     *
     * @return Binding
     */
    @Bean
    public Binding binding() {
        return BindingBuilder.bind(queue())
            .to(exchange())
            .with(routingKey);
    }

    /**
     * Binding between json queue and exchange using json routing key
     *
     * @return Binding
     */
    @Bean
    public Binding jsonBinding() {
        return BindingBuilder.bind(jsonQueue())
            .to(exchange())
            .with(routingJsonKey);
    }

    /**
     * Convert message to json
     *
     * @return Json Message Converter
     */
    @Bean
    public MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    /**
     * Template for convert the message
     *
     * @param connectionFactory
     * @return rabbitTemplate
     */
    @Bean
    public AmqpTemplate amqpTemplate(ConnectionFactory connectionFactory) {
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter());
        return rabbitTemplate;
    }
}
