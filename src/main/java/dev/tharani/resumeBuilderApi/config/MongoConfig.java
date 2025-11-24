package dev.tharani.resumeBuilderApi.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@Configuration
@EnableMongoAuditing
public class MongoConfig {
}
//the above configuration will automatically manage @LastModifiedDate @CreatedDate in USER collecction
