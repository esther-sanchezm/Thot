package com.thot.repository.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//TODO 30/08/2021 : MongoDB embbed database
@Configuration
@EnableMongoRepositories(basePackages = "com.thot.repository")
public class MongoConfig {

}
