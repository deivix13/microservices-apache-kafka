package com.deivix.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    /**
     * Define the Kafka topic used in the demo.
     * - 2 partitions allow parallel consumption.
     * - 1 replica is enough for local development.
     */
    @Bean
    public NewTopic transactionTopic() {
        return TopicBuilder.name("transaction-cool-topic")
                .partitions(2)
                .replicas(1)
                .build();
    }
}

