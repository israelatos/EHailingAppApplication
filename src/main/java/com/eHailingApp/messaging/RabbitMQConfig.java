package com.eHailingApp.messaging;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.QueueBuilder;

@Configuration
@EnableRabbit
public class RabbitMQConfig {

    @Bean
    public TopicExchange messageExchange() {
        return new TopicExchange("MessageExchange");
    }

    @Bean
    public DirectExchange bookingDirectExchange() {
        return new DirectExchange("BookingExchange");
    }

    @Bean
    public Queue messageAuditQueue() {
        return new Queue("MessageAuditQueue");
    }

    // Define other queues here...

    @Bean
    public Binding binding() {
        return BindingBuilder.bind(messageAuditQueue()).to(messageExchange()).with("message.#");
    }

    @Bean
    public Exchange bookingExchange() {
        return ExchangeBuilder.directExchange("BookingExchange").build();
    }

    @Bean
    public Queue bookingAddQueue() {
        return QueueBuilder.durable("BookingAddQueue").build();
    }

    @Bean
    public Binding bookingAddBinding(Queue bookingAddQueue, Exchange bookingExchange) {
        return BindingBuilder.bind(bookingAddQueue).to(bookingExchange).with("booking.add").noargs();
    }

    @Bean
    public Queue bookingEditQueue() {
        return QueueBuilder.durable("BookingEditQueue").build();
    }

    @Bean
    public Binding bookingEditBinding(Queue bookingEditQueue, Exchange bookingExchange) {
        return BindingBuilder.bind(bookingEditQueue).to(bookingExchange).with("booking.edit");
    }

    // Define beans for bookingDeleteQueue and bookingDeleteBinding similarly

    // Define other bindings here...
}
