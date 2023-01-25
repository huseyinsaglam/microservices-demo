package com.microservices.demo.twitter.to.kafka.service.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Configuration
@ConfigurationProperties(prefix = "twitter-to-kafka-service")
public class TwitterToKafkaServiceConfigData {

    // twitter-keywords eslemesi
    private List<String> twitterKeywords;
}
